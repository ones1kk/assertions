/*
 * Copyright (c) 2022. Wonsik Kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.ones1kk.assertion.core.time.localdate;

import io.github.ones1kk.assertion.core.AbstractAssert;
import io.github.ones1kk.assertion.core.time.temporal.TemporalAccessorAssertion;
import io.github.ones1kk.assertion.core.time.year.YearAssertion;

import java.time.LocalDate;

/**
 * <strong> The AbstractLocalDateAssert class inherits {@link AbstractAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the LocalDate type and verify assertion.</p>
 */
public abstract class AbstractLocalDateAssert extends AbstractAssert<AbstractLocalDateAssert, LocalDate> implements TemporalAccessorAssertion<AbstractLocalDateAssert, LocalDate>, YearAssertion<AbstractLocalDateAssert> {

    private final LocalDatesAssertion localDates;

    public AbstractLocalDateAssert(Class<?> self, LocalDate actual) {
        super(self, actual);
        this.localDates = new LocalDates();
    }

    /**
     * verify {@code actual} is before than {@code expected}.
     *
     * @param expected after than {@code actual}
     * @return {@code self}
     */
    @Override
    public AbstractLocalDateAssert isBefore(LocalDate expected) {
        localDates.assertBefore(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is before than or equal to {@code expected}.
     *
     * @param expected after than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public AbstractLocalDateAssert isBeforeOrEqualTo(LocalDate expected) {
        localDates.assertBeforeOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is after than {@code expected}.
     *
     * @param expected before than {@code actual}
     * @return {@code self}
     */
    @Override
    public AbstractLocalDateAssert isAfter(LocalDate expected) {
        localDates.assertAfter(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is after than or equal to {@code expected}.
     *
     * @param expected before than {@code actual}
     * @return {@code self}
     */
    @Override
    public AbstractLocalDateAssert isAfterOrEqualTo(LocalDate expected) {
        localDates.assertAfterOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is leap year.
     *
     * @return {@code self}
     */
    @Override
    public AbstractLocalDateAssert isLeapYear() {
        localDates.assertLeapYear(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not leap year.
     *
     * @return {@code self}
     */
    @Override
    public AbstractLocalDateAssert isNotLeapYear() {
        localDates.assertNotLeapYear(info, actual);
        return self;
    }
}
