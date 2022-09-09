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

package com.github.ones1kk.asserts.core.feature.number;

import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.data.Percentage;

public interface Numerable<ACTUAL extends Number> {

    void assertIsPositive(ACTUAL actual);

    void assertIsNotPositive(ACTUAL actual);

    void assertIsNegative(ACTUAL actual);

    void assertIsNotNegative(ACTUAL actual);

    void assertIsZero(ACTUAL actual);

    void assertIsNotZero(ACTUAL actual);

    void assertIsCloseTo(ACTUAL actual, ACTUAL expected, Offset<ACTUAL> offset);

    void assertIsCloseTo(ACTUAL actual, ACTUAL expected, Percentage<ACTUAL> percentage);

    void assertIsNotCloseTo(ACTUAL actual, ACTUAL expected, Offset<ACTUAL> offset);

    void
    assertIsNotCloseTo(ACTUAL actual, ACTUAL expected, Percentage<ACTUAL> percentage);

}
