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

package io.github.ones1kk.assertion.core.time.temporal.accessor.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.feature.comparable.temporal.accessor.ComparableTemporalAccessor;
import io.github.ones1kk.assertion.core.feature.comparable.temporal.accessor.impl.ComparableTemporalAccessorImpl;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import io.github.ones1kk.assertion.core.message.TemporalErrorMessages;
import io.github.ones1kk.assertion.core.time.temporal.accessor.TemporalAccessorsInterface;

import java.time.temporal.TemporalAccessor;

public final class TemporalAccessors<ACTUAL extends TemporalAccessor & Comparable<ACTUAL>> extends Objects<ACTUAL> implements TemporalAccessorsInterface<ACTUAL> {

    private final ComparableTemporalAccessor<ACTUAL> comparable = new ComparableTemporalAccessorImpl<>();

    public TemporalAccessors(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsBefore(ACTUAL actual, ACTUAL expected) {
        if (comparable.isAfterOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, TemporalErrorMessages.shouldBeBefore(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBeforeOrEqualTo(ACTUAL actual, ACTUAL expected) {
        if (comparable.isAfter(actual, expected)) {
            handler.receive(actual, expected, TemporalErrorMessages.shouldBeBeforeOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAfter(ACTUAL actual, ACTUAL expected) {
        if (comparable.isBeforeOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, TemporalErrorMessages.shouldBeAfter(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAfterOrEqualTo(ACTUAL actual, ACTUAL expected) {
        if (comparable.isBefore(actual, expected)) {
            handler.receive(actual, expected, TemporalErrorMessages.shouldBeAfterOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }
}
