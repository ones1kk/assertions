package com.github.ones1kk.asserts.core.feature.number.unit;

import com.github.ones1kk.asserts.core.Asserts;

public class LongUnit {

    private LongUnit() {
    }

    public static ArithmeticUtil of(Long value) {
        return new ArithmeticUtil(value);
    }

    public final static class ArithmeticUtil {

        private final Long value;

        public ArithmeticUtil(Long value) {
            Asserts.that(value)
                    .as("Only Integers type is allowed")
                    .isNotNull()
                    .isInstanceOf(Long.class);
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
