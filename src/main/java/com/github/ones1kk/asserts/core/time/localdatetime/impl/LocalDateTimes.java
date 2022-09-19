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

package com.github.ones1kk.asserts.core.time.localdatetime.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.temporal.localdatetime.ComparableLocalDateTime;
import com.github.ones1kk.asserts.core.feature.comparable.temporal.localdatetime.impl.ComparableLocalDateTimeImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.time.localdatetime.LocalDateTimesInterface;

import java.time.LocalDateTime;

import static com.github.ones1kk.asserts.core.message.TemporalErrorMessages.*;

/**
 * <strong> The LocalDateTimes class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public final class LocalDateTimes<ACTUAL extends LocalDateTime> extends Objects<LocalDateTime> implements LocalDateTimesInterface<ACTUAL> {

    private final ComparableLocalDateTime<ACTUAL> comparable = new ComparableLocalDateTimeImpl<>();

    public LocalDateTimes(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsBefore(ACTUAL actual, ACTUAL expected) {
        if (comparable.isAfterOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeBefore(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBeforeOrEqualTo(ACTUAL actual, ACTUAL expected) {
        if (comparable.isAfter(actual, expected)) {
            handler.receive(actual, expected, shouldBeBeforeOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAfter(ACTUAL actual, ACTUAL expected) {
        if (comparable.isBeforeOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeAfter(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAfterOrEqualTo(ACTUAL actual, ACTUAL expected) {
        if (comparable.isBefore(actual, expected)) {
            handler.receive(actual, expected, shouldBeAfterOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }
}
