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

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * <strong> The AbstractObjectAssert class is responsible for assertion of Object type.</strong>
 * <br>
 * <p> It exists as a top-level object of all types like Object in Java language.</p>
 *
 * @param <ACTUAL> {@code actual}.
 */
public class AbstractObjectAssert<ACTUAL> extends AsAsserts<AbstractObjectAssert> implements ObjectAssertion<AbstractObjectAssert<ACTUAL>, ACTUAL> {

    protected final ACTUAL actual;

    protected final ObjectsAssertion<ACTUAL> objects;

    public AbstractObjectAssert(ACTUAL actual) {
        super(AbstractObjectAssert.class);
        this.actual = actual;
        this.objects = new Objects<>();
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNull() {
        objects.assertNull(info, actual);
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNotNull() {
        objects.assertNotNull(info, actual);
        return this;
    }

    /**
     * <p> As in Java, the comparison operator compare value of hashCode. </p>
     *
     * @param expected same object
     * @return {@code self}.
     */
    @Override
    public AbstractObjectAssert<ACTUAL> isSameAs(ACTUAL expected) {
        objects.assertSameAs(info, actual, expected);
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNotSameAs(ACTUAL expected) {
        objects.assertNotSameAs(info, actual, expected);
        return this;
    }

    /**
     * <p> Basically as in Java, the {@link Object#equals(Object)} compare value itself. </p>
     *
     * @param expected same object that have same value
     * @return {@code self}.
     */
    @Override
    public AbstractObjectAssert<ACTUAL> isEqualTo(ACTUAL expected) {
        objects.assertEqualTo(info, actual, expected);
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNotEqualTo(ACTUAL expected) {
        objects.assertNotEqualTo(info, actual, expected);
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isInstanceOf(Class<?> expected) {
        objects.assertInstanceOf(info, actual, expected);
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNotInstanceOf(Class<?> expected) {
        objects.assertNotInstanceOf(info, actual, expected);
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> is(Predicate<ACTUAL> predicate) {
        objects.assertIs(info, actual, predicate);
        return this;
    }

    @Override
    public AbstractObjectAssert<ACTUAL> isNot(Predicate<ACTUAL> predicate) {
        objects.assertIsNot(info, actual, predicate);
        return this;
    }

    @Override
    public <T> AbstractObjectAssert<ACTUAL> returns(T expected, Function<ACTUAL, T> function) {
        objects.assertReturns(info, actual, expected, function);
        return this;
    }
}
