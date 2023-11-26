package io.github.ones1kk.assertion.core.feature.comparable;

import io.github.ones1kk.assertion.core.info.AssertionsInfo;

public interface ComparableAssertion<ACTUAL> {

    void assertLessThan(AssertionsInfo info, ACTUAL actual, ACTUAL expected);

    void assertLessThanOrEqualTo(AssertionsInfo info, ACTUAL actual, ACTUAL expected);

    void assertGreaterThan(AssertionsInfo info, ACTUAL actual, ACTUAL expected);

    void assertGreaterThanOrEqualTo(AssertionsInfo info, ACTUAL actual, ACTUAL expected);

    void assertBetween(AssertionsInfo info, ACTUAL actual, ACTUAL start, ACTUAL end);
}
