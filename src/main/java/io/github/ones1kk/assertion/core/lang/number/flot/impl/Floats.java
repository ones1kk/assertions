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

package io.github.ones1kk.assertion.core.lang.number.flot.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;
import io.github.ones1kk.assertion.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import io.github.ones1kk.assertion.core.feature.data.Offset;
import io.github.ones1kk.assertion.core.feature.data.Percentage;
import io.github.ones1kk.assertion.core.feature.number.arithmetic.NumerableUnit;
import io.github.ones1kk.assertion.core.lang.number.flot.FloatsInterface;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import io.github.ones1kk.assertion.core.message.ComparableErrorMessages;
import io.github.ones1kk.assertion.core.message.DataErrorMessages;
import io.github.ones1kk.assertion.core.message.DoublesErrorMessages;
import io.github.ones1kk.assertion.core.message.NumerableErrorMessages;

/**
 * <strong> The Floats class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Floats extends Objects<Float> implements FloatsInterface<Float> {

    private final ComparableLanguage<Float> comparable = new ComparableLanguageImpl<>();

    public Floats(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsInfinity(Float actual) {
        if (!Float.isInfinite(actual)) {
            handler.receive(actual, DoublesErrorMessages.shouldBeInfinity(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsFinite(Float actual) {
        if (!Float.isFinite(actual)) {
            handler.receive(actual, DoublesErrorMessages.shouldBeFinite(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNaN(Float actual) {
        if (!Float.isNaN(actual)) {
            handler.receive(actual, DoublesErrorMessages.shouldBeNaN(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Float actual) {
        if (comparable.isLessThanOrEqualTo(actual, 0F)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Float actual) {
        if (comparable.isGraterThan(actual, 0F)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBePositive(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Float actual) {
        if (comparable.isGraterThanOrEqualTo(actual, 0F)) {
            handler.receive(actual, NumerableErrorMessages.shouldBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Float actual) {
        if (comparable.isLessThan(actual, 0F)) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeNegative(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Float actual) {
        if (NumerableUnit.of(actual).isNotZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Float actual) {
        if (NumerableUnit.of(actual).isZero()) {
            handler.receive(actual, NumerableErrorMessages.shouldNotBeZero(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Float actual, Float expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeLessThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Float actual, Float expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeLessThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Float actual, Float expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThan(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Float actual, Float expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.receive(actual, expected, ComparableErrorMessages.shouldBeGreaterThanOrEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Float actual, Float start, Float end) {
        if (comparable.isLessThan(actual, start) || comparable.isGraterThan(actual, end)) {
            handler.receive(actual, ComparableErrorMessages.shouldBeBetween(actual, start, end));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Float actual, Float expected, Offset<Float> offset) {
        if (!offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsCloseTo(Float actual, Float expected, Percentage<Float> percentage) {
        if (!percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    @Override
    public void assertIsNotCloseTo(Float actual, Float expected, Offset<Float> offset) {
        if (offset.isOffset(actual, expected)) {
            setAssertClose(actual, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Float actual, Float expected, Percentage<Float> percentage) {
        if (percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    private void setAssertClose(Float actual, Offset<Float> offset) {
        handler.receive(actual, DataErrorMessages.shouldBeCloseTo(actual, offset.getBefore(actual), offset.getAfter(actual)));
        throw handler.getException();
    }

    private void setAssertClose(Float actual, Percentage<Float> percentage) {
        handler.receive(actual, DataErrorMessages.shouldBeCloseTo(actual, percentage.getStartingRange(), percentage.getEndingRange()));
        throw handler.getException();
    }
}
