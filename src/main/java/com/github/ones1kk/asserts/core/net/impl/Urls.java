package com.github.ones1kk.asserts.core.net.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.net.UrlsInterface;
import org.apache.commons.lang3.StringUtils;

import java.net.URL;

public class Urls extends Objects<URL> implements UrlsInterface {

    public Urls(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertHasHost(URL actual, String expected) {
        if (StringUtils.isEmpty(actual.getHost()) || !actual.getHost().equals(expected)) {
            handler.setDescription(handler.from(actual, "{} does not have host"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHaveHost(URL actual) {
        if (!StringUtils.isEmpty(actual.getHost())) {
            handler.setDescription(handler.from(actual, "{} has host"));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasPort(URL actual, int expected) {
        int port = actual.getPort() == -1 ? actual.getDefaultPort() : actual.getPort();
        if (port != expected) {
            handler.setDescription(handler.from(actual, "{} does not have port"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHavePort(URL actual) {
        int port = actual.getPort() == -1 ? actual.getDefaultPort() : actual.getPort();
        if (port != -1) {
            handler.setDescription(handler.from(actual, "{} has port"));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasPath(URL actual, String expected) {
        if (StringUtils.isEmpty(actual.getPath()) || !actual.getPath().equals(expected)) {
            handler.setDescription(handler.from(actual, "{} does not have path"));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHavePath(URL actual) {
        if (!StringUtils.isEmpty(actual.getPath())) {
            handler.setDescription(handler.from(actual, "{} has path"));
            throw handler.getException();
        }
    }
}
