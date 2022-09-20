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

package io.github.ones1kk.asserts.core.time.temporal.accessor;

import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.time.temporal.TemporalAccessor;

public abstract class AbstractTemporalAccessorAssert<SELF extends AbstractTemporalAccessorAssert<SELF, ACTUAL>, ACTUAL extends TemporalAccessor & Comparable<ACTUAL>> extends AbstractObjectAssert<SELF, ACTUAL> implements TemporalAccessorAssertInterface<SELF, ACTUAL> {

    private final TemporalAccessorsInterface<ACTUAL> temporals;

    public AbstractTemporalAccessorAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.temporals = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isBefore(ACTUAL expected) {
        temporals.assertIsBefore(actual, expected);
        return self;
    }

    @Override
    public SELF isBeforeOrEqualTo(ACTUAL expected) {
        temporals.assertIsBeforeOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isAfter(ACTUAL expected) {
        temporals.assertIsAfter(actual, expected);
        return self;
    }

    @Override
    public SELF isAfterOrEqualTo(ACTUAL expected) {
        temporals.assertIsAfterOrEqualTo(actual, expected);
        return self;
    }
}
