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

package io.github.ones1kk.asserts.core.lang.charsequence.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import io.github.ones1kk.asserts.core.lang.charsequence.CharSequencesInterface;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.asserts.core.lang.object.impl.Objects;
import io.github.ones1kk.asserts.core.message.CharSequenceErrorMessages;
import org.apache.commons.lang3.StringUtils;

/**
 * <strong> The CharSequences class inherits {@link AbstractObjectAssert} </strong>
 */
public class CharSequences extends Objects<CharSequence> implements CharSequencesInterface<CharSequence> {

    public CharSequences(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(CharSequence actual) {
        if (!StringUtils.isEmpty(actual)) {
            handler.receive(actual, CharSequenceErrorMessages.shouldBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(CharSequence actual) {
        if (StringUtils.isEmpty(actual)) {
            handler.receive(actual, CharSequenceErrorMessages.shouldNotBeEmpty(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBlank(CharSequence actual) {
        if (StringUtils.isNotBlank(actual)) {
            handler.receive(actual, CharSequenceErrorMessages.shouldBeBlank(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotBlank(CharSequence actual) {
        if (StringUtils.isBlank(actual)) {
            handler.receive(actual, CharSequenceErrorMessages.shouldNotBeBlank(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEqualToIgnoreCase(CharSequence actual, CharSequence expected) {
        if (!StringUtils.equalsIgnoreCase(actual, expected)) {
            handler.receive(actual, expected, CharSequenceErrorMessages.shouldBeEqualToIgnoreCase(actual, expected));
            throw handler.getException();
        }
    }
}
