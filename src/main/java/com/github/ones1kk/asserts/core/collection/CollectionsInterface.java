package com.github.ones1kk.asserts.core.collection;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;
import com.github.ones1kk.asserts.core.feature.iterable.CollectionIterable;

import java.util.Collection;

public interface CollectionsInterface<ELEMENT> extends CollectionIterable<ELEMENT>, Comparable<Collection<? extends ELEMENT>> {
}
