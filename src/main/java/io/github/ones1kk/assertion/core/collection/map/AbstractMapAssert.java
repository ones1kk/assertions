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
package io.github.ones1kk.assertion.core.collection.map;

import io.github.ones1kk.assertion.core.AbstractAssert;

import java.util.Map;
import java.util.function.Predicate;

/**
 * <strong> The AbstractMapAssert class inherits {@link AbstractAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Map type and verify assertion.</p>
 *
 * @param <ACTUAL> {@code actual}.
 * @param <K>      {@code k}.
 * @param <V>      {@code v}.
 */
public abstract class AbstractMapAssert<ACTUAL extends Map<K, V>, K, V> extends AbstractAssert<AbstractMapAssert<ACTUAL, K, V>, ACTUAL> implements MapAssertion<AbstractMapAssert<ACTUAL, K, V>, ACTUAL, K, V> {

    private final MapsAssertion<ACTUAL, K, V> maps;


    public AbstractMapAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.maps = new Maps<>();
    }

    /**
     * verify {@code actual} is empty
     *
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> isEmpty() {
        maps.assertEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not empty
     *
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> isNotEmpty() {
        maps.assertNotEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is null or empty.
     *
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> isNullOrEmpty() {
        maps.assertNullOrEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} contains key of {@code expected}
     *
     * @param expected {@code actual} contains {@code expected}.
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> containsKey(K expected) {
        maps.assertContainsKey(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains all key of {@code expected}
     *
     * @param expected {@code actual} contains {@code expected}.
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> containsAllKey(Map<? extends K, ?> expected) {
        maps.assertContainsAllKey(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains value of {@code expected}
     *
     * @param expected {@code actual} contains {@code expected}.
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> containsValue(V expected) {
        maps.assertContainsValue(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} contains all value of {@code expected}
     *
     * @param expected {@code actual} contains {@code expected}.
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> containsAllValue(Map<?, ? extends V> expected) {
        maps.assertContainsAllValue(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} is equal size of {@code expected}
     *
     * @param expected equal size of {@code actual}.
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> hasSize(int expected) {
        maps.assertHasSize(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is smaller than {@code expected}.
     *
     * @param expected larger than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> isSmallerThan(ACTUAL expected) {
        maps.assertSmallerThan(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is smaller than or equal to {@code expected}.
     *
     * @param expected larger than or Equal to {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> isSmallerThanOrEqualTo(ACTUAL expected) {
        maps.assertSmallerThanOrEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is larger than {@code expected}.
     *
     * @param expected smaller than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> isLargerThan(ACTUAL expected) {
        maps.assertLargerThan(info, actual, expected);
        return self;
    }

    /**
     * verify {@code actual} size is larger than or equal to {@code expected}.
     *
     * @param expected smaller than {@code actual}
     * @return {@code self}.
     */
    @Override
    public AbstractMapAssert<ACTUAL, K, V> isLargerThanOrEqualTo(ACTUAL expected) {
        maps.assertLargerThanOrEqualTo(info, actual, expected);
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
    public AbstractMapAssert<ACTUAL, K, V> isBetweenSizeOf(ACTUAL start, ACTUAL end) {
        maps.assertBetweenSizeOf(info, actual, start, end);
        return self;
    }
}
