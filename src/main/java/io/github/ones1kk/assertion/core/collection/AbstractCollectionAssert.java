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

import io.github.ones1kk.assertion.core.AbstractAssert;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * <strong> The AbstractCollectionAssert class inherits {@link AbstractAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Collection type and verify assertion.</p>
 *
 * @param <SELF>   {@code self}.
 * @param <ACTUAL> {@code actual}.
 */
public abstract class AbstractCollectionAssert<SELF extends AbstractCollectionAssert<SELF, ACTUAL>, ACTUAL> extends AbstractAssert<SELF, Collection<ACTUAL>> implements CollectionAssertion<SELF, ACTUAL> {

    private final CollectionsAssertion<ACTUAL> collections;

    public AbstractCollectionAssert(Class<?> self, Collection<ACTUAL> actual) {
        super(self, actual);
        this.collections = new Collections<>();
    }

    /**
     * verify {@code actual} is empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotEmpty() {
        collections.assertNotEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not empty or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isEmpty() {
        collections.assertEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is null or empty.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNullOrEmpty() {
        collections.assertNullOrEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} contains {@code expected} or not.
     *
     * @param expected {@code actual} contains {@code expected}.
     * @return {@code self}.
     */
    @Override
    public SELF contains(ACTUAL expected) {
        collections.assertContains(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} does not contain {@code expected} or not.
     *
     * @param expected {@code actual} does not contain {@code expected}.
     * @return {@code self}.
     */
    @Override
    public SELF doesNotContain(ACTUAL expected) {
        collections.assertDoesNotContain(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains all of {@code expected} or not.
     *
     * @param expected {@code actual} contains all of {@code expected}.
     * @return {@code self}.
     */
    @Override
    @SuppressWarnings("unchecked")
    public SELF containsAll(ACTUAL... expected) {
        collections.assertContainsAll(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains any of {@code expected} or not.
     *
     * @param expected {@code actual} contains any of {@code expected}.
     * @return {@code self}.
     */
    @Override
    @SuppressWarnings("unchecked")
    public SELF containsAny(ACTUAL... expected) {
        collections.assertContainsAny(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF containsNull() {
        collections.assertContainsNull(info, actual);
        return self;
    }

    /**
     * verify {@code actual} does not contain null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF doesNotContainNull() {
        collections.assertDoesNotContainNull(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is all matched from all conditions.
     *
     * @param expected all the conditions for the predicate are satisfied.
     * @return {@code self}.
     */
    @Override
    public SELF allMatch(Predicate<ACTUAL> expected) {
        collections.assertAllMatch(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is not matched from all conditions.
     *
     * @param expected all the conditions for the predicate are unsatisfied.
     * @return {@code self}.
     */
    @Override
    public SELF noneMatch(Predicate<ACTUAL> expected) {
        collections.assertNoneMatch(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} has same expected size.
     *
     * @param expected expected size.
     * @return {@code self}.
     */
    @Override
    public SELF hasSize(int expected) {
        collections.assertHasSize(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is smaller than {@code expected}.
     *
     * @param expected larger than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isSmallerThan(Collection<? extends ACTUAL> expected) {
        collections.assertSmallerThan(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is smaller than or equal to {@code expected}.
     *
     * @param expected larger than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isSmallerThanOrEqualTo(Collection<? extends ACTUAL> expected) {
        collections.assertSmallerThanOrEqualTo(info, actual, expected);
        return self;
    }


    /**
     * verify {@code actual} size is larger than {@code expected}.
     *
     * @param expected smaller than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLargerThan(Collection<? extends ACTUAL> expected) {
        collections.assertLargerThan(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is larger than or equal to {@code expected}.
     *
     * @param expected smaller than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLargerThanOrEqualTo(Collection<? extends ACTUAL> expected) {
        collections.assertLargerThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is between {@code start} and {@code end}.
     *
     * @param start smaller than or Equal to {@code actual}
     * @param end   larger than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isBetweenSizeOf(Collection<? extends ACTUAL> start, Collection<? extends ACTUAL> end) {
        collections.assertBetweenSizeOf(info, actual, start, end);
        return self;
    }
}
