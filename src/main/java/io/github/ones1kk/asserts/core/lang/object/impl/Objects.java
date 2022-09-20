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

package io.github.ones1kk.asserts.core.lang.object.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjects;
import io.github.ones1kk.asserts.core.message.CommonErrorMessages;

/**
 * <strong> The Objects class is as implementation of {@link AbstractObjectAssert} </strong>
 * <b> Notice</b>
 * <br>
 * +----------------------------------------------------------------------------------------------------------+
 * | <b> It is expressed as an implementation class, but structurally, it is not an implementation class.</b> |
 * +----------------------------------------------------------------------------------------------------------+
 *
 * <br>
 * <p> This is that implements the assertion method of the Object type and verify assertion.</p>
 *
 * @param <ACTUAL> {@code actual}.
 */
public class Objects<ACTUAL> extends AbstractObjects<Object> {

    public Objects(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsNull(Object actual) {
        if (actual != null) {
            handler.receive(actual, CommonErrorMessages.shouldBeNull(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNull(Object actual) {
        if (actual == null) {
            handler.receive(CommonErrorMessages.shouldNotBeNull(CommonErrorMessages.getActualAsPlain()));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsSameAs(Object actual, Object expected) {
        if (actual != expected) {
            handler.receive(actual, expected, CommonErrorMessages.shouldBeSameAS(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotSameAs(Object actual, Object expected) {
        if (actual == expected) {
            handler.receive(actual, expected, CommonErrorMessages.shouldNotBeSameAS(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEqualTo(Object actual, Object expected) {
        if (!actual.equals(expected)) {
            handler.receive(actual, expected, CommonErrorMessages.shouldBeEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEqualTo(Object actual, Object expected) {
        if (actual.equals(expected)) {
            handler.receive(actual, expected, CommonErrorMessages.shouldNotBeEqualTo(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsAssignableFrom(Object actual, Class<?> expected) {
        if (!actual.getClass().isAssignableFrom(expected)) {
            handler.receive(actual, expected, CommonErrorMessages.shouldBeAssignableFrom(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotAssignableFrom(Object actual, Class<?> expected) {
        if (actual.getClass().isAssignableFrom(expected)) {
            handler.receive(actual, expected, CommonErrorMessages.shouldNotBeAssignableFrom(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsInstanceOf(Object actual, Class<?> expected) {
        if (!expected.isInstance(actual)) {
            handler.receive(actual, expected, CommonErrorMessages.shouldBeInstanceOf(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotInstanceOf(Object actual, Class<?> expected) {
        if (expected.isInstance(actual)) {
            handler.receive(actual, expected, CommonErrorMessages.shouldBeNotInstanceOf(actual, expected));
            throw handler.getException();
        }
    }

}
