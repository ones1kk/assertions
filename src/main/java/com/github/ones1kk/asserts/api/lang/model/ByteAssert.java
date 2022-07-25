package com.github.ones1kk.asserts.api.lang.model;

import com.github.ones1kk.asserts.api.lang.bte.AbstractByteAssert;

public class ByteAssert extends AbstractByteAssert<ByteAssert, Byte> {

    public ByteAssert(Byte actual) {
        super(ByteAssert.class, actual);
    }
}
