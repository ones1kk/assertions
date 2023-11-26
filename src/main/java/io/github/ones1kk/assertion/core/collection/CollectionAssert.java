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
package io.github.ones1kk.assertion.core.collection;

import io.github.ones1kk.assertion.core.ConfigurationAsserts;
import io.github.ones1kk.assertion.core.description.formatter.Formattable;

import java.util.Collection;

public class CollectionAssert<ELEMENT> extends AbstractCollectionAssert<CollectionAssert<ELEMENT>, ELEMENT>
        implements ConfigurationAsserts<AbstractCollectionAssert<CollectionAssert<ELEMENT>, ELEMENT>, Formattable> {

    public CollectionAssert(Collection<ELEMENT> actual) {
        super(AbstractCollectionAssert.class, actual);
    }

    @Override
    public AbstractCollectionAssert<CollectionAssert<ELEMENT>, ELEMENT> configure(Formattable formattable) {
        info.configure(formattable);
        return self;
    }
}
