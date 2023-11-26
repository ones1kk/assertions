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
package io.github.ones1kk.assertion.core.time.temporal;

import io.github.ones1kk.assertion.core.AbstractAssert;

import java.time.temporal.TemporalAccessor;

public abstract class AbstractTemporalAccessorAssert<SELF extends AbstractTemporalAccessorAssert<SELF, ACTUAL>, ACTUAL extends TemporalAccessor & Comparable<ACTUAL>> extends AbstractAssert<SELF, ACTUAL> implements TemporalAccessorAssertion<SELF, ACTUAL> {

    private final TemporalAccessorsAssertion<ACTUAL> temporalAccessors;

    public AbstractTemporalAccessorAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.temporalAccessors = new TemporalAccessors<>();
    }

    /**
     * verify {@code actual} is before than {@code expected}.
     *
     * @param expected after than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isBefore(ACTUAL expected) {
        temporalAccessors.assertBefore(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is before than or equal to {@code expected}.
     *
     * @param expected after than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isBeforeOrEqualTo(ACTUAL expected) {
        temporalAccessors.assertBeforeOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is after than {@code expected}.
     *
     * @param expected before than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isAfter(ACTUAL expected) {
        temporalAccessors.assertAfter(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is after than or equal to {@code expected}.
     *
     * @param expected before than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isAfterOrEqualTo(ACTUAL expected) {
        temporalAccessors.assertAfterOrEqualTo(info, actual, expected);
        return self;
    }
}
