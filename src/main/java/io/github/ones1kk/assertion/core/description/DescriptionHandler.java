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

import io.github.ones1kk.assertion.core.description.impl.Description;
import io.github.ones1kk.assertion.core.exception.AssertException;
import io.github.ones1kk.assertion.core.feature.print.PrintFormatter;
import io.github.ones1kk.assertion.core.feature.print.impl.SimplePrintFormatter;
import org.apache.commons.lang3.StringUtils;

/**
 * <strong> The DescriptionHandler is a handler class that receives a description including Varargs and prints it to the console.</strong>
 */
public final class DescriptionHandler {

    private final PrintFormatter formatter;

    private final Describable describable = new Description();

    private static final ThreadLocal<DescriptionHolder> HOLDER = new ThreadLocal<>();

    private static final String EMPTY_STRING = "";

    public DescriptionHandler() {
        this.formatter = new SimplePrintFormatter();
    }

    public DescriptionHandler(PrintFormatter formatter) {
        this.formatter = formatter;
    }

    public void receive(String description) {
        setDescription(formatter.print(description));
    }

    public void receive(Object actual, String description) {
        setDescription(formatter.print(actual, description));
    }

    public void receive(Object actual, Object expected, String description) {
        setDescription(formatter.print(actual, expected, description));
    }

    public void receiveAsDescription(String description, Object... args) {
        setAsDescription(formatter.print(describable.as(description, args)));
    }

    public AssertException getException() {
        if (isEmptyAsDescription()) {
            return new AssertException(HOLDER.get().getDescription());
        }
        return new AssertException(HOLDER.get().getAsDescription());
    }

    private boolean isEmptyAsDescription() {
        return StringUtils.isEmpty(HOLDER.get().getAsDescription());
    }

    private void setAsDescription(String asDescription) {
        HOLDER.set(new DescriptionHolder(asDescription, EMPTY_STRING));
    }

    private void setDescription(String description) {
        HOLDER.set(new DescriptionHolder(EMPTY_STRING, description));
    }

    @Override
    protected void finalize() throws Throwable {
        HOLDER.remove();
        super.finalize();
    }

}
