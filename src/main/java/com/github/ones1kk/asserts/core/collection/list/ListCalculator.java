package com.github.ones1kk.asserts.core.collection.list;

import java.util.List;

public class ListCalculator<ELEMENT> {

    public boolean isGraterThan(List<? extends ELEMENT> actual, List<? extends ELEMENT> expected) {
        return actual.size() > expected.size();
    }

    public boolean isLessThan(List<? extends ELEMENT> actual, List<? extends ELEMENT> expected) {
        return actual.size() < expected.size();
    }

    public boolean isLessThanOrEqualTo(List<? extends ELEMENT> actual, List<? extends ELEMENT> expected) {
        return actual.size() <= expected.size();
    }

    public boolean isGraterThanOrEqualTo(List<? extends ELEMENT> actual, List<? extends ELEMENT> expected) {
        return actual.size() >= expected.size();
    }

    public boolean is(List<? extends ELEMENT> actual, List<? extends ELEMENT> expected) {
        return actual.size() == expected.size();
    }
}
