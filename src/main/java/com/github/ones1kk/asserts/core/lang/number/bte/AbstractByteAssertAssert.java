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

package com.github.ones1kk.asserts.core.lang.number.bte;

import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

public class AbstractByteAssertAssert<SELF extends AbstractByteAssertAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Byte> implements ByteAssertAssertInterface<SELF> {

    private final BytesInterface<Byte> bytes;

    public AbstractByteAssertAssert(Class<?> self, Byte actual) {
        super(self, actual);
        this.bytes = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isOdd() {
        bytes.assertIsOdd(actual);
        return self;
    }

    @Override
    public SELF isNotOdd() {
        bytes.assertIsNotOdd(actual);
        return self;
    }

    @Override
    public SELF isEven() {
        bytes.assertIsEven(actual);
        return self;
    }

    @Override
    public SELF isNotEven() {
        bytes.assertIsNotEven(actual);
        return self;
    }

    @Override
    public SELF isLessThan(Byte expected) {
        bytes.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Byte expected) {
        bytes.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Byte expected) {
        bytes.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Byte expected) {
        bytes.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Byte start, Byte end) {
        bytes.assertIsBetween(actual, start, end);
        return self;
    }

    @Override
    public SELF isPositive() {
        bytes.assertIsPositive(actual);
        return self;
    }

    @Override
    public SELF isNotPositive() {
        bytes.assertIsNotPositive(actual);
        return self;
    }

    @Override
    public SELF isNegative() {
        bytes.assertIsNegative(actual);
        return self;
    }

    @Override
    public SELF isNotNegative() {
        bytes.assertIsNotNegative(actual);
        return self;
    }

    @Override
    public SELF isZero() {
        bytes.assertIsZero(actual);
        return self;
    }

    @Override
    public SELF isNotZero() {
        bytes.assertIsNotZero(actual);
        return self;
    }

    @Override
    public SELF isCloseTo(Byte expected, Double percentage) {
        bytes.assertIsCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

    @Override
    public SELF isNotCloseTo(Byte expected, Double percentage) {
        bytes.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }
}
