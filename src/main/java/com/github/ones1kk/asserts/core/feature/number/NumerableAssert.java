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

/**
 * <strong> The NumerableAssert class is for a numerable, assertable interface class.</strong>
 *
 * @param <SELF>
 * @param <ACTUAL>
 */
public interface NumerableAssert<SELF, ACTUAL extends Number> {

    SELF isPositive();

    SELF isNotPositive();

    SELF isNegative();

    SELF isNotNegative();

    SELF isZero();

    SELF isNotZero();

    SELF isCloseTo(ACTUAL expected, Offset<ACTUAL> offset);

    SELF isCloseTo(ACTUAL expected, Double percentage);

    SELF isNotCloseTo(ACTUAL expected, Offset<ACTUAL> offset);

    SELF isNotCloseTo(ACTUAL expected, Double percentage);
}
