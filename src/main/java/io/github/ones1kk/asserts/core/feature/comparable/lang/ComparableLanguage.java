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

package io.github.ones1kk.asserts.core.feature.comparable.lang;

/**
 * <strong> The ComparableLanguage class compares comparable ELEMENT type parameter.</strong>
 *
 * @param <ELEMENT>
 */
public interface ComparableLanguage<ELEMENT extends java.lang.Comparable<ELEMENT>> {

    boolean isLessThan(ELEMENT actual, ELEMENT expected);

    boolean isLessThanOrEqualTo(ELEMENT actual, ELEMENT expected);

    boolean isGraterThan(ELEMENT actual, ELEMENT expected);

    boolean isGraterThanOrEqualTo(ELEMENT actual, ELEMENT expected);

    boolean is(ELEMENT actual, ELEMENT expected);

}
