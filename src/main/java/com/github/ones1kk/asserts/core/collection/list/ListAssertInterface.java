package com.github.ones1kk.asserts.core.collection.list;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;
import com.github.ones1kk.asserts.core.feature.comparable.ComparableAssert;
import com.github.ones1kk.asserts.core.feature.iterable.IterableAssert;

import java.util.List;

public interface ListAssertInterface<SELF, ACTUAL> extends IterableAssert<SELF, ACTUAL>, ComparableAssert<SELF, List<? extends ACTUAL>> {
}
