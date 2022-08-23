package com.github.ones1kk.asserts.core.time.year;

import java.time.Year;

public interface YearsInterface {

    void assertIsLeapYear(Year actual);

    void assertIsNotLeapYear(Year actual);
}
