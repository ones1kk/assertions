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

package io.github.ones1kk.asserts.core.collection.list;

import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.util.List;
import java.util.function.Predicate;

/**
 * <strong> The AbstractListAssert class inherits {@link AbstractListAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the List type and verify assertion.</p>
 *
 * @param <SELF>   {@code self}.
 * @param <ACTUAL> {@code actual}.
 */
public class AbstractListAssert<SELF extends AbstractListAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, List<? extends ACTUAL>> implements ListAssertInterface<SELF, ACTUAL> {

    private final ListsInterface<ACTUAL> lists;

    public AbstractListAssert(Class<?> self, List<? extends ACTUAL> actual) {
        super(self, actual);
        this.lists = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isEmpty() {
        lists.assertIsEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotEmpty() {
        lists.assertIsNotEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is null or empty.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNullOrEmpty() {
        lists.assertIsNullOrEmpty(actual);
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
        lists.assertContains(actual, expected);
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
        lists.assertDoesNotContain(actual, expected);
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
        lists.assertContainsAll(actual, expected);
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
        lists.assertContainsAny(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} contains null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF containsNull() {
        lists.assertContainsNull(actual);
        return self;
    }

    /**
     * Verify {@code actual} does not contain null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF doesNotContainNull() {
        lists.assertDoesNotContainNull(actual);
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
        lists.assertAllMatch(actual, expected);
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
        lists.assertNoneMatch(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is smaller than {@code expected}.
     *
     * @param expected larger than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isSmallerThan(List<? extends ACTUAL> expected) {
        lists.assertIsSmallerThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is smaller than or equal to {@code expected}.
     *
     * @param expected larger than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isSmallerThanOrEqualTo(List<? extends ACTUAL> expected) {
        lists.assertIsSmallerThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is larger than {@code expected}.
     *
     * @param expected smaller than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLargerThan(List<? extends ACTUAL> expected) {
        lists.assertIsLargerThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is larger than or equal to {@code expected}.
     *
     * @param expected smaller than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLargerThanOrEqualTo(List<? extends ACTUAL> expected) {
        lists.assertIsLargerThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is between {@code start} and {@code end}
     *
     * @param start smaller than or Equal to {@code actual}
     * @param end   larger than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isBetweenSizeOf(List<? extends ACTUAL> start, List<? extends ACTUAL> end) {
        lists.assertIsBetweenSizeOf(actual, start, end);
        return self;
    }
}
