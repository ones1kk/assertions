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

import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

import java.net.URL;

/**
 * <strong> The AbstractUrlAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the URL type and verify assertion.</p>
 *
 * @param <SELF> {@code self}.
 */
public class AbstractUrlAssert<SELF extends AbstractUrlAssert<SELF>> extends AbstractObjectAssert<SELF, URL> implements UrlAssertInterface<SELF> {

    private final UrlsInterface urls;

    public AbstractUrlAssert(Class<?> self, URL actual) {
        super(self, actual);
        this.urls = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} has host as {@code expected} or not.
     *
     * @param expected same host {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF hasHost(String expected) {
        urls.assertHasHost(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} does not have host or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF doesNotHaveHost() {
        urls.assertDoesNotHaveHost(actual);
        return self;
    }

    /**
     * Verify {@code actual} has port as {@code expected} or not.
     *
     * @param expected same port {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF hasPort(int expected) {
        urls.assertHasPort(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} does not have port or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF doesNotHavePort() {
        urls.assertDoesNotHavePort(actual);
        return self;
    }

    /**
     * Verify {@code actual} has path as {@code expected} or not.
     *
     * @param expected same path {@code actual}.
     * @return {@code self}.
     */
    @Override
    public SELF hasPath(String expected) {
        urls.assertHasPath(actual, expected);
        return self;
    }

    /**
     * Verify {@code actual} does not have path or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF doesNotHavePath() {
        urls.assertDoesNotHavePath(actual);
        return self;
    }
}
