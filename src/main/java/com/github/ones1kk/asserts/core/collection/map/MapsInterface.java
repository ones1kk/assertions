package com.github.ones1kk.asserts.core.collection.map;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;
import com.github.ones1kk.asserts.core.feature.iterable.collection.MapIterable;

import java.util.Map;

public interface MapsInterface<ELEMENT extends Map<K, V>, K, V> extends MapIterable<ELEMENT, K, V>, Comparable<ELEMENT> {
}
