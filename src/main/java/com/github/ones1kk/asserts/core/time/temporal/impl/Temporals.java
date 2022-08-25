package com.github.ones1kk.asserts.core.time.temporal.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.time.temporal.TemporalsInterface;

import java.time.temporal.Temporal;

public class Temporals<ACTUAL extends Temporal> extends Objects<ACTUAL> implements TemporalsInterface<ACTUAL> {

    public Temporals(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertIsEqualTo(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertIsNotEqualTo(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertIsBefore(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertIsBeforeOrEqualTo(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertIsAfter(ACTUAL actual, ACTUAL expected) {

    }

    @Override
    public void assertIsAfterOrEqualTo(ACTUAL actual, ACTUAL expected) {

    }
}
