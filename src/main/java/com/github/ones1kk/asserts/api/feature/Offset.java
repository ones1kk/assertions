package com.github.ones1kk.asserts.api.feature;


import com.github.ones1kk.asserts.api.Asserts;

public final class Offset<T extends Number> {

    private final T value;

    private Offset(T value) {
        Asserts.that(value)
                .as("Offset value can not be null")
                .isNotNull();
        this.value = value;
    }

    public static <T extends Number> Offset<T> offset(T value) {
        return new Offset<>(value);
    }

    public T getValue() {
        return value;
    }
}
