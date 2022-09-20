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

package io.github.ones1kk.asserts.core.feature.iterable.containable.collection.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * <strong> The MapContainable class is that calculates the containable of an map.</strong>
 *
 * @param <ACTUAL>
 * @param <K>
 * @param <V>
 */
public final class MapContainable<ACTUAL extends Map<K, V>, K, V> {

    public boolean containsAllKey(ACTUAL actual, Map<? extends K, ?> expected) {
        Set<K> actualKeys = actual.keySet();
        return actualKeys.containsAll(expected.keySet());
    }

    public boolean doesNotContainAllKey(ACTUAL actual, Map<? extends K, ?> expected) {
        return !(containsAllKey(actual, expected));
    }

    public boolean containsAllValue(ACTUAL actual, Map<?, ? extends V> expected) {
        Collection<V> actualKeys = actual.values();
        return actualKeys.containsAll(expected.values());
    }

    public boolean doesNotContainAllValue(ACTUAL actual, Map<?, ? extends V> expected) {
        return !(containsAllValue(actual, expected));
    }

}
