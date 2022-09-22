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

package io.github.ones1kk.assertion.core.lang.string.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import io.github.ones1kk.assertion.core.lang.charsequence.impl.CharSequences;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.string.StringsInterface;
import io.github.ones1kk.assertion.core.message.ComparableErrorMessages;

/**
 * <strong> The Strings class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Strings extends CharSequences implements StringsInterface<String> {

    private final ComparableLanguage<String> comparable = new ComparableLanguageImpl<>();

    public Strings(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsLessThan(String actual, String expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(String actual, String expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(String actual, String expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(String actual, String expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(String actual, String start, String end) {
        if (comparable.isLessThan(actual, start) || comparable.isGraterThan(actual, end)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }
}
