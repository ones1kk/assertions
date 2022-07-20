package com.github.ones1kk.asserts.api.feature.number.unit;

import com.github.ones1kk.asserts.api.Asserts;

public class LongUnit {

    private LongUnit() {
    }

    public static ArithmeticUtil of(Long value) {
        Asserts.that(value)
                .as("Only Integers type is allowed")
                .isNotNull()
                .isInstanceOf(Integer.class);

        return new ArithmeticUtil(value);
    }

    public final static class ArithmeticUtil {

        private final Long value;

        public ArithmeticUtil(Long value) {
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
