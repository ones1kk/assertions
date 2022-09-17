package com.github.ones1kk.asserts.core.net.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import com.github.ones1kk.asserts.core.lang.object.impl.Objects;
import com.github.ones1kk.asserts.core.net.UrlsInterface;
import org.apache.commons.lang3.StringUtils;

import java.net.URL;

import static com.github.ones1kk.asserts.core.message.URLErrorMessages.*;

/**
 * <strong> The Urls class inherits {@link com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert} </strong>
 */
public final class Urls extends Objects<URL> implements UrlsInterface {

    public Urls(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertHasHost(URL actual, String expected) {
        if (StringUtils.isEmpty(actual.getHost()) || !actual.getHost().equals(expected)) {
            handler.receive(actual, expected, shouldHaveHost(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHaveHost(URL actual) {
        if (!StringUtils.isEmpty(actual.getHost())) {
            handler.receive(actual, shouldDoNotHaveHost(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasPort(URL actual, int expected) {
        int port = actual.getPort() == -1 ? actual.getDefaultPort() : actual.getPort();
        if (port != expected) {
            handler.receive(actual, expected, shouldDoNotHavePort(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHavePort(URL actual) {
        int port = actual.getPort() == -1 ? actual.getDefaultPort() : actual.getPort();
        if (port != -1) {
            handler.receive(actual, shouldDoNotHavePort(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasPath(URL actual, String expected) {
        if (StringUtils.isEmpty(actual.getPath()) || !actual.getPath().equals(expected)) {
            handler.receive(actual, shouldHavePath(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHavePath(URL actual) {
        if (!StringUtils.isEmpty(actual.getPath())) {
            handler.receive(actual, shouldDoNotHavePath(actual));
            throw handler.getException();
        }
    }
}
