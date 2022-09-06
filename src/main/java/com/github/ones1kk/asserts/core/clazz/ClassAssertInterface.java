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

package com.github.ones1kk.asserts.core.clazz;

import com.github.ones1kk.asserts.core.lang.model.IntegerAssert;

import java.lang.reflect.Field;

public interface ClassAssertInterface<SELF> {

    SELF isTypeOf(Object expected);

    SELF isNotTypeOf(Object expected);

    SELF isSuperclassOf(Class<?> expected);

    SELF isSubclassOf(Class<?> expected);

    SELF isPrimitive();

    SELF isInterface();

    SELF isAnnotation();

    SELF isFinalClass();

    SELF isAbstractClass();

    SELF isAnonymousClass();

    SELF isEnum();

    SELF isArray();

    SELF isMemberClass();

    SELF isLocalClass();

    IntegerAssert asFieldsLength();

}
