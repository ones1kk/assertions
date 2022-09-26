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

package io.github.ones1kk.assertion.core.lang.model;

import io.github.ones1kk.assertion.core.lang.charsequence.AbstractCharSequenceAssert;

/**
 * <strong> The CharSequenceAssert class inherits {@link AbstractCharSequenceAssert} </strong>
 */
public class CharSequenceAssert extends AbstractCharSequenceAssert<CharSequenceAssert, CharSequence> {

    public CharSequenceAssert(CharSequence actual) {
        super(CharSequenceAssert.class, actual);
    }
}