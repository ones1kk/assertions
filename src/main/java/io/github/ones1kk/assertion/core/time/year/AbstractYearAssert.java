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

package io.github.ones1kk.assertion.core.time.year;

import io.github.ones1kk.assertion.core.time.temporal.AbstractTemporalAccessorAssert;

import java.time.Year;

/**
 * <strong> The AbstractYearAssert class inherits {@link AbstractTemporalAccessorAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Year type and verify assertion.</p>
 */
public class AbstractYearAssert extends AbstractTemporalAccessorAssert<AbstractYearAssert, Year> implements YearAssertion<AbstractYearAssert> {

    private final YearsAssertion<Year> years;

    public AbstractYearAssert(Class<?> self, Year actual) {
        super(self, actual);
        this.years = new Years();
    }

    /**
     * verify {@code actual} is leap year.
     *
     * @return {@code self}
     */
    @Override
    public AbstractYearAssert isLeapYear() {
        years.assertLeapYear(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not leap year.
     *
     * @return {@code self}
     */
    @Override
    public AbstractYearAssert isNotLeapYear() {
        years.assertNotLeapYear(info, actual);
        return self;
    }
}
