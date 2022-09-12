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

package com.github.ones1kk.asserts.core.collection.set;

import com.github.ones1kk.asserts.core.collection.list.AbstractListAssert;
import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.util.Set;
import java.util.function.Predicate;

/**
 * <strong> The AbstractSetAssert class inherits {@link AbstractListAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Set type and verify assertion.</p>
 *
 * @param <SELF>
 * @param <ACTUAL>
 */
public class AbstractSetAssert<SELF extends AbstractSetAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Set<? extends ACTUAL>> implements SetAssertInterface<SELF, ACTUAL> {

    private final SetsInterfaces<ACTUAL> sets;

    public AbstractSetAssert(Class<?> self, Set<? extends ACTUAL> actual) {
        super(self, actual);
        this.sets = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isEmpty() {
        sets.assertIsEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotEmpty() {
        sets.assertIsNotEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is null or empty.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNullOrEmpty() {
        sets.assertIsNullOrEmpty(actual);
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
        sets.assertContains(actual, expected);
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
        sets.assertDoesNotContain(actual, expected);
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
        sets.assertContainsAll(actual, expected);
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
        sets.assertContainsAny(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} contains null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF containsNull() {
        sets.assertContainsNull(actual);
        return self;
    }

    /**
     * Verify {@code actual} does not contain null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF doesNotContainNull() {
        sets.assertDoesNotContainNull(actual);
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
        sets.assertAllMatch(actual, expected);
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
        sets.assertNoneMatch(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is less than {@code expected}.
     *
     * @param expected greater than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLessThan(Set<? extends ACTUAL> expected) {
        sets.assertIsLessThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is less than or equal to {@code expected}.
     *
     * @param expected greater than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLessThanOrEqualTo(Set<? extends ACTUAL> expected) {
        sets.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is greater than {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isGreaterThan(Set<? extends ACTUAL> expected) {
        sets.assertIsGreaterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is greater than or equal to {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isGreaterThanOrEqualTo(Set<? extends ACTUAL> expected) {
        sets.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is between {@code start} and {@code end}
     *
     * @param start less than or Equal to {@code actual}
     * @param end   greater than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isBetween(Set<? extends ACTUAL> start, Set<? extends ACTUAL> end) {
        sets.assertIsBetween(actual, start, end);
        return self;
    }
}
