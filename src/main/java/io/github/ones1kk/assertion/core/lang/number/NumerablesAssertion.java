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
package io.github.ones1kk.assertion.core.lang.number;

import io.github.ones1kk.assertion.core.feature.Offset;
import io.github.ones1kk.assertion.core.feature.Percentage;
import io.github.ones1kk.assertion.core.feature.compare.ComparableAssertion;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.ObjectsAssertion;

public interface NumerablesAssertion<ACTUAL extends Number> extends ComparableAssertion<ACTUAL>, ObjectsAssertion<ACTUAL> {

    void assertPositive(AssertionsInfo info, ACTUAL actual);

    void assertNotPositive(AssertionsInfo info, ACTUAL actual);

    void assertNegative(AssertionsInfo info, ACTUAL actual);

    void assertNotNegative(AssertionsInfo info, ACTUAL actual);

    void assertZero(AssertionsInfo info, ACTUAL actual);

    void assertNotZero(AssertionsInfo info, ACTUAL actual);

    void assertCloseTo(AssertionsInfo info, ACTUAL actual, ACTUAL expected, Offset<ACTUAL> offset);

    void assertCloseTo(AssertionsInfo info, ACTUAL actual, ACTUAL expected, Percentage<ACTUAL> percentage);

    void assertNotCloseTo(AssertionsInfo info, ACTUAL actual, ACTUAL expected, Offset<ACTUAL> offset);

    void assertNotCloseTo(AssertionsInfo info, ACTUAL actual, ACTUAL expected, Percentage<ACTUAL> percentage);
}
