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
package io.github.ones1kk.assertion.core.lang.object;

import io.github.ones1kk.assertion.core.info.AssertionsInfo;

/**
 * <strong> The ObjectsAssertion class is for a having Object Type, assertable assertion implementation class.</strong>
 *
 * @param <ACTUAL> {@code actual}.
 */
public interface ObjectsAssertion<ACTUAL> {

    void assertNull(AssertionsInfo info, ACTUAL actual);

    void assertNotNull(AssertionsInfo info, ACTUAL actual);

    void assertSameAs(AssertionsInfo info, ACTUAL actual, ACTUAL expected);

    void assertNotSameAs(AssertionsInfo info, ACTUAL actual, ACTUAL expected);

    void assertEqualTo(AssertionsInfo info, ACTUAL actual, ACTUAL expected);

    void assertNotEqualTo(AssertionsInfo info, ACTUAL actual, ACTUAL expected);

    void assertAssignableFrom(AssertionsInfo info, ACTUAL actual, Class<?> expected);

    void assertNotAssignableFrom(AssertionsInfo info, ACTUAL actual, Class<?> expected);

    void assertInstanceOf(AssertionsInfo info, ACTUAL actual, Class<?> expected);

    void assertNotInstanceOf(AssertionsInfo info, ACTUAL actual, Class<?> expected);

}
