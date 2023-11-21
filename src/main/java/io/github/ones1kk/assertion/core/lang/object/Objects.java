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

/**
 * <p> This Objects class verify {@code actual} of Object type.</p>
 */
public class Objects implements ObjectsAssertion<Object> {

    Failures failures = new Failures();

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
            throw failures.failure(info, ObjectErrorMessages.shouldBeSameAS(actual, expected));
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
     * assert actual is assignable from expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertAssignableFrom(AssertionsInfo info, Object actual, Class<?> expected) {
        if (!actual.getClass().isAssignableFrom(expected)) {
            throw failures.failure(info, ObjectErrorMessages.shouldBeAssignableFrom(actual, expected));
        }
    }

    /**
     * assert actual is not assignable from expected.
     *
     * @param info     {@link ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertNotAssignableFrom(AssertionsInfo info, Object actual, Class<?> expected) {
        if (actual.getClass().isAssignableFrom(expected)) {
            throw failures.failure(info, ObjectErrorMessages.shouldNotBeAssignableFrom(actual, expected));
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
    public void assertInstanceOf(AssertionsInfo info, Object actual, Class<?> expected) {
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
    public void assertNotInstanceOf(AssertionsInfo info, Object actual, Class<?> expected) {
        if (expected.isInstance(actual)) {
            throw failures.failure(info, ObjectErrorMessages.shouldBeNotInstanceOf(actual, expected));
        }
    }

}
