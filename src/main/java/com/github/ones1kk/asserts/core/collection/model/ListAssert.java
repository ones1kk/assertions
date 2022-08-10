package com.github.ones1kk.asserts.core.collection.model;

import com.github.ones1kk.asserts.core.collection.list.AbstractListAssert;

import java.util.List;

public class ListAssert<ELEMENT> extends AbstractListAssert<ListAssert<ELEMENT>, ELEMENT> {

    public ListAssert(List<? extends ELEMENT> actual) {
        super(ListAssert.class, actual);
    }
}
