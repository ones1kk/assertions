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

package io.github.ones1kk.assertion.core.lang.string.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.lang.charsequence.impl.CharSequences;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.string.StringsInterface;
import io.github.ones1kk.assertion.core.message.StringErrorMessages;

import java.util.regex.Pattern;

/**
 * <strong> The Strings class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Strings extends CharSequences implements StringsInterface<String> {

    public Strings(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertMatches(String actual, String expected) {
        if (!actual.matches(expected)) {
            handler.receive(actual, StringErrorMessages.shouldMatches(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertMatches(String actual, Pattern expected) {
        if(!expected.matcher(actual).matches()) {
            handler.receive(actual, StringErrorMessages.shouldMatches(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasText(String actual) {
        for (char c : actual.toCharArray()) {
            if(!Character.isWhitespace(c)) {
                return;
            }
        }
        handler.receive(actual, StringErrorMessages.shouldHasText(actual));
        throw handler.getException();
    }

    @Override
    public void assertHasLength(String actual, int expected) {
        if(actual.length() != expected) {
            handler.receive(actual, StringErrorMessages.shouldHasLength(actual));
            throw handler.getException();
        }
    }

}
