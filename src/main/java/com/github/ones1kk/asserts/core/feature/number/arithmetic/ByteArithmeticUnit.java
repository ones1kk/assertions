package com.github.ones1kk.asserts.core.feature.number.arithmetic;

import com.github.ones1kk.asserts.core.Asserts;

public class ByteArithmeticUnit {

    public static ArithmeticUtil of(Byte value) {
        return new ArithmeticUtil(value);
    }

    public final static class ArithmeticUtil {

        private final Byte value;

        public ArithmeticUtil(Byte value) {
            Asserts.that(value)
                    .isNotNull()
                    .isInstanceOf(Byte.class);
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
