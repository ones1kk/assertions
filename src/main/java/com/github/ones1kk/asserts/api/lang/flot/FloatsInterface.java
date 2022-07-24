package com.github.ones1kk.asserts.api.lang.flot;

import com.github.ones1kk.asserts.api.feature.comparable.Comparable;
import com.github.ones1kk.asserts.api.feature.number.Numerable;

public interface FloatsInterface<ACTUAL> extends Comparable<ACTUAL>, Numerable<Float> {

    void assertIsInfinity(ACTUAL actual);

    void assertIsFinite(ACTUAL actual);

    void assertIsNaN(ACTUAL actual);
}
