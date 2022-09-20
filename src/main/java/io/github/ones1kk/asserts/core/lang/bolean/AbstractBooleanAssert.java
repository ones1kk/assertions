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

package io.github.ones1kk.asserts.core.lang.bolean;

import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractBooleanAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Boolean type and verify assertion.</p>
 *
 * @param <SELF>   {@code self}.
 * @param <ACTUAL> {@code actual}.
 */
public class AbstractBooleanAssert<SELF extends AbstractBooleanAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Boolean> implements BooleanAssertInterface<SELF> {

    private final BooleansInterface<Boolean> booleans;

    public AbstractBooleanAssert(Class<?> self, Boolean actual) {
        super(self, actual);
        this.booleans = assertFactory.createAssert(actual, this);
    }

    /**
     * Verify {@code actual} is false or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isFalse() {
        booleans.assertIsFalse(actual);
        return self;
    }

    /**
     * Verify {@code actual} is true or not.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isTrue() {
        booleans.assertIsTrue(actual);
        return self;
    }
}
