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

package io.github.ones1kk.assertion.core.lang.number.duble.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import io.github.ones1kk.assertion.core.feature.data.Offset;
import io.github.ones1kk.assertion.core.feature.data.Percentage;
import io.github.ones1kk.assertion.core.lang.number.duble.DoublesInterface;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import io.github.ones1kk.assertion.core.message.ComparableErrorMessages;
import io.github.ones1kk.assertion.core.message.DoublesErrorMessages;
import io.github.ones1kk.assertion.core.message.NumerableErrorMessages;

import static io.github.ones1kk.assertion.core.feature.number.arithmetic.NumerableUnit.of;
import static io.github.ones1kk.assertion.core.message.DataErrorMessages.shouldBeCloseTo;

/**
 * <strong> The Doubles class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Doubles extends Objects<Double> implements DoublesInterface<Double> {

    private final ComparableLanguage<Double> comparable = new ComparableLanguageImpl<>();

    public Doubles(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsInfinity(Double actual) {
        if (!Double.isInfinite(actual)) {
            handler.receive(actual, DoublesErrorMessages.shouldBeInfinity(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsFinite(Double actual) {
        if (!Double.isFinite(actual)) {
            handler.receive(actual, DoublesErrorMessages.shouldBeFinite(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNaN(Double actual) {
        if (!Double.isNaN(actual)) {
            handler.receive(actual, DoublesErrorMessages.shouldBeNaN(actual));
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
        if (comparable.isGreaterThan(actual, 0.0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Double actual) {
        if (comparable.isGreaterThanOrEqualTo(actual, 0.0)) {
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
        if (comparable.isGreaterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Double actual, Double expected) {
        if (comparable.isGreaterThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Double actual, Double expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Double actual, Double expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Double actual, Double start, Double end) {
        if (comparable.isLessThan(actual, start) || comparable.isGreaterThan(actual, end)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeBetween(actual, start, end));
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
