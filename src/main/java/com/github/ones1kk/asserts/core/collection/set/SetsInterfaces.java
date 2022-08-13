package com.github.ones1kk.asserts.core.collection.set;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;
import com.github.ones1kk.asserts.core.feature.iterable.collection.SetIterable;

import java.util.Set;

public interface SetsInterfaces<ELEMENT> extends SetIterable<ELEMENT>, Comparable<Set<? extends ELEMENT>> {
}
