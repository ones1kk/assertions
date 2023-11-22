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
package io.github.ones1kk.assertion.core.description;

import io.github.ones1kk.assertion.core.exception.AssertException;
import io.github.ones1kk.assertion.core.message.DescriptionErrorMessages;

import static org.apache.commons.lang3.ArrayUtils.isEmpty;
import static org.apache.commons.lang3.ArrayUtils.isNotEmpty;

public class Description {

    private final String description;

    private final Object[] args;

    public Description(String description, Object... args) {
        validate(description, args);
        this.description = description;
        this.args = args;
    }

    public Description(String description) {
        Object[] emptyArray = {};
        validate(description, emptyArray);
        this.description = description;
        this.args = emptyArray;
    }

    private void validate(String description, Object[] args) {
        containsBrace(description, args);
        throwIfHavingSpecialChar(description);
        throwIfOnlyArgumentsExist(description, args);
    }

    private void containsBrace(String description, Object[] args) {
        if (description.contains("{}")) {
            throwIfNullOrEmpty(args);
        }
    }

    private void throwIfNullOrEmpty(Object[] args) {
        if (isEmpty(args) || args == null) {
            throw new AssertException(DescriptionErrorMessages.ShouldBeEnteredArguments());
        }
    }

    private void throwIfHavingSpecialChar(String description) {
        if (description.contains("%s")) {
            throw new AssertException(DescriptionErrorMessages.shouldDoNotEnterPercentSign());
        }
    }

    private void throwIfOnlyArgumentsExist(String description, Object[] args) {
        if (isNotEmpty(args) && !(description.contains("{}"))) {
            throw new AssertException(DescriptionErrorMessages.ShouldBeExpressedInBrace());
        }
    }

}
