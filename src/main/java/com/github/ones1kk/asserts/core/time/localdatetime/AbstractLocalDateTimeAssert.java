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

package com.github.ones1kk.asserts.core.time.localdatetime;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.core.time.temporal.accessor.TemporalAccessorAssertInterface;

import java.time.LocalDateTime;

public class AbstractLocalDateTimeAssert<SELF extends AbstractLocalDateTimeAssert<SELF, ACTUAL>, ACTUAL extends LocalDateTime> extends AbstractObjectAssert<SELF, ACTUAL> implements TemporalAccessorAssertInterface<SELF, ACTUAL> {

    private final LocalDateTimesInterface<LocalDateTime> localDateTimes;

    public AbstractLocalDateTimeAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.localDateTimes = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isBefore(ACTUAL expected) {
        localDateTimes.assertIsBefore(actual, expected);
        return self;
    }

    @Override
    public SELF isBeforeOrEqualTo(ACTUAL expected) {
        localDateTimes.assertIsBeforeOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isAfter(ACTUAL expected) {
        localDateTimes.assertIsAfter(actual, expected);
        return self;
    }

    @Override
    public SELF isAfterOrEqualTo(ACTUAL expected) {
        localDateTimes.assertIsAfterOrEqualTo(actual, expected);
        return self;
    }
}
