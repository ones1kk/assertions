package com.github.ones1kk.asserts.core.lang.lng.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.Offset;
import com.github.ones1kk.asserts.core.feature.comparable.calculator.ComparableCalculatorInterface;
import com.github.ones1kk.asserts.core.feature.comparable.calculator.impl.LongCalculator;
import com.github.ones1kk.asserts.core.lang.lng.LongsInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import static com.github.ones1kk.asserts.core.feature.number.unit.LongUnit.of;

public class Longs extends Objects<Long> implements LongsInterface<Long> {

    private final ComparableCalculatorInterface<Long> calculator = new LongCalculator();

    public Longs(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Long actual) {
        if (of(actual).isZeroRemainder()
                || calculator.isLessThan(actual, 0L)) {
            handler.setDescription(handler.from(actual, "{} is not odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Long actual) {
        if (of(actual).isNotZeroRemainder()
                || calculator.isLessThan(actual, 0L)) {
            handler.setDescription(handler.from(actual, "{} is odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Long actual) {
        if (of(actual).isNotZeroRemainder()
                || calculator.isLessThan(actual, 0L)
                || of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is not even"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Long actual) {
        if (of(actual).isNotZero()) {
            if (of(actual).isZeroRemainder()
                    || calculator.isLessThan(actual, 0L)) {
                handler.setDescription(handler.from(actual, "{} is even"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsPositive(Long actual) {
        if (calculator.isLessThanOrEqualTo(actual, 0L)) {
            handler.setDescription(handler.from(actual, "{} is not positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Long actual) {
        if (calculator.isGraterThan(actual, 0L)) {
            handler.setDescription(handler.from(actual, "{} is positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Long actual) {
        if (calculator.isGraterThanOrEqualTo(actual, 0L)) {
            handler.setDescription(handler.from(actual, "{} is not negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Long actual) {
        if (calculator.isLessThan(actual, 0L)) {
            handler.setDescription(handler.from(actual, "{} is negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Long actual) {
        if (of(actual).isNotZero()) {
            handler.setDescription(handler.from(actual, "{} is not zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Long actual) {
        if (of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Long actual, Long expected) {
        if (calculator.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Long actual, Long expected) {
        if (calculator.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Long actual, Long expected) {
        if (calculator.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Long actual, Long expected) {
        if (calculator.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Long actual, Long start, Long end) {
        if (calculator.isLessThan(actual, start)
                || calculator.isGraterThan(actual, end)) {
            String description = handler.from("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Long actual, Long expected, Offset<Long> offset) {
        long startResult = Long.compare(actual, (expected - offset.getValue()));
        long endResult = Long.compare(actual, (expected + offset.getValue()));

        if (calculator.is(startResult, -1L)
                || calculator.is(endResult, 1L)) {
            setAssertClose(actual, expected, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Long actual, Long expected, Offset<Long> offset) {
        long startResult = Long.compare(actual, (expected - offset.getValue()));
        long endResult = Long.compare(actual, (expected + offset.getValue()));

        if (calculator.is(startResult, 1L)
                || calculator.is(endResult, 1L)) {
            setAssertClose(actual, expected, offset);
        }
    }

    private void setAssertClose(Long actual, Long expected, Offset<Long> offset) {
        
        String scope = handler.getDescribable().as("{} have to close to {}", actual,
                (expected - offset.getValue()) + " ~ " + (expected + offset.getValue()));
        handler.setDescription(handler.from(actual, scope));
        throw handler.getException();
    }

}
