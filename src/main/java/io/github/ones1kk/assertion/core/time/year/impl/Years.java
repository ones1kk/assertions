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

package io.github.ones1kk.assertion.core.time.year.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import io.github.ones1kk.assertion.core.message.YearErrorMessages;
import io.github.ones1kk.assertion.core.time.year.YearsInterface;

import java.time.Year;

/**
 * <strong> The Years class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Years extends Objects<Year> implements YearsInterface {

    public Years(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsLeapYear(Year actual) {
        if (!actual.isLeap()) {
            handler.receive(actual, YearErrorMessages.shouldBeLeapYear(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotLeapYear(Year actual) {
        if (actual.isLeap()) {
            handler.receive(actual, YearErrorMessages.shouldNotBeLeapYear(actual));
            throw handler.getException();
        }
    }
}
