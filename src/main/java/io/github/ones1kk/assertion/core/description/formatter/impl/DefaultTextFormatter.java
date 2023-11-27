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
 * <p>The DefaultTextFormatter define error message format.</p>
 * <p>In the way defined as the default printing way.</p>
 */
public class DefaultTextFormatter implements Formattable {

    /**
     * <p> print expected, actual and description like below format.</p>
     * <pre>
     *     Expected    : expected
     *     Actual      : actual
     *     Description : description
     * </pre>
     *
     * @param actual      asserted target.
     * @param expected    expected target.
     * @param description defined description.
     * @return formatted string.
     */
    @Override
    public String format(String description, Object actual, Object expected) {
        return String.format("%n%sExpected    : %s %n%sActual      : %s%n%sDescription : %s", Colors.WHITE.getValue(), Colors.RED.getValue() + expected, Colors.WHITE.getValue(), Colors.RED.getValue() + actual, Colors.WHITE.getValue(), Colors.RED.getValue() + description);
    }

    /**
     * <p> print actual and description like below format.</p>
     * <pre>
     *     Actual      : actual
     *     Description : description
     * </pre>
     *
     * @param actual      asserted target.
     * @param description defined description.
     * @return formatted string.
     */
    @Override
    public String format(String description, Object actual) {
        return String.format("%n%sActual      : %s%n%sDescription : %s", Colors.WHITE.getValue(), Colors.RED.getValue() + actual, Colors.WHITE.getValue(), Colors.RED.getValue() + description);
    }

    /**
     * <p> print only description like below format.</p>
     * <pre>
     *     Description : description
     * </pre>
     *
     * @param description defined description.
     * @return formatted string.
     */
    @Override
    public String format(String description) {
        return String.format("%n%sDescription : %s", Colors.WHITE.getValue(), Colors.RED.getValue() + description);
    }

    /**
     * <p> print expected, actual and description like below format.</p>
     * <pre>
     *     Expected    : expected
     *     Actual      : actual
     *     Description : description
     * </pre>
     *
     * @param actual      asserted target.
     * @param expected    expected target.
     * @param description defined description.
     * @return formatted string.
     */
    @Override
    public String format(Description description, Object actual, Object expected) {
        return String.format("%n%sExpected    : %s %n%sActual      : %s%n%sDescription : %s", Colors.WHITE.getValue(), Colors.RED.getValue() + expected, Colors.WHITE.getValue(), Colors.RED.getValue() + actual, Colors.WHITE.getValue(), Colors.RED.getValue() + description);
    }

    /**
     * <p> print actual and description like below format.</p>
     * <pre>
     *     Actual      : actual
     *     Description : description
     * </pre>
     *
     * @param actual      asserted target.
     * @param description defined description.
     * @return formatted string.
     */
    @Override
    public String format(Description description, Object actual) {
        return String.format("%n%sActual      : %s%n%sDescription : %s", Colors.WHITE.getValue(), Colors.RED.getValue() + actual, Colors.WHITE.getValue(), Colors.RED.getValue() + description);
    }

    /**
     * <p> print only description like below format.</p>
     * <pre>
     *     Description : description
     * </pre>
     *
     * @param description defined description.
     * @return formatted string.
     */
    @Override
    public String format(Description description) {
        return String.format("%n%sDescription : %s", Colors.WHITE.getValue(), Colors.RED.getValue() + description);
    }
}
