package io.github.ones1kk.asserts.core.net.impl;

import io.github.ones1kk.asserts.core.AsAssert;
import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.asserts.core.lang.object.impl.Objects;
import io.github.ones1kk.asserts.core.message.URLErrorMessages;
import io.github.ones1kk.asserts.core.net.UrlsInterface;
import org.apache.commons.lang3.StringUtils;

import java.net.URL;

/**
 * <strong> The Urls class inherits {@link AbstractObjectAssert} </strong>
 */
public final class Urls extends Objects<URL> implements UrlsInterface {

    public Urls(AsAssert<?> asAssert) {
        super(asAssert);
    }

    @Override
    public void assertHasHost(URL actual, String expected) {
        if (StringUtils.isEmpty(actual.getHost()) || !actual.getHost().equals(expected)) {
            handler.receive(actual, expected, URLErrorMessages.shouldHaveHost(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHaveHost(URL actual) {
        if (!StringUtils.isEmpty(actual.getHost())) {
            handler.receive(actual, URLErrorMessages.shouldDoNotHaveHost(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasPort(URL actual, int expected) {
        int port = actual.getPort() == -1 ? actual.getDefaultPort() : actual.getPort();
        if (port != expected) {
            handler.receive(actual, expected, URLErrorMessages.shouldDoNotHavePort(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHavePort(URL actual) {
        int port = actual.getPort() == -1 ? actual.getDefaultPort() : actual.getPort();
        if (port != -1) {
            handler.receive(actual, URLErrorMessages.shouldDoNotHavePort(actual));
            throw handler.getException();
        }
    }

    @Override
    public void assertHasPath(URL actual, String expected) {
        if (StringUtils.isEmpty(actual.getPath()) || !actual.getPath().equals(expected)) {
            handler.receive(actual, URLErrorMessages.shouldHavePath(actual, expected));
            throw handler.getException();
        }
    }

    @Override
    public void assertDoesNotHavePath(URL actual) {
        if (!StringUtils.isEmpty(actual.getPath())) {
            handler.receive(actual, URLErrorMessages.shouldDoNotHavePath(actual));
            throw handler.getException();
        }
    }
}
