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

package io.github.ones1kk.assertion.core.lang.number.shrt;

import io.github.ones1kk.assertion.core.feature.comparable.ComparableAssert;
import io.github.ones1kk.assertion.core.feature.number.NumerableAssert;
import io.github.ones1kk.assertion.core.lang.number.IntegerTypeAssertInterface;

/**
 * <strong> The ShortAssertInterface class is for a having Short type, assertable interface class.</strong>
 *
 * @param <SELF> {@code self}.
 */
public interface ShortAssertInterface<SELF> extends IntegerTypeAssertInterface<SELF>, NumerableAssert<SELF, Short>, ComparableAssert<SELF, Short> {
}