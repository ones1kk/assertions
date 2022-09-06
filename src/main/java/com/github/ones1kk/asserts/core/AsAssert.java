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

import com.github.ones1kk.asserts.core.description.DescriptionHandler;

import java.util.function.Supplier;

/**
 * <strong> The AsAssert class has been implemented by {@link AsAssertInterface} </strong>
 * <br><br>
 * <p> Also, the AsAssert class is the top-level object of the AbstractAssert classes.</p>
 *
 * <p> Receive and cast Assert class as SELF type parameter, and receive {@link DescriptionHandler} <b>DI(Dependency Injection)</b></p>
 *
 * @param <SELF>
 */
public class AsAssert<SELF> implements AsAssertInterface<SELF> {

    public final DescriptionHandler handler = new DescriptionHandler();

    private final SELF self;

    @SuppressWarnings("unchecked")
    public AsAssert(Class<?> self) {
        this.self = (SELF) self.cast(this);
    }

    @Override
    public SELF as(Supplier<String> description, Object... args) {
        handler.setAsDescription(handler.from(description.get(), args));
        return self;
    }

    @Override
    public SELF as(String description, Object... args) {
        handler.setAsDescription(handler.from(description, args));
        return self;
    }

}
