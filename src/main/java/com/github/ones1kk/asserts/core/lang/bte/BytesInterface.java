package com.github.ones1kk.asserts.core.lang.bte;

import com.github.ones1kk.asserts.core.feature.comparable.Comparable;
import com.github.ones1kk.asserts.core.feature.number.Numerable;

public interface BytesInterface<ACTUAL> extends Comparable<ACTUAL>, Numerable<Byte> {

    void assertIsOdd(ACTUAL actual);

    void assertIsNotOdd(ACTUAL actual);

    void assertIsEven(ACTUAL actual);

    void assertIsNotEven(ACTUAL actual);
}
