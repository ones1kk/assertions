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

package com.github.ones1kk.asserts.core.lang.number.shrt;

import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

public class AbstractShortAssertAssert<SELF extends AbstractShortAssertAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Short> implements ShortAssertAssertInterface<SELF> {

    private final ShortsInterface<Short> shorts;

    public AbstractShortAssertAssert(Class<?> self, Short actual) {
        super(self, actual);
        this.shorts = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isOdd() {
        shorts.assertIsOdd(actual);
        return self;
    }

    @Override
    public SELF isNotOdd() {
        shorts.assertIsNotOdd(actual);
        return self;
    }

    @Override
    public SELF isEven() {
        shorts.assertIsEven(actual);
        return self;
    }

    @Override
    public SELF isNotEven() {
        shorts.assertIsNotEven(actual);
        return self;
    }

    @Override
    public SELF isLessThan(Short expected) {
        shorts.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Short expected) {
        shorts.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Short expected) {
        shorts.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Short expected) {
        shorts.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Short start, Short end) {
        shorts.assertIsBetween(actual, start, end);
        return self;
    }

    @Override
    public SELF isPositive() {
        shorts.assertIsPositive(actual);
        return self;
    }

    @Override
    public SELF isNotPositive() {
        shorts.assertIsNotPositive(actual);
        return self;
    }

    @Override
    public SELF isNegative() {
        shorts.assertIsNegative(actual);
        return self;
    }

    @Override
    public SELF isNotNegative() {
        shorts.assertIsNotNegative(actual);
        return self;
    }

    @Override
    public SELF isZero() {
        shorts.assertIsZero(actual);
        return self;
    }

    @Override
    public SELF isNotZero() {
        shorts.assertIsNotZero(actual);
        return self;
    }

    @Override
    public SELF isCloseTo(Short expected, Double percentage) {
        shorts.assertIsCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

    @Override
    public SELF isNotCloseTo(Short expected, Double percentage) {
        shorts.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }
}
