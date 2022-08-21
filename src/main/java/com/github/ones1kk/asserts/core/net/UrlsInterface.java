package com.github.ones1kk.asserts.core.net;

import java.net.URL;

public interface UrlsInterface {

    void assertHasHost(URL actual, String expected);

    void assertDoesNotHaveHost(URL actual);

    void assertHasPort(URL actual, int expected);

    void assertDoesNotHavePort(URL actual);

    void assertHasPath(URL actual, String expected);

    void assertDoesNotHavePath(URL actual);
}
