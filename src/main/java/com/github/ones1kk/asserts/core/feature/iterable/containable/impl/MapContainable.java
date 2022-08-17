package com.github.ones1kk.asserts.core.feature.iterable.containable.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapContainable<ACTUAL extends Map<K, V>, K, V> {

    public boolean containsAllKey(ACTUAL actual, Map<? extends K, ?> expected) {
        Set<K> actualKeys = actual.keySet();
        return actualKeys.containsAll(expected.keySet());
    }

    public boolean doesNotContainAllKey(ACTUAL actual, Map<? extends K, ?> expected) {
        return !(containsAllKey(actual, expected));
    }

    public boolean containsAllValue(ACTUAL actual, Map<?, ? extends V> expected) {
        Collection<V> actualKeys = actual.values();
        return actualKeys.containsAll(expected.values());
    }

    public boolean doesNotContainAllValue(ACTUAL actual, Map<?, ? extends V> expected) {
        return !(containsAllValue(actual, expected));
    }

}
