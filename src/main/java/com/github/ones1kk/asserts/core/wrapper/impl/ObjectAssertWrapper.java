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

package com.github.ones1kk.asserts.core.wrapper.impl;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.description.impl.Description;
import com.github.ones1kk.asserts.core.feature.print.Printer;
import com.github.ones1kk.asserts.core.feature.print.impl.DefaultPrinter;
import com.github.ones1kk.asserts.core.lang.model.ObjectAssert;
import com.github.ones1kk.asserts.core.wrapper.AssertWrapper;

import java.util.function.Supplier;

@Deprecated
public class ObjectAssertWrapper implements AssertWrapper<ObjectAssert> {

    protected final Describable describable = new Description();

    protected final Printer printer = new DefaultPrinter();


    @Override
    public ObjectAssert as(Supplier<String> description, Object... args) {
        String asDescription = describable.as(description, args);
        return null;
    }

    @Override
    public ObjectAssert as(String description, Object... args) {
        String asDescription = describable.as(description, args);
        return null;
    }
}
