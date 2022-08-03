package com.github.ones1kk.asserts.core.lang.duble;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;
import com.github.ones1kk.asserts.core.feature.number.Numerable;

public interface DoublesInterface<ACTUAL> extends Comparable<ACTUAL>, Numerable<Double> {

    void assertIsInfinity(ACTUAL actual);

    void assertIsFinite(ACTUAL actual);

    void assertIsNaN(ACTUAL actual);

}
