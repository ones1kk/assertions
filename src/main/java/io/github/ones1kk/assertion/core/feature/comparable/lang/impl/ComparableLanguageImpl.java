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

package io.github.ones1kk.assertion.core.feature.comparable.lang.impl;

import io.github.ones1kk.assertion.core.feature.comparable.lang.ComparableLanguage;

/**
 * <strong> The ComparableLanguageImpl is an implementation class that compares the comparable java language type.</strong>
 *
 * @param <ELEMENT> {@code element}.
 */
public final class ComparableLanguageImpl<ELEMENT extends Comparable<ELEMENT>> implements ComparableLanguage<ELEMENT> {

    @Override
    public boolean isLessThan(ELEMENT actual, ELEMENT expected) {
        return actual.compareTo(expected) < 0;
    }

    @Override
    public boolean isLessThanOrEqualTo(ELEMENT actual, ELEMENT expected) {
        return actual.compareTo(expected) <= 0;
    }

    @Override
    public boolean isGreaterThan(ELEMENT actual, ELEMENT expected) {
        return actual.compareTo(expected) > 0;
    }

    @Override
    public boolean isGreaterThanOrEqualTo(ELEMENT actual, ELEMENT expected) {
        return actual.compareTo(expected) >= 0;
    }

    @Override
    public boolean is(ELEMENT actual, ELEMENT expected) {
        return actual.equals(expected);
    }
}
