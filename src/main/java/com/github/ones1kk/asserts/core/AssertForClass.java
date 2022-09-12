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

import com.github.ones1kk.asserts.core.clazz.AbstractClassAssert;
import com.github.ones1kk.asserts.core.clazz.enumtype.AbstractEnumAssert;
import com.github.ones1kk.asserts.core.clazz.model.ClassAssert;
import com.github.ones1kk.asserts.core.clazz.model.EnumAssert;

/**
 * <strong> The AssertForClass class has the role of passing the values of class type that are entered for Assertion to each Assert. </strong>
 * <br>
 * <p> The role of declaration referring to the <b>SRP(Single Responsibility Principle)</b>
 * is designed by separating the Assert class and the AbstractAssert class to perform the actual assertion.</p>
 */
public final class AssertForClass {

    public static AbstractClassAssert<?> that(Class<?> actual) {
        return new ClassAssert(actual);
    }

    public static <ACTUAL extends Enum<ACTUAL>> AbstractEnumAssert<?, ACTUAL> that(ACTUAL actual) {
        return new EnumAssert<>(actual);
    }
}
