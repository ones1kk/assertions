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

package io.github.ones1kk.asserts.core.lang.object;

import io.github.ones1kk.asserts.core.AsAssert;
import io.github.ones1kk.asserts.core.description.DescriptionHandler;

/**
 * <strong> The AbstractObjects is an abstract class of implementation classes of AbstractAssert classes. </strong>
 * <br>
 * <p> It is the place where the actual verification of the assertion is worked and at the same time it is the place where the exception is thrown.</p>
 *
 * <p> Using {@link DescriptionHandler}, set default Description to be used when Exception is thrown and throw Exception.</p>
 *
 * <p> All of AbstractAssert class of implementation classes have to be injected {@link AsAssert}, Because {@link AbstractObjectAssert} has inherited {@link AsAssert} </p>
 * <b> It is expressed as an implementation class, but structurally, it is not an implementation class.</b>
 *
 * @param <ACTUAL> {@code actual}.
 */
public abstract class AbstractObjects<ACTUAL> implements ObjectsInterface<ACTUAL> {

    protected final AsAssert<?> asAssert;

    protected final DescriptionHandler handler;

    protected AbstractObjects(AsAssert<?> asAssert) {
        this.asAssert = asAssert;
        this.handler = asAssert.handler;
    }

}
