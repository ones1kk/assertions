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
package io.github.ones1kk.assertion.core.description.formatter.impl;

import io.github.ones1kk.assertion.core.constant.Colors;
import io.github.ones1kk.assertion.core.description.Description;
import io.github.ones1kk.assertion.core.description.formatter.Formattable;

/**
 * <p>The SimpleTextFormatter define error message format.</p>
 * <p>In the way defined as the simple printing way.</p>
 */
public final class SimpleTextFormatter implements Formattable {

    /**
     * <p> print expected, actual and description like below format.</p>
     *
     * <pre>
     *     <strong>{@code description}</strong>(expected:<strong>{@code expected}</strong> actual:<strong>{@code actual}</strong>)
     * </pre>
     *
     * @param actual      asserted target.
     * @param expected    expected target.
     * @param description defined description.
     * @return A formatted string.
     */
    @Override
    public String format(String description, Object actual, Object expected) {
        return String.format("%s%s(expected: %s, actual: %s)", Colors.RED.getValue(), description, expected, actual);
    }

    /**
     * <p> print actual and description like below format.</p>
     * <pre>
     *     <strong>{@code description}</strong>(actual: <strong>{@code actual}</strong>)
     * </pre>
     *
     * @param actual      asserted target.
     * @param description defined description.
     * @return A formatted string.
     */
    @Override
    public String format(String description, Object actual) {
        return String.format("%s%s(actual: %s)", Colors.RED.getValue(), description, actual);
    }

    /**
     * <p> print only description like below format.</p>
     * <pre>
     *     <strong>{@code description}</strong>
     * </pre>
     *
     * @param description defined description.
     * @return A formatted string.
     */
    @Override
    public String format(String description) {
        return String.format("%s%s", Colors.RED.getValue(), description);
    }

    /**
     * <p> print expected, actual and description like below format.</p>
     *
     * <pre>
     *     <strong>{@code description}</strong>(expected:<strong>{@code expected}</strong> actual:<strong>{@code actual}</strong>)
     * </pre>
     *
     * @param actual      asserted target.
     * @param expected    expected target.
     * @param description defined description.
     * @return A formatted string.
     */
    @Override
    public String format(Description description, Object actual, Object expected) {
        return String.format("%s%s(expected: %s, actual: %s)", Colors.RED.getValue(), description, expected, actual);
    }

    /**
     * <p> print actual and description like below format.</p>
     * <pre>
     *     <strong>{@code description}</strong>(actual: <strong>{@code actual}</strong>)
     * </pre>
     *
     * @param actual      asserted target.
     * @param description defined description.
     * @return A formatted string.
     */
    @Override
    public String format(Description description, Object actual) {
        return String.format("%s%s(actual: %s)", Colors.RED.getValue(), description, actual);
    }

    /**
     * <p> print only description like below format.</p>
     * <pre>
     *     <strong>{@code description}</strong>
     * </pre>
     *
     * @param description defined description.
     * @return A formatted string.
     */
    @Override
    public String format(Description description) {
        return String.format("%s%s", Colors.RED.getValue(), description);
    }
}
