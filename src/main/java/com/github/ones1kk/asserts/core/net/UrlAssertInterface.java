package com.github.ones1kk.asserts.core.net;

public interface UrlAssertInterface<SELF> {

    SELF hasHost(String expected);

    SELF doesNotHaveHost();

    SELF hasPort(int expected);

    SELF doesNotHavePort();

    SELF hasPath(String expected);

    SELF doesNotHavePath();
}
