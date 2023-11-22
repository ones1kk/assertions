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
package io.github.ones1kk.assertion.core.lang.object;

import io.github.ones1kk.assertion.core.AsAsserts;

public class AbstractObjectAssert<ACTUAL> extends AsAsserts<AbstractObjectAssert> implements ObjectAssertion<AbstractObjectAssert<ACTUAL>, Object> {

    protected final ACTUAL actual;

    protected final Objects objects;

    public AbstractObjectAssert(ACTUAL actual) {
        super(AbstractObjectAssert.class);
        this.actual = actual;
        this.objects = new Objects();
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNull() {
        objects.assertNull(info, actual);
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNotNull() {
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isSameAs(Object expected) {
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNotSameAs(Object expected) {
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isEqualTo(Object expected) {
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNotEqualTo(Object expected) {
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isAssignableFrom(Class<?> expected) {
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNotAssignableFrom(Class<?> expected) {
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isInstanceOf(Class<?> expected) {
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNotInstanceOf(Class<?> expected) {
        return this;
    }
}
