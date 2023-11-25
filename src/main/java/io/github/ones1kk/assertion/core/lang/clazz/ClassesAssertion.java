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
package io.github.ones1kk.assertion.core.lang.clazz;

import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.ObjectsAssertion;

public interface ClassesAssertion extends ObjectsAssertion<Class<?>> {

    void assertTypeOf(AssertionsInfo info, Class<?> actual, Object expected);

    void assertNotTypeOf(AssertionsInfo info, Class<?> actual, Object expected);

    void assertSuperclassOf(AssertionsInfo info, Class<?> actual, Class<?> expected);

    void assertSubclassOf(AssertionsInfo info, Class<?> actual, Class<?> expected);

    void assertPrimitive(AssertionsInfo info, Class<?> actual);

    void assertInterface(AssertionsInfo info, Class<?> actual);

    void assertAnnotation(AssertionsInfo info, Class<?> actual);

    void assertFinalClass(AssertionsInfo info, Class<?> actual);

    void assertAbstractClass(AssertionsInfo info, Class<?> actual);

    void assertAnonymousClass(AssertionsInfo info, Class<?> actual);

    void assertEnum(AssertionsInfo info, Class<?> actual);

    void assertArray(AssertionsInfo info, Class<?> actual);

    void assertMemberClass(AssertionsInfo info, Class<?> actual);

    void assertLocalClass(AssertionsInfo info, Class<?> actual);

    void assertAssignableFrom(AssertionsInfo info, Class<?> actual, Class<?> expected);

    void assertNotAssignableFrom(AssertionsInfo info, Class<?> actual, Class<?> expected);
}
