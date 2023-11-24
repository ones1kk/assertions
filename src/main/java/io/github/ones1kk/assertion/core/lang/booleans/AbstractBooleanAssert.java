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
package io.github.ones1kk.assertion.core.lang.booleans;

import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;

/**
 * <strong> The AbstractBooleanAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the Boolean type and verify assertion.</p>
 */
public abstract class AbstractBooleanAssert extends AbstractObjectAssert<AbstractBooleanAssert, Boolean> implements BooleanAssertion<AbstractBooleanAssert> {

    private final BooleansAssertion booleans;

    public AbstractBooleanAssert(Class<?> self, Boolean actual) {
        super(self, actual);
        this.booleans = new Booleans();
    }

    /**
     * verify actual is false.
     *
     * @return {@link AbstractBooleanAssert}
     */
    @Override
    public AbstractBooleanAssert isFalse() {
        booleans.assertFalse(info, actual);
        return self;
    }

    /**
     * verify actual is true.
     *
     * @return {@link  AbstractBooleanAssert}
     */
    @Override
    public AbstractBooleanAssert isTrue() {
        booleans.assertTrue(info, actual);
        return self;
    }

}
