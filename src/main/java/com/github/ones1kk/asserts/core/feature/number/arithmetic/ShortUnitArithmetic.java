package com.github.ones1kk.asserts.core.feature.number.arithmetic;

import com.github.ones1kk.asserts.core.Asserts;

public class ShortUnitArithmetic {

    private ShortUnitArithmetic() {
    }

    public static ArithmeticUtil of(Short value) {
        return new ArithmeticUtil(value);
    }

    public final static class ArithmeticUtil {

        private final Short value;

        public ArithmeticUtil(Short value) {
            Asserts.that(value)
                    .as("Only Integers type is allowed")
                    .isNotNull()
                    .isInstanceOf(Short.class);
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
