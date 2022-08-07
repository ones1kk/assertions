package com.github.ones1kk.asserts.core.feature;


import com.github.ones1kk.asserts.core.Asserts;

public final class Offset<T extends Number> {

    private final T value;

    private Offset(T value) {
        Asserts.that(value)
                .as("Offset value can not be null")
                .isNotNull()
                .isInstanceOf(Number.class);
        this.value = value;
    }

    public static <T extends Number> Offset<T> offset(T value) {
        return new Offset<>(value);
    }

    public T getValue() {
        return value;
    }

    public double getBefore(T expected) {
        return (offset(expected).getValueInternal() - value.doubleValue());
    }

    public double getAfter(T expected) {
        return (offset(expected).getValueInternal() + value.doubleValue());
    }

    private double getValueInternal() {
        return offset(value).getValue().doubleValue();
    }

}
