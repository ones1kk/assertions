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

package com.github.ones1kk.asserts.core.lang.number.lng;

import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

public class AbstractLongAssertAssert<SELF extends AbstractLongAssertAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Long> implements LongAssertAssertInterface<SELF> {

    private final LongsInterface<Long> longs;

    public AbstractLongAssertAssert(Class<?> self, Long actual) {
        super(self, actual);
        this.longs = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isOdd() {
        longs.assertIsOdd(actual);
        return self;
    }

    @Override
    public SELF isNotOdd() {
        longs.assertIsNotOdd(actual);
        return self;
    }

    @Override
    public SELF isEven() {
        longs.assertIsEven(actual);
        return self;
    }

    @Override
    public SELF isNotEven() {
        longs.assertIsNotEven(actual);
        return self;
    }

    @Override
    public SELF isPositive() {
        longs.assertIsPositive(actual);
        return self;
    }

    @Override
    public SELF isNotPositive() {
        longs.assertIsNotPositive(actual);
        return self;
    }

    @Override
    public SELF isNegative() {
        longs.assertIsNegative(actual);
        return self;
    }

    @Override
    public SELF isNotNegative() {
        longs.assertIsNotNegative(actual);
        return self;
    }

    @Override
    public SELF isZero() {
        longs.assertIsZero(actual);
        return self;
    }

    @Override
    public SELF isNotZero() {
        longs.assertIsNotZero(actual);
        return self;
    }

    @Override
    public SELF isLessThan(Long expected) {
        longs.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Long expected) {
        longs.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Long expected) {
        longs.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Long expected) {
        longs.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Long start, Long end) {
        longs.assertIsBetween(actual, start, end);
        return self;
    }

    @Override
    public SELF isCloseTo(Long expected, Double percentage) {
        longs.assertIsCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

    @Override
    public SELF isNotCloseTo(Long expected, Double percentage) {
        longs.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

}
