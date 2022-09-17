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

package com.github.ones1kk.asserts.core.feature.print.impl;

import com.github.ones1kk.asserts.core.feature.print.PrintFormatter;

import static com.github.ones1kk.asserts.core.feature.print.constant.Colors.RED;

/**
 * <strong> The SimplePrintFormatter class has been implemented by {@link PrintFormatter}.</strong>
 *
 * <p> This class writes the final output of the description.</p>
 * <p> In the way defined as the simple printing way.</p>
 */
public final class SimplePrintFormatter implements PrintFormatter {

    /**
     * +---------------------------+
     * | <b> For internal use.</b> |
     * +---------------------------+
     *
     * <p> Print expected, actual and description format like below.</p>
     *
     * <pre>
     *     <strong>{@code description}</strong>(expected:<strong>{@code expected}</strong> actual: <strong>{@code actual}</strong>)
     * </pre>
     *
     * @param actual      asserted target.
     * @param expected    expected target.
     * @param description defined description.
     * @return A formatted string.
     */
    @Override
    public String writeOutput(Object actual, Object expected, String description) {
        return String.format("%s%s(expected: %s, actual: %s)", RED.getValue(), description, expected, actual);
    }

    /**
     * +---------------------------+
     * | <b> For internal use.</b> |
     * +---------------------------+
     *
     * <p> Print actual and description format like below.</p>
     * <pre>
     *     <strong>{@code description}</strong>(actual: <strong>{@code actual}</strong>)
     * </pre>
     *
     * @param actual      asserted target.
     * @param description defined description.
     * @return A formatted string.
     */
    @Override
    public String writeOutput(Object actual, String description) {
        return String.format("%s%s(actual: %s)", RED.getValue(), description, actual);
    }

    /**
     * +---------------------------+
     * | <b> For internal use.</b> |
     * +---------------------------+
     *
     * <p> Print only description format like below.</p>
     * <pre>
     *     <strong>{@code description}</strong>
     * </pre>
     *
     * @param description defined description.
     * @return A formatted string.
     */
    @Override
    public String writeOutput(String description) {
        return String.format("%s%s", RED.getValue(), description);
    }
}
