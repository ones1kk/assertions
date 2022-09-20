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

package io.github.ones1kk.asserts.core.time.monthday;

import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.asserts.core.time.temporal.accessor.AbstractTemporalAccessorAssert;

import java.time.MonthDay;

/**
 * <strong> The AbstractMonthDayAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the MonthDay type and verify assertion.</p>
 *
 * @param <SELF> {@code self}.
 */
public class AbstractMonthDayAssert<SELF extends AbstractMonthDayAssert<SELF, ACTUAL>, ACTUAL> extends AbstractTemporalAccessorAssert<SELF, MonthDay> {

    public AbstractMonthDayAssert(Class<?> self, MonthDay monthDay) {
        super(self, monthDay);
    }
}
