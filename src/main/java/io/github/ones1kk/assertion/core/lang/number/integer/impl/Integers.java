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

package io.github.ones1kk.assertion.core.lang.number.integer.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import io.github.ones1kk.assertion.core.feature.data.Offset;
import io.github.ones1kk.assertion.core.feature.data.Percentage;
import io.github.ones1kk.assertion.core.feature.number.arithmetic.NumerableUnit;
import io.github.ones1kk.assertion.core.lang.number.integer.IntegersInterface;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import io.github.ones1kk.assertion.core.message.ComparableErrorMessages;
import io.github.ones1kk.assertion.core.message.DataErrorMessages;
import io.github.ones1kk.assertion.core.message.IntegersErrorMessages;
import io.github.ones1kk.assertion.core.message.NumerableErrorMessages;

/**
 * <strong> The Integers class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Integers extends Objects<Integer> implements IntegersInterface<Integer> {

    private final ComparableLanguage<Integer> comparable = new ComparableLanguageImpl<>();

    public Integers(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Integer actual) {
        if (NumerableUnit.of(actual).isEven()) {
            handler.receive(actual, IntegersErrorMessages.shouldBeOdd(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Integer actual) {
        if (NumerableUnit.of(actual).isOdd()) {
            handler.receive(actual, IntegersErrorMessages.shouldNotBeOdd(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Integer actual) {
        if (NumerableUnit.of(actual).isOdd()) {
            handler.receive(actual, IntegersErrorMessages.shouldBeEven(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Integer actual) {
        if (NumerableUnit.of(actual).isEven()) {
            handler.receive(actual, IntegersErrorMessages.shouldNotBeEven(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Integer actual) {
        if (comparable.isLessThanOrEqualTo(actual, 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Integer actual) {
        if (comparable.isGreaterThan(actual, 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Integer actual) {
        if (comparable.isGreaterThanOrEqualTo(actual, 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Integer actual) {
        if (comparable.isLessThan(actual, 0)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Integer actual) {
        if (NumerableUnit.of(actual).isNotZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Integer actual) {
        if (NumerableUnit.of(actual).isZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Integer actual, Integer expected) {
        if (comparable.isGreaterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Integer actual, Integer expected) {
        if (comparable.isGreaterThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Integer actual, Integer expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Integer actual, Integer expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Integer actual, Integer start, Integer end) {
        if (comparable.isLessThan(actual, start) || comparable.isGreaterThan(actual, end)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Integer actual, Integer expected, Offset<Integer> offset) {
        if (!offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsCloseTo(Integer actual, Integer expected, Percentage<Integer> percentage) {
        if (!percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    @Override
    public void assertIsNotCloseTo(Integer actual, Integer expected, Offset<Integer> offset) {
        if (offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Integer actual, Integer expected, Percentage<Integer> percentage) {
        if (percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    private void setAssertClose(Integer actual, Offset<Integer> offset) {
        handler.receive(actual, DataErrorMessages.shouldBeCloseTo(actual, offset.getBefore(actual), offset.getAfter(actual)));
        throw handler.getException();
    }

    private void setAssertClose(Integer actual, Percentage<Integer> percentage) {
        handler.receive(actual, DataErrorMessages.shouldBeCloseTo(actual, percentage.getStartingRange(), percentage.getEndingRange()));
        throw handler.getException();
    }
}
