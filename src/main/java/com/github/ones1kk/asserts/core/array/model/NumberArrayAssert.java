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

package com.github.ones1kk.asserts.core.array.model;

import com.github.ones1kk.asserts.core.array.number.AbstractNumberArrayAssert;
import com.github.ones1kk.asserts.core.file.AbstractFileAssert;

/**
 * <strong> The NumberArrayAssert class inherits {@link AbstractFileAssert} </strong>
 */
public class NumberArrayAssert extends AbstractNumberArrayAssert<NumberArrayAssert, Number[]> {

    public NumberArrayAssert(Number[] actual) {
        super(NumberArrayAssert.class, actual);
    }
}
