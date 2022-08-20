package com.github.ones1kk.asserts.core.lang.number.flot.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.Offset;
import com.github.ones1kk.asserts.core.feature.comparable.ComparableLanguage;
import com.github.ones1kk.asserts.core.feature.comparable.impl.ComparableLanguageImpl;
import com.github.ones1kk.asserts.core.lang.number.flot.FloatsInterface;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;

import static com.github.ones1kk.asserts.core.feature.number.arithmetic.FloatArithmeticUnit.of;

public class Floats extends Objects<Float> implements FloatsInterface<Float> {

    private final ComparableLanguage<Float> comparable = new ComparableLanguageImpl<>();

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
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Float actual, Float expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Float actual, Float expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Float actual, Float expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Float actual, Float start, Float end) {
        if (comparable.isLessThan(actual, start)
            || comparable.isGraterThan(actual, end)) {
            String description = handler.from("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsPositive(Float actual) {
        if (comparable.isLessThanOrEqualTo(actual, 0F)) {
            handler.setDescription(handler.from(actual, "{} is not positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Float actual) {
        if (comparable.isGraterThan(actual, 0F)) {
            handler.setDescription(handler.from(actual, "{} is positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Float actual) {
        if (comparable.isGraterThanOrEqualTo(actual, 0F)) {
            handler.setDescription(handler.from(actual, "{} is not negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Float actual) {
        if (comparable.isLessThan(actual, 0F)) {
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
        float startResult = Float.compare(actual, (float) offset.getBefore(expected));
        float endResult = Float.compare(actual, (float) offset.getAfter(expected));

        if (comparable.is(startResult, -1F)
            || comparable.is(endResult, 1F)) {
            setAssertClose(actual, expected, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Float actual, Float expected, Offset<Float> offset) {
        float startResult = Float.compare(actual, (float) offset.getBefore(expected));
        float endResult = Float.compare(actual, (float) offset.getAfter(expected));

        if (comparable.is(startResult, 1F)
            || comparable.is(endResult, 1F)) {
            setAssertClose(actual, expected, offset);
        }
    }

    private void setAssertClose(Float actual, Float expected, Offset<Float> offset) {
        String scope = handler.getDescribable().as("{} have to close to {}", actual,
                offset.getBefore(expected) + " ~ " + offset.getAfter(expected));
        handler.setDescription(handler.from(actual, scope));
        throw handler.getException();
    }
}