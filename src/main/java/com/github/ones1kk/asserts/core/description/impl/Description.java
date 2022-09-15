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

package com.github.ones1kk.asserts.core.description.impl;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.exception.AssertException;
import org.apache.commons.lang3.ArrayUtils;

import java.util.function.Supplier;


/**
 * <strong> The Description class has been implemented by {@link Describable}.</strong>
 *
 * <p> What this class does is format the description to be usable in an internal way and make validity judgments on the description and the arguments. </p>
 */
public final class Description implements Describable {

    private static final String REG_EXR = "Special character '%s' cannot be inserted between strings.";

    private static final String ARGUMENT_DESCRIPTION = "Argument is missing.";

    private static final String ARGUMENTS_EXPRESSION_WITH_BRACE = "Arguments only can be expressed in braces.";

    /**
     * <p> The description of the assertion is defined by the user. </p>
     *
     * <p> Also, this method uses {@link String#format(String, Object...)}, {@link String#replace(char, char)} internally.</p>
     *
     * <p>How to use</p>
     * <pre>
     *     as(() -> "description is {}", argument);
     *
     *     as("description is {}", argument);
     * </pre>
     *
     * <p> Below is some cases where an {@link AssertException} is thrown. </p>
     *
     * <pre>
     *     Case1
     *     Description contains special character '%s'.
     *
     *     Case2
     *     Description contains '{}' but arguments are empty.
     *
     *     Case3
     *     Arguments are not empty but description contains braces('{}').
     * </pre>
     *
     * @param supplier description as using assertion.
     * @param args     variable inserted in braces.
     * @return formatted string.
     */
    @Override
    public String as(Supplier<String> supplier, Object... args) {
        return getFormattingDescription(supplier.get(), args);
    }

    /**
     * <p> The description of the assertion is defined by the user. </p>
     *
     * <p> Also, this method uses {@link String#format(String, Object...)}, {@link String#replace(char, char)} internally.</p>
     *
     * <p>How to use</p>
     * <pre>
     *     as(() -> "description is {}", argument);
     *
     *     as("description is {}", argument);
     * </pre>
     *
     * <p> Below is some cases where an {@link AssertException} is thrown. </p>
     *
     * <pre>
     *     Case1
     *     Description contains special character '%s'.
     *
     *     Case2
     *     Description contains '{}' but arguments are empty.
     *
     *     Case3
     *     Arguments are not empty but description contains braces('{}').
     * </pre>
     *
     * @param description description as using assertion.
     * @param args        variable inserted in braces.
     * @return formatted string.
     */
    @Override
    public String as(String description, Object... args) {
        return getFormattingDescription(description, args);
    }

    private String getFormattingDescription(String description, Object[] args) {
        throwIfHavingSpecialChar(description);
        throwIfOnlyArgumentsExist(description, args);

        if (description.contains("{}")) {
            throwIfNull(args);
            return String.format(description.replace("{}", "%s"), args);
        }
        return description;
    }

    private void throwIfNull(Object[] args) {
        if (ArrayUtils.isEmpty(args) || args == null) {
            throw new AssertException(ARGUMENT_DESCRIPTION);
        }
    }

    private void throwIfHavingSpecialChar(String formatted) {
        if (formatted.contains("%s")) {
            throw new AssertException(REG_EXR);
        }
    }

    @SuppressWarnings("all")
    private void throwIfOnlyArgumentsExist(String description, Object[] args) {
        if (args.length < 0 && !(description.contains("{}"))) {
            throw new AssertException(ARGUMENTS_EXPRESSION_WITH_BRACE);
        }
    }

}
