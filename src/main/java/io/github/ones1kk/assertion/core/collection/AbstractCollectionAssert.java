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

package io.github.ones1kk.assertion.core.collection;

import io.github.ones1kk.assertion.core.collection.list.AbstractListAssert;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * <strong> The AbstractCollectionAssert class inherits {@link AbstractListAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Collection type and verify assertion.</p>
 *
 * @param <SELF>   {@code self}.
 * @param <ACTUAL> {@code actual}.
 */
public class AbstractCollectionAssert<SELF extends AbstractCollectionAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Collection<ACTUAL>> implements CollectionAssertInterface<SELF, ACTUAL> {

    private final CollectionsInterface<ACTUAL> collections;

    public AbstractCollectionAssert(Class<?> self, Collection<ACTUAL> actual) {
        super(self, actual);
        this.collections = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotEmpty() {
        collections.assertIsNotEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isEmpty() {
        collections.assertIsEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is null or empty.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNullOrEmpty() {
        collections.assertIsNullOrEmpty(actual);
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
        collections.assertContains(actual, expected);
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
        collections.assertDoesNotContain(actual, expected);
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
        collections.assertContainsAll(actual, expected);
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
        collections.assertContainsAny(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} contains null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF containsNull() {
        collections.assertContainsNull(actual);
        return self;
    }

    /**
     * Verify {@code actual} does not contain null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF doesNotContainNull() {
        collections.assertDoesNotContainNull(actual);
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
        collections.assertAllMatch(actual, expected);
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
        collections.assertNoneMatch(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is smaller than {@code expected}.
     *
     * @param expected larger than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isSmallerThan(Collection<? extends ACTUAL> expected) {
        collections.assertIsSmallerThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is smaller than or equal to {@code expected}.
     *
     * @param expected larger than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isSmallerThanOrEqualTo(Collection<? extends ACTUAL> expected) {
        collections.assertIsSmallerThanOrEqualTo(actual, expected);
        return self;
    }


    /**
     * Verify {@code actual} size is larger than {@code expected}.
     *
     * @param expected smaller than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLargerThan(Collection<? extends ACTUAL> expected) {
        collections.assertIsLargerThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} size is larger than or equal to {@code expected}.
     *
     * @param expected smaller than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLargerThanOrEqualTo(Collection<? extends ACTUAL> expected) {
        collections.assertIsLargerThanOrEqualTo(actual, expected);
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
    public SELF isBetweenSizeOf(Collection<? extends ACTUAL> start, Collection<? extends ACTUAL> end) {
        collections.assertIsBetweenSizeOf(actual, start, end);
        return self;
    }
}
