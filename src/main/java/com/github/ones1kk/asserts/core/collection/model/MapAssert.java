package com.github.ones1kk.asserts.core.collection.model;

import com.github.ones1kk.asserts.core.collection.map.AbstractMapAssert;

import java.util.Map;

public class MapAssert<ACTUAL extends Map<K, V>, K, V> extends AbstractMapAssert<MapAssert<ACTUAL, K, V>, Map<K, V>, K, V> {

    public MapAssert(ACTUAL actual) {
        super(MapAssert.class, actual);
    }
}
