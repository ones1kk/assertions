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

package io.github.ones1kk.asserts.core.clazz.enumtype;

import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

public class AbstractEnumAssert<SELF extends AbstractEnumAssert<SELF, ACTUAL>, ACTUAL extends Enum<ACTUAL>> extends AbstractObjectAssert<SELF, ACTUAL> implements EnumAssertInterface<SELF> {

    private final EnumsInterface<ACTUAL> enums;

    public AbstractEnumAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.enums = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isFrom(String expected) {
        this.enums.assertIsFrom(actual, expected);
        return self;
    }
}
