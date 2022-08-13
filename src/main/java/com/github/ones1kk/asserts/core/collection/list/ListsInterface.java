package com.github.ones1kk.asserts.core.collection.list;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;
import com.github.ones1kk.asserts.core.feature.iterable.collection.ListIterable;

import java.util.List;

public interface ListsInterface<ELEMENT> extends ListIterable<ELEMENT>, Comparable<List<? extends ELEMENT>> {
}
