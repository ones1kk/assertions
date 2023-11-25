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
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.URLErrorMessage;
import org.apache.commons.lang3.StringUtils;

import java.net.URL;

public class Urls extends Objects<URL> implements UrlsAssertion {

    /**
     * verify actual has host.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertHasHost(AssertionsInfo info, URL actual, String expected) {
        if (StringUtils.isEmpty(actual.getHost()) || !actual.getHost().equals(expected)) {
            throw failures.failure(info, URLErrorMessage.shouldHaveHost(actual, expected));
        }
    }

    /**
     * verify actual does not have host.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertDoesNotHaveHost(AssertionsInfo info, URL actual) {
        if (!StringUtils.isEmpty(actual.getHost())) {
            throw failures.failure(info, URLErrorMessage.shouldDoNotHaveHost(actual));
        }
    }

    /**
     * verify actual has expected host.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertHasPort(AssertionsInfo info, URL actual, int expected) {
        int port = actual.getPort() == -1 ? actual.getDefaultPort() : actual.getPort();
        if (port != expected) {
            throw failures.failure(info, URLErrorMessage.shouldDoNotHavePort(actual));
        }
    }

    /**
     * verify actual does not have port.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertDoesNotHavePort(AssertionsInfo info, URL actual) {
        int port = actual.getPort() == -1 ? actual.getDefaultPort() : actual.getPort();
        if (port != -1) {
            throw failures.failure(info, URLErrorMessage.shouldDoNotHavePort(actual));
        }
    }

    /**
     * verify actual has expected path.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertHasPath(AssertionsInfo info, URL actual, String expected) {
        if (StringUtils.isEmpty(actual.getPath()) || !actual.getPath().equals(expected)) {
            throw failures.failure(info, URLErrorMessage.shouldHavePath(actual, expected));
        }
    }

    /**
     * verify actual does not have path.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertDoesNotHavePath(AssertionsInfo info, URL actual) {
        if (!StringUtils.isEmpty(actual.getPath())) {
            throw failures.failure(info, URLErrorMessage.shouldDoNotHavePath(actual));
        }
    }

}
