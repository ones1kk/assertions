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
package io.github.ones1kk.assertion.core;

import io.github.ones1kk.assertion.core.lang.character.CharacterAssert;
import io.github.ones1kk.assertion.core.lang.charsequence.CharSequenceAssert;
import io.github.ones1kk.assertion.core.lang.number.bytes.ByteAssert;
import io.github.ones1kk.assertion.core.lang.number.integers.IntegerAssert;
import io.github.ones1kk.assertion.core.lang.number.longs.LongAssert;
import io.github.ones1kk.assertion.core.lang.object.ObjectAssert;
import io.github.ones1kk.assertion.core.lang.string.StringAssert;

/**
 * The AssertsForType Class is for Assertions of JDK Type.
 */
public class AssertsForType {

    private AssertsForType() {
    }

    public static ObjectAssert that(Object actual) {
        return new ObjectAssert(actual);
    }

    public static CharSequenceAssert that(CharSequence actual) {
        return new CharSequenceAssert(actual);
    }

    public static StringAssert that(String actual) {
        return new StringAssert(actual);
    }

    public static CharacterAssert that(Character actual) {
        return new CharacterAssert(actual);
    }

    public static IntegerAssert that(Integer actual) {
        return new IntegerAssert(actual);
    }

    public static LongAssert that(Long actual) {
        return new LongAssert(actual);
    }

    public static ByteAssert that(Byte actual) {
        return new ByteAssert(actual);
    }

}
