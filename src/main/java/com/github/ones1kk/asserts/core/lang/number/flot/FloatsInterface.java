package com.github.ones1kk.asserts.core.lang.number.flot;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;
import com.github.ones1kk.asserts.core.feature.number.Numerable;

public interface FloatsInterface<ACTUAL> extends Comparable<ACTUAL>, Numerable<Float> {

    void assertIsInfinity(ACTUAL actual);

    void assertIsFinite(ACTUAL actual);

    void assertIsNaN(ACTUAL actual);
}
