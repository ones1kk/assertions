package com.github.ones1kk.asserts.core.lang.bte.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.Offset;
import com.github.ones1kk.asserts.core.feature.comparable.ComparableCalculatorInterface;
import com.github.ones1kk.asserts.core.feature.comparable.impl.ByteComparableImpl;
import com.github.ones1kk.asserts.core.lang.bte.BytesInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import static com.github.ones1kk.asserts.core.feature.number.arithmetic.ByteArithmeticUnit.of;

public class Bytes extends Objects<Byte> implements BytesInterface<Byte> {

    private final ComparableCalculatorInterface<Byte> comparable = new ByteComparableImpl();

    public Bytes(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Byte actual) {
        if (of(actual).isEven()
                || comparable.isLessThan(actual, (byte) 0)) {
            handler.setDescription(handler.from(actual, "{} is not odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Byte actual) {
        if (of(actual).isOdd()
                || comparable.isLessThan(actual, (byte) 0)) {
            handler.setDescription(handler.from(actual, "{} is odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Byte actual) {
        if (of(actual).isOdd()
                || comparable.isLessThan(actual, (byte) 0)
                || of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is not even"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Byte actual) {
        if (of(actual).isNotZero()) {
            if (of(actual).isEven()
                    || comparable.isLessThan(actual, (byte) 0)) {
                handler.setDescription(handler.from(actual, "{} is even"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsPositive(Byte actual) {
        if (comparable.isLessThanOrEqualTo(actual, (byte) 0)) {
            handler.setDescription(handler.from(actual, "{} is not positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Byte actual) {
        if (comparable.isGraterThan(actual, (byte) 0)) {
            handler.setDescription(handler.from(actual, "{} is positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Byte actual) {
        if (comparable.isGraterThanOrEqualTo(actual, (byte) 0)) {
            handler.setDescription(handler.from(actual, "{} is not negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Byte actual) {
        if (comparable.isLessThan(actual, (byte) 0)) {
            handler.setDescription(handler.from(actual, "{} is negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Byte actual) {
        if (of(actual).isNotZero()) {
            handler.setDescription(handler.from(actual, "{} is not zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Byte actual) {
        if (of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Byte actual, Byte expected) {
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Byte actual, Byte expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Byte actual, Byte expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Byte actual, Byte expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Byte actual, Byte start, Byte end) {
        if (comparable.isLessThan(actual, start)
                || comparable.isGraterThan(actual, end)) {
            String description = handler.from("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Byte actual, Byte expected, Offset<Byte> offset) {
        byte startResult = (byte) Byte.compare(actual, (byte) offset.getBefore(expected));
        byte endResult = (byte) Byte.compare(actual, (byte) offset.getAfter(expected));

        if (comparable.isLessThan(startResult, (byte) 0)
                || comparable.isGraterThan(endResult, (byte) 0)) {
            setAssertClose(actual, expected, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Byte actual, Byte expected, Offset<Byte> offset) {
        byte startResult = (byte) Byte.compare(actual, (byte) offset.getBefore(expected));
        byte endResult = (byte) Byte.compare(actual, (byte) offset.getAfter(expected));

        if (comparable.isGraterThanOrEqualTo(startResult, (byte) 0)
                || comparable.isGraterThanOrEqualTo(endResult, (byte) 0)) {
            setAssertClose(actual, expected, offset);
        }
    }

    private void setAssertClose(Byte actual, Byte expected, Offset<Byte> offset) {
        String scope = handler.getDescribable().as("{} have to close to {}", actual,
                offset.getBefore(expected) + " ~ " + offset.getAfter(expected));
        handler.setDescription(handler.from(actual, scope));
        throw handler.getException();
    }
}
