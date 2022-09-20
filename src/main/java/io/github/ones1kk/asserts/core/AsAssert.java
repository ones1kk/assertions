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

package io.github.ones1kk.asserts.core;

import io.github.ones1kk.asserts.core.description.DescriptionHandler;
import io.github.ones1kk.asserts.core.exception.AssertException;

import java.util.function.Supplier;

/**
 * <strong> The AsAssert class has been implemented by {@link AsAssertInterface} </strong>
 * <br>
 * <p> Also, the AsAssert class is the top-level object of the AbstractAssert classes.</p>
 *
 * <p> Receive and cast Assert class as SELF type parameter, and receive {@link DescriptionHandler} <b>DI(Dependency Injection)</b></p>
 *
 * @param <SELF> {@code self}.
 */
public class AsAssert<SELF> implements AsAssertInterface<SELF> {

    public DescriptionHandler handler = new DescriptionHandler();

    private final SELF self;

    @SuppressWarnings("unchecked")
    public AsAssert(Class<?> self) {
        this.self = (SELF) self.cast(this);
    }

    /**
     * <p> The description of the assertion is defined by the user. </p>
     *
     * <p> Also, this method uses {@link String#format(String, Object...)}, {@link String#replace(char, char)} internally.</p>
     *
     * <p>How to use</p>
     * <pre>
     *     as({@link Supplier}, argument);
     *
     *     as("description is {}", argument);
     * </pre>
     *
     * <p> Below is some cases where an {@link AssertException} is thrown. </p>
     *
     * <pre>
     *     Case1
     *     Description contains special character '%s'.
     *
     *     Case2
     *     Description contains '{}' but arguments are empty.
     *
     *     Case3
     *     Arguments are not empty but description contains brace('{}').
     * </pre>
     *
     * @param description description as using assertion.
     * @param args        variable inserted in brace.
     * @return {@code self}.
     */
    @Override
    public SELF as(Supplier<String> description, Object... args) {
        handler.receiveAsDescription(description.get(), args);
        return self;
    }

    /**
     * <p> The description of the assertion is defined by the user. </p>
     *
     * <p> Also, this method uses {@link String#format(String, Object...)}, {@link String#replace(char, char)} internally.</p>
     *
     * <p>How to use</p>
     * <pre>
     *     as({@link Supplier}, argument);
     *
     *     as("description is {}", argument);
     * </pre>
     *
     * <p> Below is some cases where an {@link AssertException} is thrown. </p>
     *
     * <pre>
     *     Case1
     *     Description contains special character '%s'.
     *
     *     Case2
     *     Description contains '{}' but arguments are empty.
     *
     *     Case3
     *     Arguments are not empty but description contains brace('{}').
     * </pre>
     *
     * @param description description as using assertion.
     * @param args        variable inserted in brace.
     * @return {@code self}.
     */
    @Override
    public SELF as(String description, Object... args) {
        handler.receiveAsDescription(description, args);
        return self;
    }

}
