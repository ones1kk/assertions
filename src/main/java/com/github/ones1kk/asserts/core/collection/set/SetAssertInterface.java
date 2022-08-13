package com.github.ones1kk.asserts.core.collection.set;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.core.feature.iterable.IterableAssert;

import java.util.Set;

public interface SetAssertInterface<SELF, ACTUAL> extends IterableAssert<SELF, ACTUAL>, ComparableAssert<SELF, Set<? extends ACTUAL>> {
}
