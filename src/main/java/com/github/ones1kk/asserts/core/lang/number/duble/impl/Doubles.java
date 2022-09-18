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

package com.github.ones1kk.asserts.core.lang.number.duble.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.lang.ComparableLanguage;
import com.github.ones1kk.asserts.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.number.duble.DoublesInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.message.NumerableErrorMessages;

import static com.github.ones1kk.asserts.core.feature.number.arithmetic.NumerableUnit.of;
import static com.github.ones1kk.asserts.core.message.ComparableErrorMessages.*;
import static com.github.ones1kk.asserts.core.message.DataErrorMessages.shouldBeCloseTo;
import static com.github.ones1kk.asserts.core.message.DoublesErrorMessages.*;

/**
 * <strong> The Doubles class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public final class Doubles extends Objects<Double> implements DoublesInterface<Double> {

    private final ComparableLanguage<Double> comparable = new ComparableLanguageImpl<>();

    public Doubles(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsInfinity(Double actual) {
        if (!Double.isInfinite(actual)) {
            handler.receive(actual, shouldBeInfinity(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsFinite(Double actual) {
        if (!Double.isFinite(actual)) {
            handler.receive(actual, shouldBeFinite(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNaN(Double actual) {
        if (!Double.isNaN(actual)) {
            handler.receive(actual, shouldBeNaN(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Double actual) {
        if (comparable.isLessThanOrEqualTo(actual, 0.0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Double actual) {
        if (comparable.isGraterThan(actual, 0.0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Double actual) {
        if (comparable.isGraterThanOrEqualTo(actual, 0.0)) {
            handler.receive(actual, NumerableErrorMessages.shouldBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Double actual) {
        if (comparable.isLessThan(actual, 0.0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Double actual) {
        if (of(actual).isNotZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Double actual) {
        if (of(actual).isZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Double actual, Double expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Double actual, Double expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Double actual, Double expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Double actual, Double expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Double actual, Double start, Double end) {
        if (comparable.isLessThan(actual, start) || comparable.isGraterThan(actual, end)) {
            handler.receive(actual, shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Double actual, Double expected, Offset<Double> offset) {
        if (!offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsCloseTo(Double actual, Double expected, Percentage<Double> percentage) {
        if (!percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    @Override
    public void assertIsNotCloseTo(Double actual, Double expected, Offset<Double> offset) {
        if (offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Double actual, Double expected, Percentage<Double> percentage) {
        if (percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    private void setAssertClose(Double actual, Offset<Double> offset) {
        handler.receive(actual, shouldBeCloseTo(actual, offset.getBefore(actual), offset.getAfter(actual)));
        throw handler.getException();
    }

    private void setAssertClose(Double actual, Percentage<Double> percentage) {
        handler.receive(actual, shouldBeCloseTo(actual, percentage.getStartingRange(), percentage.getEndingRange()));
        throw handler.getException();
    }
}
