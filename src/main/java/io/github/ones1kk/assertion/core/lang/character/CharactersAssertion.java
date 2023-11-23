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
package io.github.ones1kk.assertion.core.lang.character;

import io.github.ones1kk.assertion.core.feature.compare.ComparableAssertion;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;

public interface CharactersAssertion extends ComparableAssertion<Character> {

    void assertLowerCase(AssertionsInfo info, Character actual);

    void assertNotLowerCase(AssertionsInfo info, Character actual);

    void assertUpperCase(AssertionsInfo info, Character actual);

    void assertNotUpperCase(AssertionsInfo info, Character actual);

    void assertLetter(AssertionsInfo info, Character actual);

    void assertNotLetter(AssertionsInfo info, Character actual);

    void assertDigit(AssertionsInfo info, Character actual);

    void assertNotDigit(AssertionsInfo info, Character actual);

    void assertWhitespace(AssertionsInfo info, Character actual);

    void assertNotWhitespace(AssertionsInfo info, Character actual);

}
