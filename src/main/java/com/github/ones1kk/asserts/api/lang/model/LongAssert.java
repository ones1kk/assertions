package com.github.ones1kk.asserts.api.lang.model;

import com.github.ones1kk.asserts.api.lang.lng.AbstractLongAssert;

public class LongAssert extends AbstractLongAssert<LongAssert, Long> {

    public LongAssert(Long actual) {
        super(LongAssert.class, actual);
    }
}
