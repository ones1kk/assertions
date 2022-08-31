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

package com.github.ones1kk.asserts.core.feature.number.arithmetic;

import com.github.ones1kk.asserts.core.Asserts;

public class FloatArithmeticUnit {

    public static ArithmeticUtil of(Float value) {
        return new ArithmeticUtil(value);
    }

    public final static class ArithmeticUtil {

        private final Float value;

        public ArithmeticUtil(Float value) {
            Asserts.that(value)
                    .isNotNull()
                    .isInstanceOf(Float.class);
            this.value = value;
        }

        public boolean isZero() {
            return value == 0;
        }

        public boolean isNotZero() {
            return value != 0;
        }

        public boolean isEven() {
            return (value % 2 == 0);
        }

        public boolean isOdd() {
            return (value % 2 != 0);
        }
    }
}
