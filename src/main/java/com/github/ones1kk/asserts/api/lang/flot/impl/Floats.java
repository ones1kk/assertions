package com.github.ones1kk.asserts.api.lang.flot.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.feature.Offset;
import com.github.ones1kk.asserts.api.feature.comparable.calculator.ComparableCalculatorInterface;
import com.github.ones1kk.asserts.api.feature.comparable.calculator.impl.FloatCalculator;
import com.github.ones1kk.asserts.api.lang.flot.FloatsInterface;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;

import static com.github.ones1kk.asserts.api.feature.number.unit.FloatUnit.of;

public class Floats extends Objects<Float> implements FloatsInterface<Float> {

    private final ComparableCalculatorInterface<Float> calculator = new FloatCalculator();

    public Floats(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsInfinity(Float actual) {
        if (!Float.isInfinite(actual)) {
            handler.setDescription(handler.from(actual, "{} is not infinity"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsFinite(Float actual) {
        if (!Float.isFinite(actual)) {
            handler.setDescription(handler.from(actual, "{} is not finite"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNaN(Float actual) {
        if (!Float.isNaN(actual)) {
            handler.setDescription(handler.from(actual, "{} is not NaN"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThan(Float actual, Float expected) {
        if (calculator.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Float actual, Float expected) {
        if (calculator.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Float actual, Float expected) {
        if (calculator.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Float actual, Float expected) {
        if (calculator.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Float actual, Float start, Float end) {
        if (calculator.isLessThan(actual, start)
                || calculator.isGraterThan(actual, end)) {
            String description = handler.from("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Float actual) {
        if (calculator.isLessThanOrEqualTo(actual, 0F)) {
            handler.setDescription(handler.from(actual, "{} is not positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Float actual) {
        if (calculator.isGraterThan(actual, 0F)) {
            handler.setDescription(handler.from(actual, "{} is positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Float actual) {
        if (calculator.isGraterThanOrEqualTo(actual, 0F)) {
            handler.setDescription(handler.from(actual, "{} is not negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Float actual) {
        if (calculator.isLessThan(actual, 0F)) {
            handler.setDescription(handler.from(actual, "{} is negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsZero(Float actual) {
        if (of(actual).isNotZero()) {
            handler.setDescription(handler.from(actual, "{} is not zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotZero(Float actual) {
        if (of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is zero"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Float actual, Float expected, Offset<Float> offset) {
        float startResult = Float.compare(actual, (expected - offset.getValue()));
        float endResult = Float.compare(actual, (expected + offset.getValue()));

        if (calculator.is(startResult, - 1F)
                || calculator.is(endResult, 1F)) {
            setAssertClose(actual, expected, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Float actual, Float expected, Offset<Float> offset) {
        float startResult = Float.compare(actual, (expected - offset.getValue()));
        float endResult = Float.compare(actual, (expected + offset.getValue()));

        if (calculator.is(startResult, 1F)
                || calculator.is(endResult, 1F)) {
            setAssertClose(actual, expected, offset);
        }
    }

    private void setAssertClose(Float actual, Float expected, Offset<Float> offset) {
        // TODO : getter
        String scope = handler.getDescribable().as("{} is close to {}", actual,
                (expected - offset.getValue()) + " ~ " + (expected + offset.getValue()));
        handler.setDescription(handler.from(actual, scope));
        throw handler.getException();
    }
}
