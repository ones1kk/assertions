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

import java.lang.reflect.Field;

public interface ClassesInterface<ACTUAL extends Class<?>> {

    void assertIsTypeOf(Class<?> actual, Object expected);

    void assertIsNotTypeOf(Class<?> actual, Object expected);

    void assertIsSuperclassOf(Class<?> actual, Class<?> expected);

    void assertIsSubclassOf(Class<?> actual, Class<?> expected);

    void assertIsPrimitive(Class<?> actual);

    void assertIsInterface(Class<?> actual);

    void assertIsAnnotation(Class<?> actual);

    void assertIsFinalClass(Class<?> actual);

    void assertIsAbstractClass(Class<?> actual);

    void assertIsAnonymousClass(Class<?> actual);

    void assertIsEnum(Class<?> actual);

    void assertIsArray(Class<?> actual);

    void assertIsMemberClass(Class<?> actual);

    void assertIsLocalClass(Class<?> actual);

    void assertContainsField(Class<?> actual, Field expected);

    void assertDoesNotContainField(Class<?> actual, Field expected);

    void assertContainsAllFields(Class<?> actual, Field... expected);

    void assertContainsAnyFields(Class<?> actual, Field... expected);
}
