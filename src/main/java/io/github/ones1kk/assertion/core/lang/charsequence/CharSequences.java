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

import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.info.ErrorMessageInfo;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.CharSequenceErrorMessages;
import org.apache.commons.lang3.StringUtils;

/**
 * <strong> The CharSequences class inherits {@link Objects} </strong>
 */
public class CharSequences<ACTUAL extends CharSequence> extends Objects<ACTUAL> implements CharSequencesAssertion<ACTUAL> {

    /**
     * assert actual is empty.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertEmpty(AssertionsInfo info, CharSequence actual) {
        if (!StringUtils.isEmpty(actual)) {
            throw failures.failure(info, CharSequenceErrorMessages.shouldBeEmpty(actual));
        }
    }

    /**
     * assert actual is not empty.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotEmpty(AssertionsInfo info, CharSequence actual) {
        if (StringUtils.isEmpty(actual)) {
            throw failures.failure(info, CharSequenceErrorMessages.shouldNotBeEmpty(actual));
        }
    }

    /**
     * assert actual is blank.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertBlank(AssertionsInfo info, CharSequence actual) {
        if (StringUtils.isNotBlank(actual)) {
            throw failures.failure(info, CharSequenceErrorMessages.shouldBeBlank(actual));
        }
    }

    /**
     * assert actual is not blank.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotBlank(AssertionsInfo info, CharSequence actual) {
        if (StringUtils.isBlank(actual)) {
            throw failures.failure(info, CharSequenceErrorMessages.shouldNotBeBlank(actual));
        }
    }

    /**
     * assert actual is equal to ignore case expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertEqualToIgnoreCase(AssertionsInfo info, CharSequence actual, CharSequence expected) {
        if (!StringUtils.equalsIgnoreCase(actual, expected)) {
            throw failures.failure(info, CharSequenceErrorMessages.shouldBeEqualToIgnoreCase(actual, expected));
        }
    }

}
