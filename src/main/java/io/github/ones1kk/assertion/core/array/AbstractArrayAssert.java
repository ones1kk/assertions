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

package io.github.ones1kk.assertion.core.array;

import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

import java.util.function.Predicate;

/**
 * <strong> The AbstractArrayAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Array type and verify assertion.</p>
 *
 * @param <SELF>   {@code self}.
 * @param <ACTUAL> {@code actual}.
 */
public class AbstractArrayAssert<SELF extends AbstractArrayAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, ACTUAL[]> implements ArrayAssertInterface<SELF, ACTUAL> {

    private final ArraysInterface<ACTUAL> arrays;

    @SuppressWarnings("unchecked")
    public AbstractArrayAssert(Class<?> self, ACTUAL[] actual) {
        super(self, actual);
        this.arrays = (ArraysInterface<ACTUAL>) assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isEmpty() {
        arrays.assertIsEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotEmpty() {
        arrays.assertIsNotEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is null or empty.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNullOrEmpty() {
        arrays.assertIsNullOrEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} contains {@code expected} or not.
     *
     * @param expected {@code actual} contains {@code expected}.
     * @return {@code self}.
     */
    @Override
    public SELF contains(ACTUAL expected) {
        arrays.assertContains(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} does not contain {@code expected} or not.
     *
     * @param expected {@code actual} does not contain {@code expected}.
     * @return {@code self}.
     */
    @Override
    public SELF doesNotContain(ACTUAL expected) {
        arrays.assertDoesNotContain(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} contains all of {@code expected} or not.
     *
     * @param expected {@code actual} contains all of {@code expected}.
     * @return {@code self}.
     */
    @Override
    @SuppressWarnings("unchecked")
    public SELF containsAll(ACTUAL... expected) {
        arrays.assertContainsAll(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} contains any of {@code expected} or not.
     *
     * @param expected {@code actual} contains any of {@code expected}.
     * @return {@code self}.
     */
    @Override
    @SuppressWarnings("unchecked")
    public SELF containsAny(ACTUAL... expected) {
        arrays.assertContainsAny(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} contains null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF containsNull() {
        arrays.assertContainsNull(actual);
        return self;
    }

    /**
     * Verify {@code actual} does not contain null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF doesNotContainNull() {
        arrays.assertDoesNotContainNull(actual);
        return self;
    }

    /**
     * Verify {@code actual} is all matched from all conditions.
     *
     * @param expected all the conditions for the predicate are satisfied.
     * @return {@code self}.
     */
    @Override
    public SELF allMatch(Predicate<ACTUAL> expected) {
        arrays.assertAllMatch(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is not matched from all conditions.
     *
     * @param expected all the conditions for the predicate are unsatisfied.
     * @return {@code self}.
     */
    @Override
    public SELF noneMatch(Predicate<ACTUAL> expected) {
        arrays.assertNoneMatch(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is shorter than {@code expected}.
     *
     * @param expected longer than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isShorterThan(ACTUAL[] expected) {
        arrays.assertIsShorterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is shorter than or equal to {@code expected}.
     *
     * @param expected longer than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isShorterThanOrEqualTo(ACTUAL[] expected) {
        arrays.assertIsShorterThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is longer than {@code expected}.
     *
     * @param expected shorter than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLongerThan(ACTUAL[] expected) {
        arrays.assertIsLongerThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is longer than or equal to {@code expected}.
     *
     * @param expected shorter than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLongerThanOrEqualTo(ACTUAL[] expected) {
        arrays.assertIsLongerThanOrEqualTo(actual, expected);
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
    public SELF isBetweenLengthOf(ACTUAL[] start, ACTUAL[] end) {
        arrays.assertIsBetweenLengthOf(actual, start, end);
        return self;
    }
}
