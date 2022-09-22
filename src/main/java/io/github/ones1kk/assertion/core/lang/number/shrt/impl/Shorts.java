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

package io.github.ones1kk.assertion.core.lang.number.shrt.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import io.github.ones1kk.assertion.core.feature.data.Offset;
import io.github.ones1kk.assertion.core.feature.data.Percentage;
import io.github.ones1kk.assertion.core.feature.number.arithmetic.NumerableUnit;
import io.github.ones1kk.assertion.core.lang.number.shrt.ShortsInterface;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import io.github.ones1kk.assertion.core.message.ComparableErrorMessages;
import io.github.ones1kk.assertion.core.message.DataErrorMessages;
import io.github.ones1kk.assertion.core.message.IntegersErrorMessages;
import io.github.ones1kk.assertion.core.message.NumerableErrorMessages;

/**
 * <strong> The Shorts class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Shorts extends Objects<Short> implements ShortsInterface<Short> {

    private final ComparableLanguage<Short> comparable = new ComparableLanguageImpl<>();

    public Shorts(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Short actual) {
        if (NumerableUnit.of(actual).isEven()) {
            handler.receive(actual, IntegersErrorMessages.shouldBeOdd(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Short actual) {
        if (NumerableUnit.of(actual).isOdd()) {
            handler.receive(actual, IntegersErrorMessages.shouldNotBeOdd(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Short actual) {
        if (NumerableUnit.of(actual).isOdd()) {
            handler.receive(actual, IntegersErrorMessages.shouldBeEven(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Short actual) {
        if (NumerableUnit.of(actual).isEven()) {
            handler.receive(actual, IntegersErrorMessages.shouldNotBeEven(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Short actual) {
        if (comparable.isLessThanOrEqualTo(actual, (short) 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Short actual) {
        if (comparable.isGraterThan(actual, (short) 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Short actual) {
        if (comparable.isGraterThanOrEqualTo(actual, (short) 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Short actual) {
        if (comparable.isLessThan(actual, (short) 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Short actual) {
        if (NumerableUnit.of(actual).isNotZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Short actual) {
        if (NumerableUnit.of(actual).isZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Short actual, Short expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Short actual, Short expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Short actual, Short expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Short actual, Short expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Short actual, Short start, Short end) {
        if (comparable.isLessThan(actual, start) || comparable.isGraterThan(actual, end)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Short actual, Short expected, Offset<Short> offset) {
        if (!offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsCloseTo(Short actual, Short expected, Percentage<Short> percentage) {
        if (!percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    @Override
    public void assertIsNotCloseTo(Short actual, Short expected, Offset<Short> offset) {
        if (offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Short actual, Short expected, Percentage<Short> percentage) {
        if (percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    private void setAssertClose(Short actual, Offset<Short> offset) {
        handler.receive(actual, DataErrorMessages.shouldBeCloseTo(actual, offset.getBefore(actual), offset.getAfter(actual)));
        throw handler.getException();
    }

    private void setAssertClose(Short actual, Percentage<Short> percentage) {
        handler.receive(actual, DataErrorMessages.shouldBeCloseTo(actual, percentage.getStartingRange(), percentage.getEndingRange()));
        throw handler.getException();
    }
}
