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
package io.github.ones1kk.assertion.core.lang.charsequence;

import io.github.ones1kk.assertion.core.AbstractAssert;

/**
 * <strong> The AbstractCharSequenceAssert class inherits {@link AbstractAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the CharSequence type and verify assertion.</p>
 *
 * @param <ACTUAL> {@code actual}.
 */
public abstract class AbstractCharSequenceAssert<SELF extends AbstractCharSequenceAssert<SELF, ACTUAL>, ACTUAL extends CharSequence> extends AbstractAssert<SELF, ACTUAL> implements CharSequenceAssertion<AbstractCharSequenceAssert<SELF, ACTUAL>, ACTUAL> {

    private final CharSequencesAssertion<ACTUAL> charSequences;

    public AbstractCharSequenceAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.charSequences = new CharSequences<>();
    }

    /**
     * verify {@code actual} is empty.
     *
     * @return {@link AbstractCharSequenceAssert}.
     */
    @Override
    public AbstractCharSequenceAssert<SELF, ACTUAL> isEmpty() {
        charSequences.assertEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not empty.
     *
     * @return {@link AbstractCharSequenceAssert}.
     */
    @Override
    public AbstractCharSequenceAssert<SELF, ACTUAL> isNotEmpty() {
        charSequences.assertNotEmpty(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is blank.
     *
     * @return {@link AbstractCharSequenceAssert}.
     */
    @Override
    public AbstractCharSequenceAssert<SELF, ACTUAL> isBlank() {
        charSequences.assertBlank(info, actual);
        return self;
    }

    /**
     * verify {@code actual} is not blank.
     *
     * @return {@link AbstractCharSequenceAssert}.
     */
    @Override
    public AbstractCharSequenceAssert<SELF, ACTUAL> isNotBlank() {
        charSequences.assertNotBlank(info, actual);
        return self;
    }

    /**
     * verify is equal to {@code expected} as ignore case.
     *
     * @param expected equal to {@code expected} includes ignore case too.
     * @return {@link AbstractCharSequenceAssert}.
     */
    @Override
    public AbstractCharSequenceAssert<SELF, ACTUAL> isEqualToIgnoreCase(ACTUAL expected) {
        objects.assertNotNull(info, actual);
        charSequences.assertEqualToIgnoreCase(info, actual, expected);
        return self;
    }

}
