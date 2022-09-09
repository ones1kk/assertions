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

package com.github.ones1kk.asserts.core.lang.number.lng.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.comparable.lang.ComparableLanguage;
import com.github.ones1kk.asserts.core.feature.comparable.lang.impl.ComparableLanguageImpl;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.number.lng.LongsInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import static com.github.ones1kk.asserts.core.feature.number.arithmetic.LongArithmeticUnit.of;

/**
 * <strong> The Longs class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public class Longs extends Objects<Long> implements LongsInterface<Long> {

    private final ComparableLanguage<Long> comparable = new ComparableLanguageImpl<>();

    public Longs(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Long actual) {
        if (of(actual).isEven()) {
            handler.setDescription(handler.from(actual, "{} is not odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Long actual) {
        if (of(actual).isOdd()) {
            handler.setDescription(handler.from(actual, "{} is odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Long actual) {
        if (of(actual).isOdd()) {
            handler.setDescription(handler.from(actual, "{} is not even"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Long actual) {
        if (of(actual).isEven()) {
            handler.setDescription(handler.from(actual, "{} is even"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Long actual) {
        if (comparable.isLessThanOrEqualTo(actual, 0L)) {
            handler.setDescription(handler.from(actual, "{} is not positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Long actual) {
        if (comparable.isGraterThan(actual, 0L)) {
            handler.setDescription(handler.from(actual, "{} is positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Long actual) {
        if (comparable.isGraterThanOrEqualTo(actual, 0L)) {
            handler.setDescription(handler.from(actual, "{} is not negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Long actual) {
        if (comparable.isLessThan(actual, 0L)) {
            handler.setDescription(handler.from(actual, "{} is negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Long actual) {
        if (of(actual).isNotZero()) {
            handler.setDescription(handler.from(actual, "{} is not zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Long actual) {
        if (of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Long actual, Long expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Long actual, Long expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Long actual, Long expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Long actual, Long expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Long actual, Long start, Long end) {
        if (comparable.isLessThan(actual, start)
                || comparable.isGraterThan(actual, end)) {
            String description = handler.from("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
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
        String scope = handler.getDescribable().as("{} have to close to {}", actual,
                offset.getBefore(actual) + " ~ " + offset.getAfter(actual));
        handler.setDescription(handler.from(actual, scope));
        throw handler.getException();
    }

    private void setAssertClose(Long actual, Percentage<Long> percentage) {
        String scope = handler.getDescribable().as("{} have to close to {}", actual,
                percentage.getStartingRage() + " ~ " + percentage.getEndingRage());
        handler.setDescription(handler.from(actual, scope));
        throw handler.getException();
    }
}
