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

package com.github.ones1kk.asserts.core.lang.object;

import com.github.ones1kk.asserts.core.AbstractAssert;
import com.github.ones1kk.asserts.core.AssertFactory;

/**
 * <strong> The AbstractObjectAssert class is responsible for assertion of Object type.</strong>
 * <br><br>
 *
 * <p> It exists as a top-level object of all types like Object in Java language.</p>
 * <br>
 * <p> {@link AssertFactory} is injected so that implementations corresponding to each ACTUAL type parameter can be declared in each AbstractAssert class.</p>
 * <br>
 * <p> Also, this class actually casts the type parameter coming into SELF and ACTUAL.</p>
 *
 * @param <SELF>
 * @param <ACTUAL>
 */
public class AbstractObjectAssert<SELF extends AbstractAssert<SELF, Object>, ACTUAL> extends AbstractAssert<SELF, Object> {

    protected final SELF self;

    protected final ACTUAL actual;

    protected final AssertFactory assertFactory = new AssertFactory();

    protected final AbstractObjects<Object> objects;

    @SuppressWarnings("unchecked")
    public AbstractObjectAssert(Class<?> self, ACTUAL actual) {
        super(self);
        this.self = (SELF) self.cast(this);
        this.actual = actual;
        this.objects = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isNull() {
        objects.assertIsNull(actual);
        return self;
    }

    @Override
    public SELF isNotNull() {
        objects.assertIsNotNull(actual);
        return self;
    }

    @Override
    public SELF isSameAs(Object expected) {
        objects.assertIsSameAs(actual, expected);
        return self;
    }

    @Override
    public SELF isNotSameAs(Object expected) {
        objects.assertIsNotSameAs(actual, expected);
        return self;
    }

    @Override
    public SELF isEqualTo(Object expected) {
        objects.assertIsEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isNotEqualTo(Object expected) {
        objects.assertIsNotEqualTo(actual, expected);
        return self;
    }

    @Override
    public SELF isAssignableFrom(Class<?> expected) {
        objects.assertIsAssignableFrom(actual, expected);
        return self;
    }

    @Override
    public SELF isNotAssignableFrom(Class<?> expected) {
        objects.assertIsNotAssignableFrom(actual, expected);
        return self;
    }

    @Override
    public SELF isInstanceOf(Class<?> expected) {
        objects.assertIsInstanceOf(actual, expected);
        return self;
    }
}
