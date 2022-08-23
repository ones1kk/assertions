package com.github.ones1kk.asserts.core.feature.iterable.containable.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.array.ArrayContainable;
import com.github.ones1kk.asserts.core.feature.iterable.containable.array.impl.NumberArrayContainableImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberArrayContainableImplImplTest {

    @Test
    @DisplayName("Method test(Number)")
    public void test1() throws Exception {
        ArrayContainable<Number> arrayContainable = new NumberArrayContainableImpl<>();
        Number[] actual = {1, 2L, 3, 4.4, 5.5F, 6};

        assertThat(arrayContainable.contains(actual, 6)).isTrue();
        assertThat(arrayContainable.contains(actual, 7.7)).isFalse();

        assertThat(arrayContainable.doesNotContain(actual, 67.12)).isTrue();
        assertThat(arrayContainable.doesNotContain(actual, 2L)).isFalse();

        assertThat(arrayContainable.containsAll(actual, 1, 2L, 4.4)).isTrue();
        assertThat(arrayContainable.containsAll(actual, 7, 8L)).isFalse();

        // all
        assertThat(arrayContainable.containsNotAll(actual, 7, 8, 9)).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual, 5.5F, 10)).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual, 9, 8, 4.4)).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, 1, 2L, 3)).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, 9, 8.8, 7)).isFalse();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, 9, 8.8, 7)).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual, 9, 8, 4.4)).isFalse();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new Number[]{1, null, 2L, 4.4})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new Number[]{1, null, 2L, 4.4})).isFalse();
    }

    @Test
    @DisplayName("Method test(Double)")
    public void test2() throws Exception {
        ArrayContainable<Double> arrayContainable = new NumberArrayContainableImpl<>();
        Double[] actual = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};

        assertThat(arrayContainable.contains(actual, 6.6)).isTrue();
        assertThat(arrayContainable.contains(actual, 7.7)).isFalse();

        assertThat(arrayContainable.doesNotContain(actual, 67.12)).isTrue();
        assertThat(arrayContainable.doesNotContain(actual, 2.2)).isFalse();

        assertThat(arrayContainable.containsAll(actual, 1.1, 2.2, 4.4)).isTrue();
        assertThat(arrayContainable.containsAll(actual, 7.7, 8.8)).isFalse();

        // all
        assertThat(arrayContainable.containsNotAll(actual, 7.7, 8.8, 9.9)).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual, 5.5, 10.0)).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual, 9.9, 8.8, 4.4)).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, 1.1, 2.2, 3.3)).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, 9.9, 8.8, 7.7)).isFalse();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, 9.9, 8.8, 7.7)).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual, 9.9, 8.8, 4.4)).isFalse();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new Double[]{1.1, null, 2.2, 4.4})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new Double[]{1.1, null, 2.2, 4.4})).isFalse();
    }

    @Test
    @DisplayName("Method test(Long)")
    public void test3() throws Exception {
        ArrayContainable<Long> arrayContainable = new NumberArrayContainableImpl<>();
        Long[] actual = {1L, 2L, 3L, 4L, 5L, 6L};

        assertThat(arrayContainable.contains(actual, 6L)).isTrue();
        assertThat(arrayContainable.contains(actual, 7L)).isFalse();

        assertThat(arrayContainable.doesNotContain(actual, 67L)).isTrue();
        assertThat(arrayContainable.doesNotContain(actual, 2L)).isFalse();

        assertThat(arrayContainable.containsAll(actual, 1L, 2L, 4L)).isTrue();
        assertThat(arrayContainable.containsAll(actual, 7L, 8L)).isFalse();

        // all
        assertThat(arrayContainable.containsNotAll(actual, 7L, 8L, 9L)).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual, 5L, 10L)).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual, 9L, 8L, 4L)).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, 1L, 2L, 3L)).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, 9L, 8L, 7L)).isFalse();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, 9L, 8L, 7L)).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual, 9L, 8L, 4L)).isFalse();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new Long[]{1L, null, 2L, 4L})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new Long[]{1L, null, 2L, 4L})).isFalse();
    }

    @Test
    @DisplayName("Method test(Integer)")
    public void test4() throws Exception {
        ArrayContainable<Integer> arrayContainable = new NumberArrayContainableImpl<>();
        Integer[] actual = {1, 2, 3, 4, 5, 6};

        assertThat(arrayContainable.contains(actual, 6)).isTrue();
        assertThat(arrayContainable.contains(actual, 7)).isFalse();

        assertThat(arrayContainable.doesNotContain(actual, 67)).isTrue();
        assertThat(arrayContainable.doesNotContain(actual, 2)).isFalse();

        assertThat(arrayContainable.containsAll(actual, 1, 2, 4)).isTrue();
        assertThat(arrayContainable.containsAll(actual, 7, 8)).isFalse();

        // all
        assertThat(arrayContainable.containsNotAll(actual, 7, 8, 9)).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual, 5, 10)).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual, 9, 8, 4)).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, 1, 2, 3)).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, 9, 8, 7)).isFalse();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, 9, 8, 7)).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual, 9, 8, 4)).isFalse();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new Integer[]{1, null, 2, 4})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new Integer[]{1, null, 2, 4})).isFalse();
    }

    @Test
    @DisplayName("Method test(Float)")
    public void test5() throws Exception {
        ArrayContainable<Float> arrayContainable = new NumberArrayContainableImpl<>();
        Float[] actual = {1F, 2F, 3F, 4F, 5F, 6F};

        assertThat(arrayContainable.contains(actual, 6F)).isTrue();
        assertThat(arrayContainable.contains(actual, 7F)).isFalse();

        assertThat(arrayContainable.doesNotContain(actual, 67F)).isTrue();
        assertThat(arrayContainable.doesNotContain(actual, 2F)).isFalse();

        assertThat(arrayContainable.containsAll(actual, 1F, 2F, 4F)).isTrue();
        assertThat(arrayContainable.containsAll(actual, 7F, 8F)).isFalse();

        // all
        assertThat(arrayContainable.containsNotAll(actual, 7F, 8F, 9F)).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual, 5F, 10F)).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual, 9F, 8F, 4F)).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, 1F, 2F, 3F)).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, 9F, 8F, 7F)).isFalse();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, 9F, 8F, 7F)).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual, 9F, 8F, 4F)).isFalse();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new Float[]{1F, null, 2F, 4F})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new Float[]{1F, null, 2F, 4F})).isFalse();
    }

    @Test
    @DisplayName("Method test(Short)")
    public void test6() throws Exception {
        ArrayContainable<Short> arrayContainable = new NumberArrayContainableImpl<>();
        Short[] actual = {(short) 1, (short) 2, (short) 3, (short) 4, (short) 5, (short) 6};

        assertThat(arrayContainable.contains(actual, (short) 6)).isTrue();
        assertThat(arrayContainable.contains(actual, (short) 7)).isFalse();

        assertThat(arrayContainable.doesNotContain(actual, (short) 67)).isTrue();
        assertThat(arrayContainable.doesNotContain(actual, (short) 2)).isFalse();

        assertThat(arrayContainable.containsAll(actual, (short) 1, (short) 2, (short) 4)).isTrue();
        assertThat(arrayContainable.containsAll(actual, (short) 7, (short) 8)).isFalse();

        // all
        assertThat(arrayContainable.containsNotAll(actual, (short) 7, (short) 8, (short) 9)).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual, (short) 5, (short) 10)).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual, (short) 9, (short) 8, (short) 4)).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, (short) 1, (short) 2, (short) 3)).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, (short) 9, (short) 8, (short) 7)).isFalse();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, (short) 9, (short) 8, (short) 7)).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual, (short) 9, (short) 8, (short) 4)).isFalse();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new Short[]{(short) 1, null, (short) 2, (short) 4})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new Short[]{(short) 1, null, (short) 2, (short) 4})).isFalse();
    }

    @Test
    @DisplayName("Method test(Byte)")
    public void test7() throws Exception {
        ArrayContainable<Byte> arrayContainable = new NumberArrayContainableImpl<>();
        Byte[] actual = {(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6};

        assertThat(arrayContainable.contains(actual, (byte) 6)).isTrue();
        assertThat(arrayContainable.contains(actual, (byte) 7)).isFalse();

        assertThat(arrayContainable.doesNotContain(actual, (byte) 67)).isTrue();
        assertThat(arrayContainable.doesNotContain(actual, (byte) 2)).isFalse();

        assertThat(arrayContainable.containsAll(actual, (byte) 1, (byte) 2, (byte) 4)).isTrue();
        assertThat(arrayContainable.containsAll(actual, (byte) 7, (byte) 8)).isFalse();

        // all
        assertThat(arrayContainable.containsNotAll(actual, (byte) 7, (byte) 8, (byte) 9)).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual, (byte) 5, (byte) 10)).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual, (byte) 9, (byte) 8, (byte) 4)).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, (byte) 1, (byte) 2, (byte) 3)).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, (byte) 9, (byte) 8, (byte) 7)).isFalse();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, (byte) 9, (byte) 8, (byte) 7)).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual, (byte) 9, (byte) 8, (byte) 4)).isFalse();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new Byte[]{(byte) 1, null, (byte) 2, (byte) 4})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new Byte[]{(byte) 1, null, (byte) 2, (byte) 4})).isFalse();
    }

}