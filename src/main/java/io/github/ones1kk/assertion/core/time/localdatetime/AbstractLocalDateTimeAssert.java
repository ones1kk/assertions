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

package io.github.ones1kk.assertion.core.time.localdatetime;

import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.time.temporal.TemporalAccessorAssertion;

import java.time.LocalDateTime;

/**
 * <strong> The AbstractLocalDateTimeAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the LocalDateTime type and verify assertion.</p>
 */
public class AbstractLocalDateTimeAssert extends AbstractObjectAssert<AbstractLocalDateTimeAssert, LocalDateTime> implements TemporalAccessorAssertion<AbstractLocalDateTimeAssert, LocalDateTime> {

    private final LocalDateTimesAssertions localDateTimes;

    public AbstractLocalDateTimeAssert(Class<?> self, LocalDateTime actual) {
        super(self, actual);
        this.localDateTimes = new LocalDateTimes();
    }

    /**
     * verify {@code actual} is before than {@code expected}.
     *
     * @param expected after than {@code actual}
     * @return {@code self}
     */
    @Override
    public AbstractLocalDateTimeAssert isBefore(LocalDateTime expected) {
        localDateTimes.assertBefore(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is before than or equal to {@code expected}.
     *
     * @param expected after than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public AbstractLocalDateTimeAssert isBeforeOrEqualTo(LocalDateTime expected) {
        localDateTimes.assertBeforeOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is after than {@code expected}.
     *
     * @param expected before than {@code actual}
     * @return {@code self}
     */
    @Override
    public AbstractLocalDateTimeAssert isAfter(LocalDateTime expected) {
        localDateTimes.assertIsAfter(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is after than or equal to {@code expected}.
     *
     * @param expected before than {@code actual}
     * @return {@code self}
     */
    @Override
    public AbstractLocalDateTimeAssert isAfterOrEqualTo(LocalDateTime expected) {
        localDateTimes.assertIsAfterOrEqualTo(info, actual, expected);
        return self;
    }
}
