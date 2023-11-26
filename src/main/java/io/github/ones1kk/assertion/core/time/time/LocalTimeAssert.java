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
package io.github.ones1kk.assertion.core.time.time;

import io.github.ones1kk.assertion.core.ConfigurationAsserts;
import io.github.ones1kk.assertion.core.description.formatter.Formattable;

import java.time.LocalTime;

public class LocalTimeAssert extends AbstractLocalTimeAssert implements ConfigurationAsserts<AbstractLocalTimeAssert, Formattable> {

    public LocalTimeAssert(LocalTime actual) {
        super(AbstractLocalTimeAssert.class, actual);
    }

    @Override
    public AbstractLocalTimeAssert configure(Formattable formattable) {
        info.configure(formattable);
        return self;
    }
}
