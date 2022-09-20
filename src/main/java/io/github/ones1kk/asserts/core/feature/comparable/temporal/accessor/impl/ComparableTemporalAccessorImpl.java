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

package io.github.ones1kk.asserts.core.feature.comparable.temporal.accessor.impl;

import io.github.ones1kk.asserts.core.feature.comparable.temporal.accessor.ComparableTemporalAccessor;

import java.time.temporal.TemporalAccessor;

/**
 * <strong> The ComparableTemporalAccessorImpl is an implementation class that compares TemporalAccessor that inherits {@link Comparable} type.</strong>
 *
 * @param <ACTUAL>
 */
public final class ComparableTemporalAccessorImpl<ACTUAL extends TemporalAccessor & Comparable<ACTUAL>> implements ComparableTemporalAccessor<ACTUAL> {

    @Override
    public boolean isBefore(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isBeforeOrEqualTo(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isAfter(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean isAfterOrEqualTo(ACTUAL actual, ACTUAL expected) {
        return actual.compareTo(expected) >= 0;
    }
}
