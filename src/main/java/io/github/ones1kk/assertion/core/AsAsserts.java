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
package io.github.ones1kk.assertion.core;

import io.github.ones1kk.assertion.core.description.Description;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.info.ErrorMessageInfo;

public abstract class AsAsserts<SELF> implements AsAssertion<SELF> {

    private final SELF self;

    protected final AssertionsInfo info;

    public AsAsserts(Class<SELF> self) {
        this.self = self.cast(this);
        this.info = new ErrorMessageInfo();
    }

    @Override
    public SELF as(String description, Object... args) {
        Description created = new Description(description, args);
        info.overrideErrorMessage(created);
        return self;
    }

    @Override
    public SELF as(Description description) {
        info.overrideErrorMessage(description);
        return self;
    }

}
