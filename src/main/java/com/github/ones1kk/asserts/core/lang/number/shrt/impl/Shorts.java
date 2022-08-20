package com.github.ones1kk.asserts.core.lang.number.shrt.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.feature.data.Offset;
import com.github.ones1kk.asserts.core.feature.comparable.ComparableLanguage;
import com.github.ones1kk.asserts.core.feature.comparable.impl.ComparableLanguageImpl;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.lang.number.shrt.ShortsInterface;

import static com.github.ones1kk.asserts.core.feature.number.arithmetic.ShortArithmeticUnit.of;

public class Shorts extends Objects<Short> implements ShortsInterface<Short> {

    private final ComparableLanguage<Short> comparable = new ComparableLanguageImpl<>();

    public Shorts(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsOdd(Short actual) {
        if (of(actual).isEven()
            || comparable.isLessThan(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is not odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotOdd(Short actual) {
        if (of(actual).isOdd()
            || comparable.isLessThan(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is odd"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsEven(Short actual) {
        if (of(actual).isOdd()
            || comparable.isLessThan(actual, (short) 0)
            || of(actual).isZero()) {
            handler.setDescription(handler.from(actual, "{} is not even"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotEven(Short actual) {
        if (of(actual).isNotZero()) {
            if (of(actual).isEven()
                || comparable.isLessThan(actual, (short) 0)) {
                handler.setDescription(handler.from(actual, "{} is even"));
                throw handler.getException();
            }
        }
    }

    @Override
    public void assertIsPositive(Short actual) {
        if (comparable.isLessThanOrEqualTo(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is not positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotPositive(Short actual) {
        if (comparable.isGraterThan(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is positive"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNegative(Short actual) {
        if (comparable.isGraterThanOrEqualTo(actual, (short) 0)) {
            handler.setDescription(handler.from(actual, "{} is not negative"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsNotNegative(Short actual) {
        if (comparable.isLessThan(actual, (short) 0)) {
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
        if (comparable.isGraterThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsLessThanOrEqualTo(Short actual, Short expected) {
        if (comparable.isGraterThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not less than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThan(Short actual, Short expected) {
        if (comparable.isLessThanOrEqualTo(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsGreaterThanOrEqualTo(Short actual, Short expected) {
        if (comparable.isLessThan(actual, expected)) {
            handler.setDescription(handler.from(actual, expected, "{} is not greater than or equal to {}"));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsBetween(Short actual, Short start, Short end) {
        if (comparable.isLessThan(actual, start)
            || comparable.isGraterThan(actual, end)) {
            String description = handler.from("{} is not between {} and {}", actual, start, end);
            handler.setDescription(handler.from(actual, description));
            throw handler.getException();
        }
    }

    @Override
    public void assertIsCloseTo(Short actual, Short expected, Offset<Short> offset) {
        short startResult = (short) Short.compare(actual, (short) offset.getBefore(expected));
        short endResult = (short) Short.compare(actual, (short) offset.getAfter(expected));

        if (comparable.isLessThan(startResult, (short) 0)
            || comparable.isGraterThan(endResult, (short) 0)) {
            setAssertClose(actual, expected, offset);
        }
    }

    @Override
    public void assertIsNotCloseTo(Short actual, Short expected, Offset<Short> offset) {
        short startResult = (short) Short.compare(actual, (short) offset.getBefore(expected));
        short endResult = (short) Short.compare(actual, (short) offset.getAfter(expected));

        if (comparable.isGraterThanOrEqualTo(startResult, (short) 0)
            || comparable.isGraterThanOrEqualTo(endResult, (short) 0)) {
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
