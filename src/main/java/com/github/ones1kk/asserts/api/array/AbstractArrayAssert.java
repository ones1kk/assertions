package com.github.ones1kk.asserts.api.array;

import com.github.ones1kk.asserts.api.lang.object.AbstractObjectAssert;

import java.util.function.Predicate;

public class AbstractArrayAssert<SELF extends AbstractArrayAssert<SELF, ACTUAL>, ACTUAL> extends AbstractObjectAssert<SELF, ACTUAL[]> implements ArrayAssertInterface<SELF, ACTUAL> {

    private final ArraysInterface<ACTUAL> arrays;

    @SuppressWarnings("unchecked")
    public AbstractArrayAssert(Class<?> self, ACTUAL[] actual) {
        super(self, actual);
        this.arrays = (ArraysInterface<ACTUAL>) assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF isEmpty() {
        arrays.assertIsEmpty(actual);
        return self;
    }

    @Override
    public SELF isNotEmpty() {
        arrays.assertIsNotEmpty(actual);
        return self;
    }

    @Override
    public SELF isNullOrEmpty() {
        arrays.assertIsNullOrEmpty(actual);
        return self;
    }

    @Override
    public SELF contains(ACTUAL expected) {
        arrays.assertContains(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotContain(ACTUAL expected) {
        arrays.assertDoesNotContain(actual, expected);
        return self;
    }

    @Override
    public SELF containsAll(ACTUAL... expected) {
        arrays.assertContainsAll(actual, expected);
        return self;
    }

    @Override
    public SELF containsAny(ACTUAL... expected) {
        arrays.assertContainsAny(actual, expected);
        return self;
    }

    @Override
    public SELF containsNull() {
        arrays.assertContainsNull(actual);
        return self;
    }

    @Override
    public SELF doesNotContainNull() {
        arrays.assertDoesNotContainNull(actual);
        return self;
    }

    @Override
    public SELF allMatch(Predicate<ACTUAL> expected) {
        arrays.assertAllMatch(actual, expected);
        return self;
    }

    @Override
    public SELF noneMatch(Predicate<ACTUAL> expected) {
        arrays.assertNoneMatch(actual, expected);
        return self;
    }
}
