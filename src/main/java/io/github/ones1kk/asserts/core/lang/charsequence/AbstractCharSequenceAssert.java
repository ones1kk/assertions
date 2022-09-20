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

package io.github.ones1kk.asserts.core.lang.charsequence;

import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractCharSequenceAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the CharSequence type and verify assertion.</p>
 *
 * @param <SELF>   {@code self}.
 * @param <ACTUAL> {@code actual}.
 */
public class AbstractCharSequenceAssert<SELF extends AbstractCharSequenceAssert<SELF, ACTUAL>, ACTUAL extends CharSequence> extends AbstractObjectAssert<SELF, ACTUAL> implements CharSequenceAssertInterface<SELF, CharSequence> {

    private final CharSequencesInterface<CharSequence> charSequences;

    protected AbstractCharSequenceAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.charSequences = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is empty or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isEmpty() {
        charSequences.assertIsEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not empty or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotEmpty() {
        charSequences.assertIsNotEmpty(actual);
        return self;
    }

    /**
     * Verify {@code actual} is blank or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isBlank() {
        charSequences.assertIsBlank(actual);
        return self;
    }

    /**
     * Verify {@code actual} is not blank or not
     *
     * @return {@code self}
     */
    @Override
    public SELF isNotBlank() {
        charSequences.assertIsNotBlank(actual);
        return self;
    }

    /**
     * Verify is equal to {@code expected} as ignore case.
     *
     * @param expected equal to {@code expected} includes ignore case too.
     * @return {@code self}.
     */
    @Override
    public SELF isEqualToIgnoreCase(CharSequence expected) {
        charSequences.assertIsEqualToIgnoreCase(actual, expected);
        return self;
    }
}
