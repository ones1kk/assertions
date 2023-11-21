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
package io.github.ones1kk.assertion.core.description.fail;

import io.github.ones1kk.assertion.core.description.Description;
import io.github.ones1kk.assertion.core.description.formatter.Formattable;
import io.github.ones1kk.assertion.core.description.formatter.TextFormatter;
import io.github.ones1kk.assertion.core.exception.AssertException;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;

public class Failures {

    private final Formattable formattable = new TextFormatter();

    public AssertException failure(AssertionsInfo info, String errorMessage) {
        if (info.hasOverrideErrorMessage()) {
            Description description = info.getErrorMessage();
            return new AssertException(formattable.format(description));
        }

        return new AssertException(errorMessage);
    }
}
