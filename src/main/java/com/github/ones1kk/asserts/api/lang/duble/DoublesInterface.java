package com.github.ones1kk.asserts.api.lang.duble;

import com.github.ones1kk.asserts.api.feature.comparable.Comparable;
import com.github.ones1kk.asserts.api.feature.number.Numerable;

public interface DoublesInterface<ACTUAL> extends Comparable<ACTUAL>, Numerable<Double> {

    void assertIsInfinity(ACTUAL actual);

    void assertIsFinite(ACTUAL actual);

    void assertIsNaN(ACTUAL actual);

}
