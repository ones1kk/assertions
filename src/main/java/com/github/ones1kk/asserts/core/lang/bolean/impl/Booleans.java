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

package com.github.ones1kk.asserts.core.lang.bolean.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.lang.bolean.BooleansInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

/**
 * <strong> The Booleans class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public class Booleans extends Objects<Boolean> implements BooleansInterface<Boolean> {

    public Booleans(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsFalse(Boolean actual) {
        if (actual) {
            handler.setDescription(handler.from("actual is true"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsTrue(Boolean actual) {
        if (!actual) {
            handler.setDescription(handler.from("actual is false"));
            throw handler.getException();
        }
    }
}
