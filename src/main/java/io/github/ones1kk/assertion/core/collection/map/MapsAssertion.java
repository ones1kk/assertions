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

package io.github.ones1kk.assertion.core.collection.map;

import io.github.ones1kk.assertion.core.feature.comparable.size.SizeComparable;
import io.github.ones1kk.assertion.core.feature.iterable.collection.MapIterable;

import java.util.Map;

/**
 * <strong> The MapsInterface class is for a comparable, iterable, assertable assertion implementation class.</strong>
 *
 * @param <ELEMENT> {@code element}.
 */
public interface MapsAssertion<ELEMENT extends Map<K, V>, K, V> extends MapIterable<ELEMENT, K, V>, SizeComparable<ELEMENT> {
}
