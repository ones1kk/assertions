package com.github.ones1kk.asserts.core.collection.model;

import com.github.ones1kk.asserts.core.collection.set.AbstractSetAssert;

import java.util.Set;

public class SetAssert<ELEMENT> extends AbstractSetAssert<SetAssert<ELEMENT>, ELEMENT> {

    public SetAssert(Set<? extends ELEMENT> actual) {
        super(SetAssert.class, actual);
    }
}
