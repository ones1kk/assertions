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

import io.github.ones1kk.assertion.core.lang.object.ObjectAssertion;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.lang.object.ObjectsAssertion;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * <strong> The AbstractAssert class is responsible for assertion of Object type.</strong>
 * <br>
 * <p> It exists as a top-level object of all types like Object in Java language.</p>
 *
 * @param <ACTUAL> {@code actual}.
 */
public class AbstractAssert<SELF, ACTUAL> extends AsAsserts<SELF> implements ObjectAssertion<SELF, ACTUAL> {

    protected final ACTUAL actual;

    protected final SELF self;

    protected final ObjectsAssertion<ACTUAL> objects;

    @SuppressWarnings("unchecked")
    public AbstractAssert(Class<?> self, ACTUAL actual) {
        super(self);
        this.self = (SELF) self.cast(this);
        this.actual = actual;
        this.objects = new Objects<>();
    }

    /**
     * verify actual is null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNull() {
        objects.assertNull(info, actual);
        return self;
    }

    /**
     * verify actual is not null.
     *
     * @return {@code self}.
     */
    @Override
    public SELF isNotNull() {
        objects.assertNotNull(info, actual);
        return self;
    }

    /**
     * verify actual is same as expected.
     *
     * @param expected same instance
     * @return {@code self}.
     */
    @Override
    public SELF isSameAs(ACTUAL expected) {
        objects.assertSameAs(info, actual, expected);
        return self;
    }

    /**
     * verify actual is not same as expected.
     *
     * @param expected expected.
     * @return {@code self}.
     */
    @Override
    public SELF isNotSameAs(ACTUAL expected) {
        objects.assertNotSameAs(info, actual, expected);
        return self;
    }

    /**
     * verify actual is equal to expected.
     *
     * @param expected same object that have same value
     * @return {@code self}.
     */
    @Override
    public SELF isEqualTo(ACTUAL expected) {
        objects.assertEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify actual is not equal to expected.
     *
     * @param expected expected.
     * @return {@code self}.
     */
    @Override
    public SELF isNotEqualTo(ACTUAL expected) {
        objects.assertNotEqualTo(info, actual, expected);
        return self;
    }

    /**
     * verify actual is instance of expected.
     *
     * @param expected expected.
     * @return {@code self}.
     */
    @Override
    public SELF isInstanceOf(Class<?> expected) {
        objects.assertInstanceOf(info, actual, expected);
        return self;
    }

    /**
     * verify actual is not instance of expected.
     *
     * @param expected expected.
     * @return {@code self}.
     */
    @Override
    public SELF isNotInstanceOf(Class<?> expected) {
        objects.assertNotInstanceOf(info, actual, expected);
        return self;
    }

    /**
     * verify actual is satisfied predicate.
     *
     * @param predicate predicate.
     * @return {@code self}.
     */
    @Override
    public SELF is(Predicate<ACTUAL> predicate) {
        objects.assertIs(info, actual, predicate);
        return self;
    }

    /**
     * verify actual is not satisfied predicate.
     *
     * @param predicate predicate.
     * @return {@code self}.
     */
    @Override
    public SELF isNot(Predicate<ACTUAL> predicate) {
        objects.assertIsNot(info, actual, predicate);
        return self;
    }

    /**
     * verify actual is returned expected.
     *
     * @param function function.
     * @return {@code self}.
     */
    @Override
    public <T> SELF returns(T expected, Function<ACTUAL, T> function) {
        objects.assertReturns(info, actual, expected, function);
        return self;
    }
}
