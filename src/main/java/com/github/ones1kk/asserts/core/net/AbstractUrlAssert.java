package com.github.ones1kk.asserts.core.net;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;

import java.net.URL;

public class AbstractUrlAssert<SELF extends AbstractUrlAssert<SELF>> extends AbstractObjectAssert<SELF, URL> implements UrlAssertInterface<SELF> {

    private final UrlsInterface urls;

    public AbstractUrlAssert(Class<?> self, URL actual) {
        super(self, actual);
        this.urls = assertFactory.createAssert(actual, this);
    }

    @Override
    public SELF hasHost(String expected) {
        urls.assertHasHost(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotHaveHost() {
        urls.assertDoesNotHaveHost(actual);
        return self;
    }

    @Override
    public SELF hasPort(int expected) {
        urls.assertHasPort(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotHavePort() {
        urls.assertDoesNotHavePort(actual);
        return self;
    }

    @Override
    public SELF hasPath(String expected) {
        urls.assertHasPath(actual, expected);
        return self;
    }

    @Override
    public SELF doesNotHavePath() {
        urls.assertDoesNotHavePath(actual);
        return self;
    }
}
