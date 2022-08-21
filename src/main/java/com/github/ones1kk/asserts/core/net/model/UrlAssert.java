package com.github.ones1kk.asserts.core.net.model;

import com.github.ones1kk.asserts.core.net.AbstractUrlAssert;

import java.net.URL;

public class UrlAssert extends AbstractUrlAssert<UrlAssert> {

    public UrlAssert(URL actual) {
        super(UrlAssert.class, actual);
    }
}
