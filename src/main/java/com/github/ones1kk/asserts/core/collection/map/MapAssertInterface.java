package com.github.ones1kk.asserts.core.collection.map;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.core.feature.iterable.IterableAssert;

import java.util.Map;

public interface MapAssertInterface<SELF, ACTUAL extends Map<K, V>, K, V> extends IterableAssert<SELF, ACTUAL>, ComparableAssert<SELF, ACTUAL> {
}
