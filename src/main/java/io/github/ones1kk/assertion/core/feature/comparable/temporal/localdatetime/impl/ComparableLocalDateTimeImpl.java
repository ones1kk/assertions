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

package io.github.ones1kk.assertion.core.feature.comparable.temporal.localdatetime.impl;

import io.github.ones1kk.assertion.core.feature.comparable.temporal.localdatetime.ComparableLocalDateTime;

import java.time.LocalDateTime;

/**
 * <strong> The ComparableLocalDateTimeImpl is an implementation class that compares LocalDateTime type.</strong>
 *
 * @param <ACTUAL> {@code actual}.
 */
public final class ComparableLocalDateTimeImpl<ACTUAL extends LocalDateTime> implements ComparableLocalDateTime<ACTUAL> {

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