package com.github.ones1kk.core.api.lang.charsequence;

import com.github.ones1kk.core.api.lang.object.Objects;

public interface CharSequences<TYPE> {

    void assertIsEmpty(TYPE actual);

    void assertIsNotEmpty(TYPE actual);

    void assertIsBlank(TYPE actual);

    void assertNotIsBlank(TYPE actual);

    void assertIsEqualToIgnoreCase(TYPE actual);


}
