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
package io.github.ones1kk.assertion.core.net;

import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.ObjectsAssertion;

import java.net.URL;

public interface UrlsAssertion extends ObjectsAssertion<URL> {

    void assertHasHost(AssertionsInfo info, URL actual, String expected);

    void assertDoesNotHaveHost(AssertionsInfo info, URL actual);

    void assertHasPort(AssertionsInfo info, URL actual, int expected);

    void assertDoesNotHavePort(AssertionsInfo info, URL actual);

    void assertHasPath(AssertionsInfo info, URL actual, String expected);

    void assertDoesNotHavePath(AssertionsInfo info, URL actual);


}
