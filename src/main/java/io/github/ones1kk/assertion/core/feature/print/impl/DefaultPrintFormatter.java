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

package io.github.ones1kk.assertion.core.feature.print.impl;

import io.github.ones1kk.assertion.core.feature.print.PrintFormatter;
import io.github.ones1kk.assertion.core.feature.print.constant.Colors;

/**
 * <strong> The DefaultPrintFormatter class has been implemented by {@link PrintFormatter}.</strong>
 *
 * <p> This class writes the final output of the description.</p>
 * <p> In the way defined as the default printing way.</p>
 */
public final class DefaultPrintFormatter implements PrintFormatter {

    /**
     * +---------------------------+
     * | <b> For internal use.</b> |
     * +---------------------------+
     *
     * <p> Print expected, actual and description format like below.</p>
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
    public String print(Object actual, Object expected, String description) {
        return String.format("%n%sExpected    : %s %n%sActual      : %s%n%sDescription : %s", Colors.WHITE.getValue(), Colors.RED.getValue() + expected, Colors.WHITE.getValue(), Colors.RED.getValue() + actual, Colors.WHITE.getValue(), Colors.RED.getValue() + description);
    }

    /**
     * +---------------------------+
     * | <b> For internal use.</b> |
     * +---------------------------+
     *
     * <p> Print actual and description format like below.</p>
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
    public String print(Object actual, String description) {
        return String.format("%n%sActual      : %s%n%sDescription : %s", Colors.WHITE.getValue(), Colors.RED.getValue() + actual, Colors.WHITE.getValue(), Colors.RED.getValue() + description);
    }

    /**
     * +---------------------------+
     * | <b> For internal use.</b> |
     * +---------------------------+
     *
     * <p> Print only description format like below.</p>
     * <pre>
     *     Description : description
     * </pre>
     *
     * @param description defined description.
     * @return formatted string.
     */
    @Override
    public String print(String description) {
        return String.format("%n%sDescription : %s", Colors.WHITE.getValue(), Colors.RED.getValue() + description);
    }
}
