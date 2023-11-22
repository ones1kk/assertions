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

import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractCharSequenceAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the CharSequence type and verify assertion.</p>
 *
 * @param <ACTUAL> {@code actual}.
 */
public class AbstractCharSequenceAssert<ACTUAL extends CharSequence> extends AbstractObjectAssert<ACTUAL> implements CharSequenceAssertion<AbstractCharSequenceAssert<ACTUAL>, ACTUAL> {

    private final CharSequencesAssertion<ACTUAL> charSequences;

    public AbstractCharSequenceAssert(ACTUAL actual) {
        super(actual);
        this.charSequences = new CharSequences<>();
    }

    /**
     * verify {@code actual} is empty or not.
     *
     * @return {@link AbstractCharSequenceAssert}.
     */
    @Override
    public AbstractCharSequenceAssert<ACTUAL> isEmpty() {
        charSequences.assertEmpty(info, actual);
        return this;
    }

    /**
     * verify {@code actual} is not empty or not.
     *
     * @return {@link AbstractCharSequenceAssert}.
     */
    @Override
    public AbstractCharSequenceAssert<ACTUAL> isNotEmpty() {
        charSequences.assertNotEmpty(info, actual);
        return this;
    }

    /**
     * verify {@code actual} is blank or not.
     *
     * @return {@link AbstractCharSequenceAssert}.
     */
    @Override
    public AbstractCharSequenceAssert<ACTUAL> isBlank() {
        charSequences.assertBlank(info, actual);
        return this;
    }

    /**
     * verify {@code actual} is not blank or not.
     *
     * @return {@link AbstractCharSequenceAssert}.
     */
    @Override
    public AbstractCharSequenceAssert<ACTUAL> isNotBlank() {
        charSequences.assertNotBlank(info, actual);
        return this;
    }

    /**
     * verify is equal to {@code expected} as ignore case.
     *
     * @param expected equal to {@code expected} includes ignore case too.
     * @return {@link AbstractCharSequenceAssert}.
     */
    @Override
    public AbstractCharSequenceAssert<ACTUAL> isEqualToIgnoreCase(ACTUAL expected) {
        objects.assertNotNull(info, actual);
        charSequences.assertEqualToIgnoreCase(info, actual, expected);
        return this;
    }

}
