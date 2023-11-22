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

import io.github.ones1kk.assertion.core.description.fail.Failures;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.info.ErrorMessageInfo;
import io.github.ones1kk.assertion.core.message.ObjectErrorMessages;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * <p> This Objects class verify {@code actual} of Object type.</p>
 */
public class Objects<ACTUAL> implements ObjectsAssertion<ACTUAL> {

    protected final Failures failures = new Failures();

    /**
     * assert actual is null.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNull(AssertionsInfo info, Object actual) {
        if (actual != null) {
            throw failures.failure(info, ObjectErrorMessages.shouldBeNull(actual));
        }
    }

    /**
     * assert actual is not null.
     *
     * @param info   {@link ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotNull(AssertionsInfo info, Object actual) {
        if (actual == null) {
            throw failures.failure(info, ObjectErrorMessages.shouldNotBeNull(ObjectErrorMessages.getActualAsPlain()));
        }
    }

    /**
     * assert actual is not same as expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertSameAs(AssertionsInfo info, Object actual, Object expected) {
        if (actual != expected) {
            throw failures.failure(info, ObjectErrorMessages.shouldBeSameAS(actual, expected));
        }
    }

    /**
     * assert actual is not same as expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertNotSameAs(AssertionsInfo info, Object actual, Object expected) {
        if (actual == expected) {
            throw failures.failure(info, ObjectErrorMessages.shouldNotBeSameAS(actual, expected));
        }
    }

    /**
     * assert actual is equal to expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertEqualTo(AssertionsInfo info, Object actual, Object expected) {
        if (!actual.equals(expected)) {
            throw failures.failure(info, ObjectErrorMessages.shouldBeEqualTo(actual, expected));
        }
    }

    /**
     * assert actual is not equal to expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertNotEqualTo(AssertionsInfo info, Object actual, Object expected) {
        if (actual.equals(expected)) {
            throw failures.failure(info, ObjectErrorMessages.shouldNotBeEqualTo(actual, expected));
        }
    }

    /**
     * assert actual is instance of expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertInstanceOf(AssertionsInfo info, ACTUAL actual, Class<?> expected) {
        if (!expected.isInstance(actual)) {
            throw failures.failure(info, ObjectErrorMessages.shouldBeInstanceOf(actual, expected));
        }
    }

    /**
     * assert actual is not instance of expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertNotInstanceOf(AssertionsInfo info, ACTUAL actual, Class<?> expected) {
        if (expected.isInstance(actual)) {
            throw failures.failure(info, ObjectErrorMessages.shouldBeNotInstanceOf(actual, expected));
        }
    }

    /**
     * assert actual is predicated
     *
     * @param info      {@link ErrorMessageInfo}
     * @param actual    actual
     * @param predicate predicate
     */
    @Override
    public void assertIs(AssertionsInfo info, ACTUAL actual, Predicate<ACTUAL> predicate) {
        assertNotNull(info, predicate);
        if (!predicate.test(actual)) {
            throw failures.failure(info, ObjectErrorMessages.shouldSatisfyGivenCondition(actual));
        }
    }

    /**
     * assert actual is not predicated
     *
     * @param info      {@link ErrorMessageInfo}
     * @param actual    actual
     * @param predicate predicate
     */
    @Override
    public void assertIsNot(AssertionsInfo info, ACTUAL actual, Predicate<ACTUAL> predicate) {
        assertNotNull(info, predicate);
        if (predicate.test(actual)) {
            throw failures.failure(info, ObjectErrorMessages.shouldNotSatisfyGivenCondition(actual));
        }
    }

    /**
     * assert actual return as expected
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     * @param function function
     * @param <T>      return type
     */
    @Override
    public <T> void assertReturns(AssertionsInfo info, ACTUAL actual, T expected, Function<ACTUAL, T> function) {
        assertNotNull(info, actual);
        assertNotNull(info, function);
        T returned = function.apply(actual);
        if (!java.util.Objects.deepEquals(expected, returned)) {
            throw failures.failure(info, ObjectErrorMessages.shouldReturnGivenValue(actual));
        }
    }

}
