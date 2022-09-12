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

package com.github.ones1kk.asserts.core;

import com.github.ones1kk.asserts.core.lang.object.ObjectAssertInterface;

/**
 * <strong> The AbstractAssert class is an abstract class of AbstractAssert classes to inherit the AsAssert class. </strong>
 * <br>
 * <p> This class is For Inheriting the top-level Object method interface and pass self for chaining to AsAssert.</p>
 *
 * <p> As with all AbstractAssert classes, this class receive {@code SELF} and {@code ACTUAL} by type parameter.</p>
 *
 * @param <SELF>
 * @param <ACTUAL>
 */
public abstract class AbstractAssert<SELF, ACTUAL> extends AsAssert<SELF> implements ObjectAssertInterface<SELF, ACTUAL> {

    protected AbstractAssert(Class<?> self) {
        super(self);
    }

}
