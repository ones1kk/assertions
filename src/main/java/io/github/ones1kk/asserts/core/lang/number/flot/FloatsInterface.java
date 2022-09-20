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

package io.github.ones1kk.asserts.core.lang.number.flot;

import io.github.ones1kk.asserts.core.feature.comparable.Comparable;
import io.github.ones1kk.asserts.core.feature.number.Numerable;

/**
 * <strong> The FloatsInterface class is for a having Float Type, assertable assertion implementation class.</strong>
 *
 * @param <ACTUAL> {@code actual}.
 */
public interface FloatsInterface<ACTUAL> extends Comparable<ACTUAL>, Numerable<Float> {

    void assertIsInfinity(ACTUAL actual);

    void assertIsFinite(ACTUAL actual);

    void assertIsNaN(ACTUAL actual);
}
