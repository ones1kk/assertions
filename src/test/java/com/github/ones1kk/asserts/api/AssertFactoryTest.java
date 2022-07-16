package com.github.ones1kk.asserts.api;

import com.github.ones1kk.asserts.api.lang.charsequence.impl.CharSequences;
import com.github.ones1kk.asserts.api.lang.object.impl.Objects;
import com.github.ones1kk.asserts.api.lang.string.impl.Strings;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.*;

class AssertFactoryTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Return type")
    public void test1() throws Exception {
        // given
        AssertFactory factory = new AssertFactory();

        // when
        Objects<Object> actual1 = factory.createAssert(new Object(), asAssert);
        CharSequences actual2 = factory.createAssert((CharSequence) "actual2", asAssert);
        Strings actual3 = factory.createAssert("actual3", asAssert);

        //then
        assertThat(actual1).isInstanceOf(Objects.class);
        assertThat(actual2).isInstanceOf(CharSequences.class);
        assertThat(actual3).isInstanceOf(Strings.class);
    }

}