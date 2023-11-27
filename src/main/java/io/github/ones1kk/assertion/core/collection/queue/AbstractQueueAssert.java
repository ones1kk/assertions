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
package io.github.ones1kk.assertion.core.collection.queue;

import io.github.ones1kk.assertion.core.collection.AbstractCollectionAssert;

import java.util.Queue;

/**
 * <strong> The AbstractListAssert class inherits {@link AbstractQueueAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the List type and verify assertion.</p>
 */
public abstract class AbstractQueueAssert<ACTUAL> extends AbstractCollectionAssert<AbstractQueueAssert<ACTUAL>, ACTUAL> {

    public AbstractQueueAssert(Class<?> self, Queue<ACTUAL> actual) {
        super(self, actual);
    }

}
