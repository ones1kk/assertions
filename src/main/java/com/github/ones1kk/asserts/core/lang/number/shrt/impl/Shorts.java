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

package com.github.ones1kk.asserts.core.lang.number.shrt.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.lang.ComparableLanguage;
import com.github.ones1kk.asserts.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.number.shrt.ShortsInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.message.NumerableErrorMessages;

import static com.github.ones1kk.asserts.core.feature.number.arithmetic.NumerableUnit.of;
import static com.github.ones1kk.asserts.core.message.ComparableErrorMessages.*;
import static com.github.ones1kk.asserts.core.message.DataErrorMessages.shouldBeCloseTo;
import static com.github.ones1kk.asserts.core.message.IntegersErrorMessages.*;

/**
 * <strong> The Shorts class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public final class Shorts extends Objects<Short> implements ShortsInterface<Short> {

    private final ComparableLanguage<Short> comparable = new ComparableLanguageImpl<>();

    public Shorts(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Short actual) {
        if (of(actual).isEven()) {
            handler.receive(actual, shouldBeOdd(actual));
            handler.setDescription(handler.from(actual, "{} is not odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Short actual) {
        if (of(actual).isOdd()) {
            handler.receive(actual, shouldNotBeOdd(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Short actual) {
        if (of(actual).isOdd()) {
            handler.receive(actual, shouldBeEven(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Short actual) {
        if (of(actual).isEven()) {
            handler.receive(actual, shouldNotBeEven(actual));
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
        if (of(actual).isNotZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Short actual) {
        if (of(actual).isZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Short actual, Short expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Short actual, Short expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Short actual, Short expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Short actual, Short expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Short actual, Short start, Short end) {
        if (comparable.isLessThan(actual, start) || comparable.isGraterThan(actual, end)) {
            handler.receive(actual, shouldBeBetween(actual, start, end));
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
        handler.receive(actual, shouldBeCloseTo(actual, offset.getBefore(actual), offset.getAfter(actual)));
        throw handler.getException();
    }

    private void setAssertClose(Short actual, Percentage<Short> percentage) {
        handler.receive(actual, shouldBeCloseTo(actual, percentage.getStartingRange(), percentage.getEndingRange()));
        throw handler.getException();
    }
}
