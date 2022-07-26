package com.github.ones1kk.asserts.api.array.number;

import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;

import java.util.function.Predicate;

public class AbstractNumberArrayAssert<SELF extends AbstractNumberArrayAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, Number[]> implements NumberArrayAssertInterface<SELF> {

    private final NumberArraysInterface<Number[], Number> numberArrays;

    public AbstractNumberArrayAssert(Class<?> self, Number[] actual) {
        super(self, actual);
        this.numberArrays = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isMax(Number expected) {
        numberArrays.assertIsMax(actual, expected);
        return self;
    }

    @Override
    public SELF isMin(Number expected) {
        numberArrays.assertIsMin(actual, expected);
        return self;
    }

    @Override
    public SELF isEmpty() {
        numberArrays.assertIsEmpty(actual);
        return self;
    }

    @Override
    public SELF isNotEmpty() {
        numberArrays.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF isNullOrEmpty() {
        numberArrays.assertIsNullOrEmpty(actual);
        return self;
    }

    @Override
    public SELF contains(Number expected) {
        numberArrays.assertContains(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotContain(Number expected) {
        numberArrays.assertDoesNotContain(actual, expected);
        return self;
    }

    @Override
    public SELF containsAll(Number... expected) {
        numberArrays.assertContainsAll(actual, expected);
        return self;
    }

    @Override
    public SELF containsAny(Number... expected) {
        numberArrays.assertContainsAny(actual, expected);
        return self;
    }

    @Override
    public SELF containsNull() {
        numberArrays.assertContainsNull(actual);
        return self;
    }

    @Override
    public SELF doesNotContainNull() {
        numberArrays.assertDoesNotContainNull(actual);
        return self;
    }

    @Override
    public SELF allMatch(Predicate<Number> expected) {
        numberArrays.assertAllMatch(actual, expected);
        return self;
    }

    @Override
    public SELF noneMatch(Predicate<Number> expected) {
        numberArrays.assertNoneMatch(actual, expected);
        return self;
    }
}
