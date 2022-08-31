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

package com.github.ones1kk.asserts.core.lang.charsequence.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.lang.charsequence.CharSequencesInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import org.apache.commons.lang3.StringUtils;

public class CharSequences extends Objects<CharSequence> implements CharSequencesInterface<CharSequence> {

    public CharSequences(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEmpty(CharSequence actual) {
        if (!StringUtils.isEmpty(actual)) {
            handler.setDescription(handler.from(actual, "{} is not empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEmpty(CharSequence actual) {
        if (StringUtils.isEmpty(actual)) {
            handler.setDescription(handler.from(actual, "{} is empty"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBlank(CharSequence actual) {
        if (StringUtils.isNotBlank(actual)) {
            handler.setDescription(handler.from(actual, "{} is not blank"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotBlank(CharSequence actual) {
        if (StringUtils.isBlank(actual)) {
            handler.setDescription(handler.from(actual, "{} is blank"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEqualToIgnoreCase(CharSequence actual, CharSequence expected) {
        if (!StringUtils.equalsIgnoreCase(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not equal as ignore case with {}"));
            throw handler.getException();
        }
    }
}
