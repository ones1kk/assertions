package com.github.ones1kk.asserts.core.collection.model;

import com.github.ones1kk.asserts.core.collection.map.AbstractMapAssert;
import com.github.ones1kk.asserts.core.collection.map.impl.Maps;
import com.github.ones1kk.asserts.core.collection.set.AbstractSetAssert;

import java.util.Map;
import java.util.Set;

public class MapAssert<ACTUAL extends Map<K, V>, K, V> extends AbstractMapAssert<MapAssert<ACTUAL, K, V>, ACTUAL, K, V> {

    public MapAssert(ACTUAL actual) {
        super(MapAssert.class, actual);
    }
}
