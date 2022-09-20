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

package io.github.ones1kk.asserts.core.array.number;

import io.github.ones1kk.asserts.core.feature.comparable.LengthComparableAssert;
import io.github.ones1kk.asserts.core.feature.iterable.IterableAssert;

/**
 * <strong> The NumberArrayAssertInterface class is for a numerable, comparable, assertable interface class.</strong>
 *
 * @param <SELF>
 */
public interface NumberArrayAssertInterface<SELF> extends IterableAssert<SELF, Number>, LengthComparableAssert<SELF, Number[]> {

    SELF isMax(Number expected);

    SELF isMin(Number expected);

    SELF isSum(Number expected);
}
