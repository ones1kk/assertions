package com.github.ones1kk.asserts.api.feature;


public final class Offset<T extends Number> {

    public final T value;

    private Offset(T value) {
        this.value = value;
    }

    public static <T extends Number> Offset<T> offset(T value) {
        return new Offset<>(value);
    }
}
