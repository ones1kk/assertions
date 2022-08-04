package com.github.ones1kk.asserts.core.feature.iterable.containable.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.Containable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberArrayContainableTest {

    @Test
    @DisplayName("Method test(Number)")
    public void test1() throws Exception {
        Containable<Number> containable = new NumberArrayContainable<>();
        Number[] actual = {1, 2L, 3, 4.4, 5.5F, 6};

        assertThat(containable.contains(actual, 6)).isTrue();
        assertThat(containable.contains(actual, 7.7)).isFalse();

        assertThat(containable.doesNotContain(actual, 67.12)).isTrue();
        assertThat(containable.doesNotContain(actual, 2L)).isFalse();

        assertThat(containable.containsAll(actual, 1, 2L, 4.4)).isTrue();
        assertThat(containable.containsAll(actual, 7, 8L)).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, 7, 8, 9)).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, 5.5F, 10)).isTrue();

        // one
        assertThat(containable.containsAny(actual, 9, 8, 4.4)).isTrue();
        // all
        assertThat(containable.containsAny(actual, 1, 2L, 3)).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, 9, 8.8, 7)).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, 9, 8.8, 7)).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, 9, 8, 4.4)).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(new Number[]{1, null, 2L, 4.4})).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(new Number[]{1, null, 2L, 4.4})).isFalse();
    }

    @Test
    @DisplayName("Method test(Double)")
    public void test2() throws Exception {
        Containable<Double> containable = new NumberArrayContainable<>();
        Double[] actual = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};

        assertThat(containable.contains(actual, 6.6)).isTrue();
        assertThat(containable.contains(actual, 7.7)).isFalse();

        assertThat(containable.doesNotContain(actual, 67.12)).isTrue();
        assertThat(containable.doesNotContain(actual, 2.2)).isFalse();

        assertThat(containable.containsAll(actual, 1.1, 2.2, 4.4)).isTrue();
        assertThat(containable.containsAll(actual, 7.7, 8.8)).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, 7.7, 8.8, 9.9)).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, 5.5, 10.0)).isTrue();

        // one
        assertThat(containable.containsAny(actual, 9.9, 8.8, 4.4)).isTrue();
        // all
        assertThat(containable.containsAny(actual, 1.1, 2.2, 3.3)).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, 9.9, 8.8, 7.7)).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, 9.9, 8.8, 7.7)).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, 9.9, 8.8, 4.4)).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(new Double[]{1.1, null, 2.2, 4.4})).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(new Double[]{1.1, null, 2.2, 4.4})).isFalse();
    }

    @Test
    @DisplayName("Method test(Long)")
    public void test3() throws Exception {
        Containable<Long> containable = new NumberArrayContainable<>();
        Long[] actual = {1L, 2L, 3L, 4L, 5L, 6L};

        assertThat(containable.contains(actual, 6L)).isTrue();
        assertThat(containable.contains(actual, 7L)).isFalse();

        assertThat(containable.doesNotContain(actual, 67L)).isTrue();
        assertThat(containable.doesNotContain(actual, 2L)).isFalse();

        assertThat(containable.containsAll(actual, 1L, 2L, 4L)).isTrue();
        assertThat(containable.containsAll(actual, 7L, 8L)).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, 7L, 8L, 9L)).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, 5L, 10L)).isTrue();

        // one
        assertThat(containable.containsAny(actual, 9L, 8L, 4L)).isTrue();
        // all
        assertThat(containable.containsAny(actual, 1L, 2L, 3L)).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, 9L, 8L, 7L)).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, 9L, 8L, 7L)).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, 9L, 8L, 4L)).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(new Long[]{1L, null, 2L, 4L})).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(new Long[]{1L, null, 2L, 4L})).isFalse();
    }

    @Test
    @DisplayName("Method test(Integer)")
    public void test4() throws Exception {
        Containable<Integer> containable = new NumberArrayContainable<>();
        Integer[] actual = {1, 2, 3, 4, 5, 6};

        assertThat(containable.contains(actual, 6)).isTrue();
        assertThat(containable.contains(actual, 7)).isFalse();

        assertThat(containable.doesNotContain(actual, 67)).isTrue();
        assertThat(containable.doesNotContain(actual, 2)).isFalse();

        assertThat(containable.containsAll(actual, 1, 2, 4)).isTrue();
        assertThat(containable.containsAll(actual, 7, 8)).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, 7, 8, 9)).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, 5, 10)).isTrue();

        // one
        assertThat(containable.containsAny(actual, 9, 8, 4)).isTrue();
        // all
        assertThat(containable.containsAny(actual, 1, 2, 3)).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, 9, 8, 7)).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, 9, 8, 7)).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, 9, 8, 4)).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(new Integer[]{1, null, 2, 4})).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(new Integer[]{1, null, 2, 4})).isFalse();
    }

    @Test
    @DisplayName("Method test(Float)")
    public void test5() throws Exception {
        Containable<Float> containable = new NumberArrayContainable<>();
        Float[] actual = {1F, 2F, 3F, 4F, 5F, 6F};

        assertThat(containable.contains(actual, 6F)).isTrue();
        assertThat(containable.contains(actual, 7F)).isFalse();

        assertThat(containable.doesNotContain(actual, 67F)).isTrue();
        assertThat(containable.doesNotContain(actual, 2F)).isFalse();

        assertThat(containable.containsAll(actual, 1F, 2F, 4F)).isTrue();
        assertThat(containable.containsAll(actual, 7F, 8F)).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, 7F, 8F, 9F)).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, 5F, 10F)).isTrue();

        // one
        assertThat(containable.containsAny(actual, 9F, 8F, 4F)).isTrue();
        // all
        assertThat(containable.containsAny(actual, 1F, 2F, 3F)).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, 9F, 8F, 7F)).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, 9F, 8F, 7F)).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, 9F, 8F, 4F)).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(new Float[]{1F, null, 2F, 4F})).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(new Float[]{1F, null, 2F, 4F})).isFalse();
    }

    @Test
    @DisplayName("Method test(Short)")
    public void test6() throws Exception {
        Containable<Short> containable = new NumberArrayContainable<>();
        Short[] actual = {(short) 1, (short) 2, (short) 3, (short) 4, (short) 5, (short) 6};

        assertThat(containable.contains(actual, (short) 6)).isTrue();
        assertThat(containable.contains(actual, (short) 7)).isFalse();

        assertThat(containable.doesNotContain(actual, (short) 67)).isTrue();
        assertThat(containable.doesNotContain(actual, (short) 2)).isFalse();

        assertThat(containable.containsAll(actual, (short) 1, (short) 2, (short) 4)).isTrue();
        assertThat(containable.containsAll(actual, (short) 7, (short) 8)).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, (short) 7, (short) 8, (short) 9)).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, (short) 5, (short) 10)).isTrue();

        // one
        assertThat(containable.containsAny(actual, (short) 9, (short) 8, (short) 4)).isTrue();
        // all
        assertThat(containable.containsAny(actual, (short) 1, (short) 2, (short) 3)).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, (short) 9, (short) 8, (short) 7)).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, (short) 9, (short) 8, (short) 7)).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, (short) 9, (short) 8, (short) 4)).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(new Short[]{(short) 1, null, (short) 2, (short) 4})).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(new Short[]{(short) 1, null, (short) 2, (short) 4})).isFalse();
    }

    @Test
    @DisplayName("Method test(Byte)")
    public void test7() throws Exception {
        Containable<Byte> containable = new NumberArrayContainable<>();
        Byte[] actual = {(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6};

        assertThat(containable.contains(actual, (byte) 6)).isTrue();
        assertThat(containable.contains(actual, (byte) 7)).isFalse();

        assertThat(containable.doesNotContain(actual, (byte) 67)).isTrue();
        assertThat(containable.doesNotContain(actual, (byte) 2)).isFalse();

        assertThat(containable.containsAll(actual, (byte) 1, (byte) 2, (byte) 4)).isTrue();
        assertThat(containable.containsAll(actual, (byte) 7, (byte) 8)).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, (byte) 7, (byte) 8, (byte) 9)).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, (byte) 5, (byte) 10)).isTrue();

        // one
        assertThat(containable.containsAny(actual, (byte) 9, (byte) 8, (byte) 4)).isTrue();
        // all
        assertThat(containable.containsAny(actual, (byte) 1, (byte) 2, (byte) 3)).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, (byte) 9, (byte) 8, (byte) 7)).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, (byte) 9, (byte) 8, (byte) 7)).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, (byte) 9, (byte) 8, (byte) 4)).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(new Byte[]{(byte) 1, null, (byte) 2, (byte) 4})).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(new Byte[]{(byte) 1, null, (byte) 2, (byte) 4})).isFalse();
    }

}