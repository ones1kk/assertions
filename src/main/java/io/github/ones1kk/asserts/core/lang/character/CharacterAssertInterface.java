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

package io.github.ones1kk.asserts.core.lang.character;

import io.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;

/**
 * <strong> The CharacterAssertInterface class is for a having Character type, assertable interface class.</strong>
 *
 * @param <SELF> {@code self}.
 */
public interface CharacterAssertInterface<SELF> extends ComparableAssert<SELF, Character> {

    SELF isLowerCase();

    SELF isNotLowerCase();

    SELF isUpperCase();

    SELF isNotUpperCase();

    SELF isLetter();

    SELF isNotLetter();

    SELF isDigit();

    SELF isNotDigit();

    SELF isWhitespace();

    SELF isNotWhitespace();
}
