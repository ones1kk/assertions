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

package com.github.ones1kk.asserts.core.time.year;

import com.github.ones1kk.asserts.core.time.temporal.accessor.AbstractTemporalAccessorAssert;

import java.time.Year;

public class AbstractYearAssert<SELF extends AbstractYearAssert<SELF, ACTUAL>, ACTUAL> extends AbstractTemporalAccessorAssert<SELF, Year> implements YearAssertInterface<SELF> {

    private final YearsInterface years;

    public AbstractYearAssert(Class<?> self, Year actual) {
        super(self, actual);
        this.years = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isLeapYear() {
        years.assertIsLeapYear(actual);
        return self;
    }

    @Override
    public SELF isNotLeapYear() {
        years.assertIsNotLeapYear(actual);
        return self;
    }
}
