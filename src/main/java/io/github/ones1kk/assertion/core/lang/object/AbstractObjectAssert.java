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
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.info.ErrorMessageInfo;

public class AbstractObjectAssert<SELF extends AbstractObjectAssert<SELF, Object>, ACTUAL> extends AsAsserts<SELF> implements ObjectAssertion<SELF, Object> {

    protected final SELF self;

    protected final ACTUAL actual;

    protected final Objects objects;

    public AbstractObjectAssert(Class<SELF> self, ACTUAL actual) {
        super(self);
        this.self = self.cast(this);
        this.actual = actual;
        this.objects = new Objects();
    }

    @Override
    public SELF isNull() {
        objects.assertNull(info, actual);
        return self;
    }

    @Override
    public SELF isNotNull() {
        return self;
    }

    @Override
    public SELF isSameAs(Object expected) {
        return self;
    }

    @Override
    public SELF isNotSameAs(Object expected) {
        return self;
    }

    @Override
    public SELF isEqualTo(Object expected) {
        return self;
    }

    @Override
    public SELF isNotEqualTo(Object expected) {
        return self;
    }

    @Override
    public SELF isAssignableFrom(Class<?> expected) {
        return self;
    }

    @Override
    public SELF isNotAssignableFrom(Class<?> expected) {
        return self;
    }

    @Override
    public SELF isInstanceOf(Class<?> expected) {
        return self;
    }

    @Override
    public SELF isNotInstanceOf(Class<?> expected) {
        return self;
    }
}
