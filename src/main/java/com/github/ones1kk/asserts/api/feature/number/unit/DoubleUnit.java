package com.github.ones1kk.asserts.api.feature.number.unit;

import com.github.ones1kk.asserts.api.Asserts;

public class DoubleUnit {

    public static ArithmeticUtil of(Double value) {
        return new ArithmeticUtil(value);
    }

    public final static class ArithmeticUtil {

        private final Double value;

        public ArithmeticUtil(Double value) {
            Asserts.that(value)
                    .isNotNull()
                    .isInstanceOf(Double.class);
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
