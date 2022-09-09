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
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.number.shrt.ShortsInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import static com.github.ones1kk.asserts.core.feature.number.arithmetic.ShortArithmeticUnit.of;

/**
 * <strong> The Shorts class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public class Shorts extends Objects<Short> implements ShortsInterface<Short> {

    private final ComparableLanguage<Short> comparable = new ComparableLanguageImpl<>();

    public Shorts(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Short actual) {
        if (of(actual).isEven()) {
            handler.setDescription(handler.from(actual, "{} is not odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Short actual) {
        if (of(actual).isOdd()) {
            handler.setDescription(handler.from(actual, "{} is odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Short actual) {
        if (of(actual).isOdd()) {
            handler.setDescription(handler.from(actual, "{} is not even"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Short actual) {
        if (of(actual).isEven()) {
            handler.setDescription(handler.from(actual, "{} is even"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Short actual) {
        if (comparable.isLessThanOrEqualTo(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is not positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Short actual) {
        if (comparable.isGraterThan(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Short actual) {
        if (comparable.isGraterThanOrEqualTo(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is not negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Short actual) {
        if (comparable.isLessThan(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Short actual) {
        if (of(actual).isNotZero()) {
            handler.setDescription(handler.from(actual, "{} is not zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Short actual) {
        if (of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Short actual, Short expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Short actual, Short expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Short actual, Short expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Short actual, Short expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Short actual, Short start, Short end) {
        if (comparable.isLessThan(actual, start)
                || comparable.isGraterThan(actual, end)) {
            String description = handler.from("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Short actual, Short expected, Percentage<Short> percentage) {
        if (!percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    @Override
    public void assertIsNotCloseTo(Short actual, Short expected, Percentage<Short> percentage) {
        if (percentage.isRange(actual, expected)) {
            setAssertClose(actual, percentage);
        }
    }

    private void setAssertClose(Short actual, Percentage<Short> percentage) {
        String scope = handler.getDescribable().as("{} have to close to {}", actual,
                percentage.getStartingRage() + " ~ " + percentage.getEndingRage());
        handler.setDescription(handler.from(actual, scope));
        throw handler.getException();
    }
}
