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

package com.github.ones1kk.asserts.core.lang.number.flot;

import com.github.ones1kk.asserts.core.feature.data.Percentage;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

public class AbstractFloatAssert<SELF extends AbstractFloatAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Float> implements FloatAssertInterface<SELF> {

    private final FloatsInterface<Float> floats;

    public AbstractFloatAssert(Class<?> self, Float actual) {
        super(self, actual);
        this.floats = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isInfinity() {
        floats.assertIsInfinity(actual);
        return self;
    }

    @Override
    public SELF isFinite() {
        floats.assertIsFinite(actual);
        return self;
    }

    @Override
    public SELF isNaN() {
        floats.assertIsNaN(actual);
        return self;
    }

    @Override
    public SELF isPositive() {
        floats.assertIsPositive(actual);
        return self;
    }

    @Override
    public SELF isNotPositive() {
        floats.assertIsNotPositive(actual);
        return self;
    }

    @Override
    public SELF isNegative() {
        floats.assertIsNegative(actual);
        return self;
    }

    @Override
    public SELF isNotNegative() {
        floats.assertIsNotNegative(actual);
        return self;
    }

    @Override
    public SELF isZero() {
        floats.assertIsZero(actual);
        return self;
    }

    @Override
    public SELF isNotZero() {
        floats.assertIsNotZero(actual);
        return self;
    }

    @Override
    public SELF isCloseTo(Float expected, Double percentage) {
        floats.assertIsCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

    @Override
    public SELF isNotCloseTo(Float expected, Double percentage) {
        floats.assertIsNotCloseTo(actual, expected, Percentage.of(percentage));
        return self;
    }

    @Override
    public SELF isLessThan(Float expected) {
        floats.assertIsLessThan(actual, expected);
        return self;
    }

    @Override
    public SELF isLessThanOrEqualTo(Float expected) {
        floats.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThan(Float expected) {
        floats.assertIsGreaterThan(actual, expected);
        return self;
    }

    @Override
    public SELF isGreaterThanOrEqualTo(Float expected) {
        floats.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isBetween(Float start, Float end) {
        floats.assertIsBetween(actual, start, end);
        return self;
    }
}
