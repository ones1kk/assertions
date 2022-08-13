package com.github.ones1kk.asserts.core.collection;

import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.core.feature.iterable.IterableAssert;

import java.util.Collection;

public interface CollectionAssertInterface<SELF, ACTUAL> extends IterableAssert<SELF, ACTUAL>, ComparableAssert<SELF, Collection<? extends ACTUAL>> {
}
