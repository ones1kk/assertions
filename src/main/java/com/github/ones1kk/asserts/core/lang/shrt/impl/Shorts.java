package com.github.ones1kk.asserts.core.lang.shrt.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.Offset;
import com.github.ones1kk.asserts.core.feature.comparable.calculator.ComparableCalculatorInterface;
import com.github.ones1kk.asserts.core.feature.comparable.calculator.impl.ShortCalculator;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.lang.shrt.ShortsInterface;

import static com.github.ones1kk.asserts.core.feature.number.arithmetic.ShortArithmeticUnit.of;

public class Shorts extends Objects<Short> implements ShortsInterface<Short> {

    private final ComparableCalculatorInterface<Short> calculator = new ShortCalculator();

    public Shorts(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Short actual) {
        if (of(actual).isEven()
                || calculator.isLessThan(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is not odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Short actual) {
        if (of(actual).isOdd()
                || calculator.isLessThan(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Short actual) {
        if (of(actual).isOdd()
                || calculator.isLessThan(actual, (short) 0)
                || of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is not even"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Short actual) {
        if (of(actual).isNotZero()) {
            if (of(actual).isEven()
                    || calculator.isLessThan(actual, (short) 0)) {
                handler.setDescription(handler.from(actual, "{} is even"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsPositive(Short actual) {
        if (calculator.isLessThanOrEqualTo(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is not positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Short actual) {
        if (calculator.isGraterThan(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Short actual) {
        if (calculator.isGraterThanOrEqualTo(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is not negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Short actual) {
        if (calculator.isLessThan(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Short actual) {
        if (of(actual).isNotZero()) {
            handler.setDescription(handler.from(actual, "{} is not zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Short actual) {
        if (of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Short actual, Short expected) {
        if (calculator.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Short actual, Short expected) {
        if (calculator.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Short actual, Short expected) {
        if (calculator.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Short actual, Short expected) {
        if (calculator.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Short actual, Short start, Short end) {
        if (calculator.isLessThan(actual, start)
                || calculator.isGraterThan(actual, end)) {
            String description = handler.from("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Short actual, Short expected, Offset<Short> offset) {
        short startResult = (short) Short.compare(actual, (short) offset.getBefore(expected));
        short endResult = (short) Short.compare(actual, (short) offset.getAfter(expected));

        if (calculator.isLessThan(startResult, (short) 0)
                || calculator.isGraterThan(endResult, (short) 0)) {
            setAssertClose(actual, expected, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Short actual, Short expected, Offset<Short> offset) {
        short startResult = (short) Short.compare(actual, (short) offset.getBefore(expected));
        short endResult = (short) Short.compare(actual, (short) offset.getAfter(expected));

        if (calculator.isGraterThanOrEqualTo(startResult, (short) 0)
                || calculator.isGraterThanOrEqualTo(endResult, (short) 0)) {
            setAssertClose(actual, expected, offset);
        }
    }

    private void setAssertClose(Short actual, Short expected, Offset<Short> offset) {

        String scope = handler.getDescribable().as("{} have to close to {}", actual,
                offset.getBefore(expected) + " ~ " + offset.getAfter(expected));
        handler.setDescription(handler.from(actual, scope));
        throw handler.getException();
    }
}
