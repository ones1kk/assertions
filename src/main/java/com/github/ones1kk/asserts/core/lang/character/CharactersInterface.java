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

package com.github.ones1kk.asserts.core.lang.character;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;

public interface CharactersInterface<ACTUAL> extends Comparable<ACTUAL> {

    void assertIsLowerCase(ACTUAL actual);

    void assertIsNotLowerCase(ACTUAL actual);

    void assertIsUpperCase(ACTUAL actual);

    void assertIsNotUpperCase(ACTUAL actual);

    void assertIsLetter(ACTUAL actual);

    void assertIsNotLetter(ACTUAL actual);

    void assertIsDigit(ACTUAL actual);

    void assertIsNotDigit(ACTUAL actual);

    void assertIsWhitespace(ACTUAL actual);

    void assertIsNotWhitespace(ACTUAL actual);

}
