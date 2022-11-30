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

package io.github.ones1kk.assertion.core.lang.number.lng.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import io.github.ones1kk.assertion.core.feature.data.Offset;
import io.github.ones1kk.assertion.core.feature.data.Percentage;
import io.github.ones1kk.assertion.core.lang.number.lng.LongsInterface;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import io.github.ones1kk.assertion.core.message.NumerableErrorMessages;

import static io.github.ones1kk.assertion.core.feature.number.arithmetic.NumerableUnit.of;
import static io.github.ones1kk.assertion.core.message.ComparableErrorMessages.*;
import static io.github.ones1kk.assertion.core.message.DataErrorMessages.shouldBeCloseTo;
import static io.github.ones1kk.assertion.core.message.IntegersErrorMessages.*;

/**
 * <strong> The Longs class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Longs extends Objects<Long> implements LongsInterface<Long> {

    private final ComparableLanguage<Long> comparable = new ComparableLanguageImpl<>();

    public Longs(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Long actual) {
        if (of(actual).isEven()) {
            handler.receive(actual, shouldBeOdd(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Long actual) {
        if (of(actual).isOdd()) {
            handler.receive(actual, shouldNotBeOdd(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Long actual) {
        if (of(actual).isOdd()) {
            handler.receive(actual, shouldBeEven(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Long actual) {
        if (of(actual).isEven()) {
            handler.receive(actual, shouldNotBeEven(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Long actual) {
        if (comparable.isLessThanOrEqualTo(actual, 0L)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Long actual) {
        if (comparable.isGreaterThan(actual, 0L)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Long actual) {
        if (comparable.isGreaterThanOrEqualTo(actual, 0L)) {
            handler.receive(actual, NumerableErrorMessages.shouldBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Long actual) {
        if (comparable.isLessThan(actual, 0L)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Long actual) {
        if (of(actual).isNotZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Long actual) {
        if (of(actual).isZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Long actual, Long expected) {
        if (comparable.isGreaterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Long actual, Long expected) {
        if (comparable.isGreaterThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Long actual, Long expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Long actual, Long expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Long actual, Long start, Long end) {
        if (comparable.isLessThan(actual, start) || comparable.isGreaterThan(actual, end)) {
            handler.receive(actual, shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Long actual, Long expected, Offset<Long> offset) {
        if (!offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsCloseTo(Long actual, Long expected, Percentage<Long> percentage) {
        if (!percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    @Override
    public void assertIsNotCloseTo(Long actual, Long expected, Offset<Long> offset) {
        if (offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Long actual, Long expected, Percentage<Long> percentage) {
        if (percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    private void setAssertClose(Long actual, Offset<Long> offset) {
        handler.receive(actual, shouldBeCloseTo(actual, offset.getBefore(actual), offset.getAfter(actual)));
        throw handler.getException();
    }

    private void setAssertClose(Long actual, Percentage<Long> percentage) {
        handler.receive(actual, shouldBeCloseTo(actual, percentage.getStartingRange(), percentage.getEndingRange()));
        throw handler.getException();
    }
}
