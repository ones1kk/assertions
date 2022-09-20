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

package io.github.ones1kk.asserts.core.array.number;

import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.util.function.Predicate;

/**
 * <strong> The AbstractNumberArrayAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Array contains type parameters {@link Number} type and verify assertion.</p>
 *
 * @param <SELF>
 * @param <ACTUAL>
 */
public class AbstractNumberArrayAssert<SELF extends AbstractNumberArrayAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Number[]> implements NumberArrayAssertInterface<SELF> {

    private final NumberArraysInterface<Number> numberArrays;

    public AbstractNumberArrayAssert(Class<?> self, Number[] actual) {
        super(self, actual);
        this.numberArrays = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code expected} is max of {@code actual}.
     *
     * @param expected to max in {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF isMax(Number expected) {
        numberArrays.assertIsMax(actual, expected);
        return self;
    }

    /**
     * Verify {@code expected} is min of {@code actual}.
     *
     * @param expected to min in {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF isMin(Number expected) {
        numberArrays.assertIsMin(actual, expected);
        return self;
    }

    /**
     * Verify {@code expected} is sum of {@code actual}.
     *
     * @param expected to sum in {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF isSum(Number expected) {
        numberArrays.assertIsSum(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isEmpty() {
        numberArrays.assertIsEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotEmpty() {
        numberArrays.assertIsNotEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is null or empty.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNullOrEmpty() {
        numberArrays.assertIsNullOrEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} contains {@code expected} or not.
     *
     * @param expected {@code actual} contains {@code expected}.
     * @return {@code self}.
     */
    @Override
    public SELF contains(Number expected) {
        numberArrays.assertContains(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} does not contain {@code expected} or not.
     *
     * @param expected {@code actual} does not contain {@code expected}.
     * @return {@code self}.
     */
    @Override
    public SELF doesNotContain(Number expected) {
        numberArrays.assertDoesNotContain(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} contains all of {@code expected} or not.
     *
     * @param expected {@code actual} contains all of {@code expected}.
     * @return {@code self}.
     */
    @Override
    public SELF containsAll(Number... expected) {
        numberArrays.assertContainsAll(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} contains any of {@code expected} or not.
     *
     * @param expected {@code actual} contains any of {@code expected}.
     * @return {@code self}.
     */
    @Override
    public SELF containsAny(Number... expected) {
        numberArrays.assertContainsAny(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} contains null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF containsNull() {
        numberArrays.assertContainsNull(actual);
        return self;
    }

    /**
     * Verify {@code actual} does not contain null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF doesNotContainNull() {
        numberArrays.assertDoesNotContainNull(actual);
        return self;
    }

    /**
     * Verify {@code actual} is all matched from all conditions.
     *
     * @param expected all the conditions for the predicate are satisfied.
     * @return {@code self}.
     */
    @Override
    public SELF allMatch(Predicate<Number> expected) {
        numberArrays.assertAllMatch(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is not matched from all conditions.
     *
     * @param expected all the conditions for the predicate are unsatisfied.
     * @return {@code self}.
     */
    @Override
    public SELF noneMatch(Predicate<Number> expected) {
        numberArrays.assertNoneMatch(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is shorter than {@code expected}.
     *
     * @param expected longer than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isShorterThan(Number[] expected) {
        numberArrays.assertIsShorterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is shorter than or equal to {@code expected}.
     *
     * @param expected longer than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isShorterThanOrEqualTo(Number[] expected) {
        numberArrays.assertIsShorterThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is longer than {@code expected}.
     *
     * @param expected shorter than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLongerThan(Number[] expected) {
        numberArrays.assertIsLongerThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is longer than or equal to {@code expected}.
     *
     * @param expected shorter than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLongerThanOrEqualTo(Number[] expected) {
        numberArrays.assertIsLongerThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is between {@code start} and {@code end}
     *
     * @param start shorter than or Equal to {@code actual}
     * @param end   longer than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isBetweenLengthOf(Number[] start, Number[] end) {
        numberArrays.assertIsBetweenLengthOf(actual, start, end);
        return self;
    }
}
