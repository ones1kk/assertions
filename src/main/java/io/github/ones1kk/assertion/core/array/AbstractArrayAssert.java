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

import io.github.ones1kk.assertion.core.AbstractAssert;

import java.util.function.Predicate;

/**
 * <strong> The AbstractArrayAssert class inherits {@link AbstractAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Array type and verify assertion.</p>
 *
 * @param <ACTUAL> {@code actual}.
 */
public abstract class AbstractArrayAssert<ACTUAL> extends AbstractAssert<AbstractArrayAssert<ACTUAL>, ACTUAL[]> implements ArrayAssertion<AbstractArrayAssert<ACTUAL>, ACTUAL> {

    private final ArraysAssertion<ACTUAL> arrays;

    public AbstractArrayAssert(Class<?> self, ACTUAL[] actual) {
        super(self, actual);
        this.arrays = new Arrays<>();
    }

    /**
     * verify {@code actual} is empty
     *
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> isEmpty() {
        arrays.assertEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not empty
     *
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> isNotEmpty() {
        arrays.assertNotEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is null or empty.
     *
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> isNullOrEmpty() {
        arrays.assertNullOrEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not null or not empty.
     *
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> isNotNullOrNotEmpty() {
        arrays.assertNotNullOrNotEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} contains {@code expected}
     *
     * @param expected {@code actual} contains {@code expected}.
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> contains(ACTUAL expected) {
        arrays.assertContains(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} does not contain {@code expected}
     *
     * @param expected {@code actual} does not contain {@code expected}.
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> doesNotContain(ACTUAL expected) {
        arrays.assertDoesNotContain(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains all of {@code expected}
     *
     * @param expected {@code actual} contains all of {@code expected}.
     * @return {@code self}.
     */
    @Override
    @SuppressWarnings("unchecked")
    public AbstractArrayAssert<ACTUAL> containsAll(ACTUAL... expected) {
        arrays.assertContainsAll(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains any of {@code expected}
     *
     * @param expected {@code actual} contains any of {@code expected}.
     * @return {@code self}.
     */
    @Override
    @SuppressWarnings("unchecked")
    public AbstractArrayAssert<ACTUAL> containsAny(ACTUAL... expected) {
        arrays.assertContainsAny(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains null.
     *
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> containsNull() {
        arrays.assertContainsNull(info, actual);
        return self;
    }

    /**
     * verify {@code actual} does not contain null.
     *
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> doesNotContainNull() {
        arrays.assertDoesNotContainNull(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is all matched from all conditions.
     *
     * @param expected all the conditions for the predicate are satisfied.
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> allMatch(Predicate<ACTUAL> expected) {
        arrays.assertAllMatch(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is not matched from all conditions.
     *
     * @param expected all the conditions for the predicate are unsatisfied.
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> noneMatch(Predicate<ACTUAL> expected) {
        arrays.assertNoneMatch(info, actual, expected);
        return self;
    }

    /**
     * verify actual has same expected size.
     *
     * @param expected expected
     * @return {@code self}
     */
    @Override
    public AbstractArrayAssert<ACTUAL> hasSize(int expected) {
        arrays.assertHasSize(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is shorter than {@code expected}.
     *
     * @param expected longer than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> isShorterThan(ACTUAL[] expected) {
        arrays.assertShorterThan(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is shorter than or equal to {@code expected}.
     *
     * @param expected longer than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> isShorterThanOrEqualTo(ACTUAL[] expected) {
        arrays.assertShorterThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is longer than {@code expected}.
     *
     * @param expected shorter than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> isLongerThan(ACTUAL[] expected) {
        arrays.assertLongerThan(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is longer than or equal to {@code expected}.
     *
     * @param expected shorter than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractArrayAssert<ACTUAL> isLongerThanOrEqualTo(ACTUAL[] expected) {
        arrays.assertLongerThanOrEqualTo(info, actual, expected);
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
    public AbstractArrayAssert<ACTUAL> isBetweenLengthOf(ACTUAL[] start, ACTUAL[] end) {
        arrays.assertBetweenLengthOf(info, actual, start, end);
        return self;
    }
}
