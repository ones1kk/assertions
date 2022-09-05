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

package com.github.ones1kk.asserts.core.clazz.enumtype.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.clazz.enumtype.EnumsInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Enums<ACTUAL extends Enum<ACTUAL>> extends Objects<ACTUAL> implements EnumsInterface<ACTUAL> {

    public Enums(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsFrom(ACTUAL actual, String expected) {
        Field[] fields = actual.getClass().getFields();
        System.out.println(Arrays.deepToString(fields));
    }
}
