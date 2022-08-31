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

package com.github.ones1kk.asserts.core.description;

import com.github.ones1kk.asserts.core.description.impl.Description;
import com.github.ones1kk.asserts.core.exception.AssertException;
import com.github.ones1kk.asserts.core.feature.print.Printer;
import com.github.ones1kk.asserts.core.feature.print.impl.DefaultPrinter;
import org.apache.commons.lang3.StringUtils;

public final class DescriptionHandler {

    private final Printer printer = new DefaultPrinter();

    private final Describable describable = new Description();

    private String description;

    private String asDescription;

    public String from(String description, Object... args) {
        return printer.writeOutput(describable.as(description, args));
    }

    public String from(Object actual, String description) {
        return printer.writeOutput(actual, describable.as(description, actual));
    }

    public String from(Object actual, Object expected, String description) {
        return printer.writeOutput(actual, expected, describable.as(description, actual, expected));
    }

    public AssertException getException() {
        if (isEmptyAsDescription()) {
            return new AssertException(description);
        }
        return new AssertException(asDescription);
    }

    private boolean isEmptyAsDescription() {
        return StringUtils.isEmpty(asDescription);
    }

    public void setAsDescription(String asDescription) {
        this.asDescription = asDescription;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Describable getDescribable() {
        return describable;
    }
}
