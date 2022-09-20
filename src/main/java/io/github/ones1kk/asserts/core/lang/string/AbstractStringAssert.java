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

package io.github.ones1kk.asserts.core.lang.string;

import io.github.ones1kk.asserts.core.lang.charsequence.AbstractCharSequenceAssert;

/**
 * /**
 * <strong> The AbstractFloatAssert class inherits {@link AbstractCharSequenceAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Float type and verify assertion.</p>
 *
 * @param <SELF>
 */
public class AbstractStringAssert<SELF extends AbstractStringAssert<SELF>> extends AbstractCharSequenceAssert<SELF, String> implements StringAssertInterface<SELF, String> {

    private final StringsInterface<String> strings;

    public AbstractStringAssert(Class<?> self, String actual) {
        super(self, actual);
        this.strings = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is less than {@code expected}.
     *
     * @param expected greater than {@code actual}
     * @return {@code self}.
     */
    @Override
    public SELF isLessThan(String expected) {
        strings.assertIsLessThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is less than or equal to {@code expected}.
     *
     * @param expected greater than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isLessThanOrEqualTo(String expected) {
        strings.assertIsLessThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isGreaterThan(String expected) {
        strings.assertIsGreaterThan(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is greater than or equal to {@code expected}.
     *
     * @param expected less than {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isGreaterThanOrEqualTo(String expected) {
        strings.assertIsGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} is between {@code start} and {@code end}
     *
     * @param start less than or Equal to {@code actual}
     * @param end   greater than or Equal to {@code actual}
     * @return {@code self}
     */
    @Override
    public SELF isBetween(String start, String end) {
        strings.assertIsBetween(actual, start, end);
        return self;
    }
}
