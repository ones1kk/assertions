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

import io.github.ones1kk.assertion.core.lang.number.DivisiblesAssertion;
import io.github.ones1kk.assertion.core.lang.number.integers.Integers;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.string.Strings;
import io.github.ones1kk.assertion.core.lang.string.StringsAssertion;

import java.net.URL;

/**
 * <strong> The AbstractUrlAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the URL type and verify assertion.</p>
 */
public abstract class AbstractUrlAssert extends AbstractObjectAssert<AbstractUrlAssert, URL> implements UrlAssertion<AbstractUrlAssert> {

    private final UrlsAssertion urls;

    private final StringsAssertion<String> strings;

    private final DivisiblesAssertion<Integer> integers;

    public AbstractUrlAssert(Class<?> self, URL actual) {
        super(self, actual);
        this.urls = new Urls();
        this.strings = new Strings();
        this.integers = new Integers();
    }

    /**
     * verify actual has host.
     *
     * @param expected expected
     * @return {@link AbstractUrlAssert}
     */
    @Override
    public AbstractUrlAssert hasHost(String expected) {
        urls.assertNotNull(info, actual);
        strings.assertNotNull(info, expected);
        strings.assertNotEmpty(info, expected);
        strings.assertNotBlank(info, expected);
        urls.assertHasHost(info, actual, expected);
        return self;
    }

    /**
     * verify actual does not have host.
     *
     * @return {@link AbstractUrlAssert}
     */
    @Override
    public AbstractUrlAssert doesNotHaveHost() {
        urls.assertNotNull(info, actual);
        urls.assertDoesNotHaveHost(info, actual);
        return self;
    }

    /**
     * verify actual has expected host.
     *
     * @param expected expected
     * @return {@link AbstractUrlAssert}
     */
    @Override
    public AbstractUrlAssert hasPort(int expected) {
        urls.assertNotNull(info, actual);
        integers.assertNotNull(info, expected);
        urls.assertHasPort(info, actual, expected);
        return self;
    }

    /**
     * verify actual does not have port.
     *
     * @return {@link AbstractUrlAssert}
     */
    @Override
    public AbstractUrlAssert doesNotHavePort() {
        urls.assertNotNull(info, actual);
        urls.assertDoesNotHavePort(info, actual);
        return self;
    }

    /**
     * verify actual has expected path.
     *
     * @param expected expected
     * @return {@link AbstractUrlAssert}
     */
    @Override
    public AbstractUrlAssert hasPath(String expected) {
        urls.assertNotNull(info, actual);
        strings.assertNotNull(info, expected);
        strings.assertNotEmpty(info, expected);
        strings.assertNotBlank(info, expected);
        urls.assertHasPath(info, actual, expected);
        return self;
    }

    /**
     * verify actual does not have path.
     *
     * @return {@link AbstractUrlAssert}
     */
    @Override
    public AbstractUrlAssert doesNotHavePath() {
        urls.assertDoesNotHavePath(info, actual);
        urls.assertNotNull(info, actual);
        return self;
    }
}
