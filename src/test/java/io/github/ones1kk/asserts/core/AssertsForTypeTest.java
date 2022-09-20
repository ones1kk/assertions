package io.github.ones1kk.asserts.core;

import io.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URL;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import static io.github.ones1kk.asserts.core.AssertsForType.that;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

class AssertsForTypeTest {

    @Test
    @DisplayName("Return type")
    public void test1() throws Exception {
        assertThat(that('3')).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(1)).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(1.0)).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(1L)).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(1F)).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that((short) 1)).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that((byte) 1)).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(true)).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(singletonList("1"))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(singletonList('1'))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(singletonList(1))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(singletonList(1.0))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(singletonList(1L))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(singletonList(1.0F))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(singletonList((byte) 1))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(singletonList((short) 1))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(singletonList(true))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new HashSet<>())).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new ArrayList<>())).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new HashMap<>())).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new Stack<>())).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new String[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new CharSequence[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new Character[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new Integer[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new Long[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new Float[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new Number[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new Double[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new Short[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new Byte[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new Object[0])).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new URL("https://www.google.com"))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(new File(""))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(LocalTime.now())).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(Month.JANUARY)).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(Year.of(1995))).isInstanceOf(AbstractObjectAssert.class);
        assertThat(that(MonthDay.of(2, 1))).isInstanceOf(AbstractObjectAssert.class);
    }
}