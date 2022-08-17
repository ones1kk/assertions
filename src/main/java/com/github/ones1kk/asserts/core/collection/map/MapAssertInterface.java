package com.github.ones1kk.asserts.core.collection.map;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;

import java.util.Map;

public interface MapAssertInterface<SELF, ACTUAL extends Map<K, V>, K, V> extends ComparableAssert<SELF, ACTUAL> {

    SELF isEmpty();

    SELF isNotEmpty();

    SELF isNullOrEmpty();

    SELF containsKey(K expected);

    SELF containsAllKey(Map<? extends K, ?> expected);

    SELF containsValue(V expected);

    SELF containsAllValue(Map<?, ? extends V> expected);

    SELF hasSizeOf(int expected);

    SELF hasSameSizeOf(Map<?, ?> expected);

    SELF doesNotHaveSameSizeOf(Map<?, ?> expected);
}
