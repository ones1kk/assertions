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

package io.github.ones1kk.assertion.core.array.number;

import io.github.ones1kk.assertion.core.AbstractAssert;

import java.util.function.Predicate;

/**
 * <strong> The AbstractNumberArrayAssert class inherits {@link AbstractAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Array contains type parameters {@link Number} type and verify assertion.</p>
 */
public class AbstractNumberArrayAssert extends AbstractAssert<AbstractNumberArrayAssert, Number[]> implements NumberArrayAssertion<AbstractNumberArrayAssert> {

    private final NumberArraysAssertion<Number> numberArrays;

    public AbstractNumberArrayAssert(Class<?> self, Number[] actual) {
        super(self, actual);
        this.numberArrays = new NumberArrays();
    }

    /**
     * verify {@code expected} is max of {@code actual}.
     *
     * @param expected to max in {@code actual}.
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isMax(Number expected) {
        numberArrays.assertMax(info, actual, expected);
        return self;
    }

    /**
     * verify {@code expected} is min of {@code actual}.
     *
     * @param expected to min in {@code actual}.
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isMin(Number expected) {
        numberArrays.assertMin(info, actual, expected);
        return self;
    }

    /**
     * verify {@code expected} is sum of {@code actual}.
     *
     * @param expected to sum in {@code actual}.
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isSum(Number expected) {
        numberArrays.assertSum(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isEmpty() {
        numberArrays.assertEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isNotEmpty() {
        numberArrays.assertNotEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is null or empty.
     *
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isNullOrEmpty() {
        numberArrays.assertNullOrEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} contains {@code expected} or not.
     *
     * @param expected {@code actual} contains {@code expected}.
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert contains(Number expected) {
        numberArrays.assertContains(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} does not contain {@code expected} or not.
     *
     * @param expected {@code actual} does not contain {@code expected}.
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert doesNotContain(Number expected) {
        numberArrays.assertDoesNotContain(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains all of {@code expected} or not.
     *
     * @param expected {@code actual} contains all of {@code expected}.
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert containsAll(Number... expected) {
        numberArrays.assertContainsAll(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains any of {@code expected} or not.
     *
     * @param expected {@code actual} contains any of {@code expected}.
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert containsAny(Number... expected) {
        numberArrays.assertContainsAny(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains null.
     *
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert containsNull() {
        numberArrays.assertContainsNull(info, actual);
        return self;
    }

    /**
     * verify {@code actual} does not contain null.
     *
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert doesNotContainNull() {
        numberArrays.assertDoesNotContainNull(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is all matched from all conditions.
     *
     * @param expected all the conditions for the predicate are satisfied.
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert allMatch(Predicate<Number> expected) {
        numberArrays.assertAllMatch(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is not matched from all conditions.
     *
     * @param expected all the conditions for the predicate are unsatisfied.
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert noneMatch(Predicate<Number> expected) {
        numberArrays.assertNoneMatch(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} has same expected size.
     *
     * @param expected expected.
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert hasSize(int expected) {
        numberArrays.assertHasSize(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is shorter than {@code expected}.
     *
     * @param expected longer than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isShorterThan(Number[] expected) {
        numberArrays.assertShorterThan(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is shorter than or equal to {@code expected}.
     *
     * @param expected longer than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isShorterThanOrEqualTo(Number[] expected) {
        numberArrays.assertShorterThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is longer than {@code expected}.
     *
     * @param expected shorter than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isLongerThan(Number[] expected) {
        numberArrays.assertLongerThan(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is longer than or equal to {@code expected}.
     *
     * @param expected shorter than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isLongerThanOrEqualTo(Number[] expected) {
        numberArrays.assertLongerThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is between {@code start} and {@code end}
     *
     * @param start shorter than or Equal to {@code actual}
     * @param end   longer than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractNumberArrayAssert isBetweenLengthOf(Number[] start, Number[] end) {
        numberArrays.assertBetweenLengthOf(info, actual, start, end);
        return self;
    }
}
