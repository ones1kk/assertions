package com.github.ones1kk.asserts.core.feature.number.unit;

import com.github.ones1kk.asserts.core.Asserts;

public final class IntegerUnit {

    public static ArithmeticUtil of(Integer value) {
        return new ArithmeticUtil(value);
    }

    public final static class ArithmeticUtil {

        private final Integer value;

        public ArithmeticUtil(Integer value) {
            Asserts.that(value)
                    .as("Only Integers type is allowed")
                    .isNotNull()
                    .isInstanceOf(Integer.class);
            this.value = value;
        }

        public boolean isZero() {
            return value == 0;
        }

        public boolean isNotZero() {
            return value != 0;
        }

        public boolean isZeroRemainder() {
            return (value % 2 == 0);
        }

        public boolean isNotZeroRemainder() {
            return (value % 2 != 0);
        }
    }
}
