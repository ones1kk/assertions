package io.github.ones1kk.assertion.core.info;

public class Target<ACTUAL, EXPECTED> {
    private ACTUAL actual;

    private EXPECTED expected;

    public Target(ACTUAL actual) {
        this.actual = actual;
    }

    public Target(ACTUAL actual, EXPECTED expected) {
        this.actual = actual;
        this.expected = expected;
    }

    public ACTUAL getActual() {
        return actual;
    }

    public EXPECTED getExpected() {
        return expected;
    }
}
