package com.github.ones1kk.asserts.core.feature.number.arithmetic;

import com.github.ones1kk.asserts.core.Asserts;

public class FloatUnitArithmetic {

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
