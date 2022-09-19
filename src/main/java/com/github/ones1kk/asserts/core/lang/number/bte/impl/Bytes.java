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

package com.github.ones1kk.asserts.core.lang.number.bte.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.lang.ComparableLanguage;
import com.github.ones1kk.asserts.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.number.bte.BytesInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.message.NumerableErrorMessages;

import static com.github.ones1kk.asserts.core.feature.number.arithmetic.NumerableUnit.of;
import static com.github.ones1kk.asserts.core.message.ComparableErrorMessages.*;
import static com.github.ones1kk.asserts.core.message.DataErrorMessages.shouldBeCloseTo;
import static com.github.ones1kk.asserts.core.message.IntegersErrorMessages.*;

/**
 * <strong> The Bytes class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public final class Bytes extends Objects<Byte> implements BytesInterface<Byte> {

    private final ComparableLanguage<Byte> comparable = new ComparableLanguageImpl<>();

    public Bytes(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Byte actual) {
        if (of(actual).isEven()) {
            handler.receive(actual, shouldBeOdd(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Byte actual) {
        if (of(actual).isOdd()) {
            handler.receive(actual, shouldNotBeOdd(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Byte actual) {
        if (of(actual).isOdd()) {
            handler.receive(actual, shouldBeEven(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Byte actual) {
        if (of(actual).isEven()) {
            handler.receive(actual, shouldNotBeEven(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Byte actual) {
        if (comparable.isLessThanOrEqualTo(actual, (byte) 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Byte actual) {
        if (comparable.isGraterThan(actual, (byte) 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Byte actual) {
        if (comparable.isGraterThanOrEqualTo(actual, (byte) 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Byte actual) {
        if (comparable.isLessThan(actual, (byte) 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Byte actual) {
        if (of(actual).isNotZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Byte actual) {
        if (of(actual).isZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Byte actual, Byte expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Byte actual, Byte expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Byte actual, Byte expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Byte actual, Byte expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Byte actual, Byte start, Byte end) {
        if (comparable.isLessThan(actual, start) || comparable.isGraterThan(actual, end)) {
            handler.receive(actual, shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Byte actual, Byte expected, Offset<Byte> offset) {
        if (!offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsCloseTo(Byte actual, Byte expected, Percentage<Byte> percentage) {
        if (!percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    @Override
    public void assertIsNotCloseTo(Byte actual, Byte expected, Offset<Byte> offset) {
        if (offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Byte actual, Byte expected, Percentage<Byte> percentage) {
        if (percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    private void setAssertClose(Byte actual, Offset<Byte> offset) {
        handler.receive(actual, shouldBeCloseTo(actual, offset.getBefore(actual), offset.getAfter(actual)));
        throw handler.getException();
    }

    private void setAssertClose(Byte actual, Percentage<Byte> percentage) {
        handler.receive(actual, shouldBeCloseTo(actual, percentage.getStartingRange(), percentage.getEndingRange()));
        throw handler.getException();
    }
}
