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

package io.github.ones1kk.assertion.core.lang.bolean.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.lang.bolean.BooleansInterface;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import io.github.ones1kk.assertion.core.message.BooleanErrorMessages;
import io.github.ones1kk.assertion.core.message.CommonErrorMessages;

/**
 * <strong> The Booleans class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Booleans extends Objects<Boolean> implements BooleansInterface<Boolean> {

    public Booleans(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsFalse(Boolean actual) {
        if (actual) {
            handler.receive(CommonErrorMessages.getActualAsPlain(), BooleanErrorMessages.shouldBeFalse());
            throw handler.getException();
        }
    }

    @Override
    public void assertIsTrue(Boolean actual) {
        if (!actual) {
            handler.receive(CommonErrorMessages.getActualAsPlain(), BooleanErrorMessages.shouldBeTrue());
            throw handler.getException();
        }
    }
}
