package com.github.ones1kk.asserts.core.collection.model;

import com.github.ones1kk.asserts.core.collection.AbstractCollectionAssert;

import java.util.Collection;

public class CollectionAssert<ELEMENT> extends AbstractCollectionAssert<CollectionAssert<ELEMENT>, ELEMENT> {

    public CollectionAssert(Collection<ELEMENT> actual) {
        super(CollectionAssert.class, actual);
    }
}
