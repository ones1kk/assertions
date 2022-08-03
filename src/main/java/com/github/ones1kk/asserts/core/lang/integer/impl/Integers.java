package com.github.ones1kk.asserts.core.lang.integer.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.Offset;
import com.github.ones1kk.asserts.core.feature.comparable.calculator.ComparableCalculatorInterface;
import com.github.ones1kk.asserts.core.feature.comparable.calculator.impl.IntegerCalculator;
import com.github.ones1kk.asserts.core.lang.integer.IntegersInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import static com.github.ones1kk.asserts.core.feature.number.unit.IntegerUnit.of;

public class Integers extends Objects<Integer> implements IntegersInterface<Integer> {

    private final ComparableCalculatorInterface<Integer> calculator = new IntegerCalculator();

    public Integers(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Integer actual) {
        if (of(actual).isZeroRemainder()
                || calculator.isLessThan(actual, 0)) {
            handler.setDescription(handler.from(actual, "{} is not odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Integer actual) {
        if (of(actual).isNotZeroRemainder()
                || calculator.isLessThan(actual, 0)) {
            handler.setDescription(handler.from(actual, "{} is odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Integer actual) {
        if (of(actual).isNotZeroRemainder()
                || calculator.isLessThan(actual, 0)
                || of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is not even"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Integer actual) {
        if (of(actual).isNotZero()) {
            if (of(actual).isZeroRemainder()
                    || calculator.isLessThan(actual, 0)) {
                handler.setDescription(handler.from(actual, "{} is even"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsLessThan(Integer actual, Integer expected) {
        if (calculator.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Integer actual, Integer expected) {
        if (calculator.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Integer actual, Integer expected) {
        if (calculator.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Integer actual, Integer expected) {
        if (calculator.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Integer actual, Integer start, Integer end) {
        if (calculator.isLessThan(actual, start)
                || calculator.isGraterThan(actual, end)) {
            String description = handler.from("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Integer actual) {
        if (calculator.isLessThanOrEqualTo(actual, 0)) {
            handler.setDescription(handler.from(actual, "{} is not positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Integer actual) {
        if (calculator.isGraterThan(actual, 0)) {
            handler.setDescription(handler.from(actual, "{} is positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Integer actual) {
        if (calculator.isGraterThanOrEqualTo(actual, 0)) {
            handler.setDescription(handler.from(actual, "{} is not negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Integer actual) {
        if (calculator.isLessThan(actual, 0)) {
            handler.setDescription(handler.from(actual, "{} is negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Integer actual) {
        if (of(actual).isNotZero()) {
            handler.setDescription(handler.from(actual, "{} is not zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Integer actual) {
        if (of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Integer actual, Integer expected, Offset<Integer> offset) {
        int startResult = Integer.compare(actual, (expected - offset.getValue()));
        int endResult = Integer.compare(actual, (expected + offset.getValue()));

        if (calculator.is(startResult, -1)
                || calculator.is(endResult, 1)) {
            setAssertClose(actual, expected, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Integer actual, Integer expected, Offset<Integer> offset) {
        int startResult = Integer.compare(actual, (expected - offset.getValue()));
        int endResult = Integer.compare(actual, (expected + offset.getValue()));

        if (calculator.is(startResult, 1)
                || calculator.is(endResult, 1)) {
            setAssertClose(actual, expected, offset);
        }
    }

    private void setAssertClose(Integer actual, Integer expected, Offset<Integer> offset) {
        // TODO : getter
        String scope = handler.getDescribable().as("{} is close to {}", actual,
                (expected - offset.getValue()) + " ~ " + (expected + offset.getValue()));
        handler.setDescription(handler.from(actual, scope));
        throw handler.getException();
    }
}
