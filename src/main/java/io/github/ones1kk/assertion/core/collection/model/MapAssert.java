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

package io.github.ones1kk.assertion.core.collection.model;

import io.github.ones1kk.assertion.core.collection.map.AbstractMapAssert;

import java.util.Map;

/**
 * <strong> The MapAssert class inherits {@link AbstractMapAssert} </strong>
 *
 * @param <ACTUAL> {@code actual}.
 * @param <K>      {@code k}.
 * @param <V>      {@code v}.
 */
public class MapAssert<ACTUAL extends Map<K, V>, K, V> extends AbstractMapAssert<MapAssert<ACTUAL, K, V>, ACTUAL, K, V> {

    public MapAssert(ACTUAL actual) {
        super(MapAssert.class, actual);
    }
}
