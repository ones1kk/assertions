package com.github.ones1kk.asserts.core.feature.iterable.containable.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.array.ArrayContainable;
import com.github.ones1kk.asserts.core.feature.iterable.containable.array.impl.ArrayContainableImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayContainableImplTest {

    @Test
    @DisplayName("Method test(CharSequence)")
    public void test1() throws Exception {
        ArrayContainable<CharSequence> arrayContainable = new ArrayContainableImpl<>();
        CharSequence[] actual = {"a", "b", "c", "d"};

        assertThat(arrayContainable.contains(actual, "a")).isTrue();
        assertThat(arrayContainable.contains(actual, "e")).isFalse();

        assertThat(arrayContainable.doesNotContain(actual, "z")).isTrue();
        assertThat(arrayContainable.doesNotContain(actual, "a")).isFalse();

        assertThat(arrayContainable.containsAll(actual, "a", "b", "c")).isTrue();
        assertThat(arrayContainable.containsAll(actual, "z", "x", "y")).isFalse();

        // all
        assertThat(arrayContainable.containsNotAll(actual, "z", "y", "x")).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual, "z", "a", "x")).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual, "z", "a", "x")).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, "a", "b", "c")).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, "z", "y", "x")).isFalse();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, "z", "y", "x")).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual, "z", "a", "x")).isFalse();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new CharSequence[]{"a", null, "b", "c"})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new CharSequence[]{"a", null, "b", "c"})).isFalse();
    }

    @Test
    @DisplayName("Method test(String)")
    public void test2() throws Exception {
        ArrayContainable<String> arrayContainable = new ArrayContainableImpl<>();
        String[] actual = {"a", "b", "c", "d"};

        assertThat(arrayContainable.contains(actual, "a")).isTrue();
        assertThat(arrayContainable.contains(actual, "e")).isFalse();

        assertThat(arrayContainable.doesNotContain(actual, "z")).isTrue();
        assertThat(arrayContainable.doesNotContain(actual, "a")).isFalse();

        assertThat(arrayContainable.containsAll(actual, "a", "b", "c")).isTrue();
        assertThat(arrayContainable.containsAll(actual, "z", "x", "y")).isFalse();

        // all
        assertThat(arrayContainable.containsNotAll(actual, "z", "y", "x")).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual, "z", "a", "x")).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual, "z", "a", "x")).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, "a", "b", "c")).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, "z", "y", "x")).isFalse();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, "z", "y", "x")).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual, "z", "a", "x")).isFalse();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new String[]{"a", null, "b", "c"})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new String[]{"a", null, "b", "c"})).isFalse();
    }

    @Test
    @DisplayName("Method test(Character)")
    public void test3() throws Exception {
        ArrayContainable<Character> arrayContainable = new ArrayContainableImpl<>();
        Character[] actual = {'a', 'b', 'c', 'd'};

        assertThat(arrayContainable.contains(actual, 'a')).isTrue();
        assertThat(arrayContainable.contains(actual, 'e')).isFalse();

        assertThat(arrayContainable.doesNotContain(actual, 'z')).isTrue();
        assertThat(arrayContainable.doesNotContain(actual, 'a')).isFalse();

        assertThat(arrayContainable.containsAll(actual, 'a', 'b', 'c')).isTrue();
        assertThat(arrayContainable.containsAll(actual, 'z', 'x', 'y')).isFalse();

        // all
        assertThat(arrayContainable.containsNotAll(actual, 'z', 'y', 'x')).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual, 'z', 'a', 'x')).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual, 'z', 'a', 'x')).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, 'a', 'b', 'c')).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, 'z', 'y', 'x')).isFalse();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, 'z', 'y', 'x')).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual, 'z', 'a', 'x')).isFalse();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new Character[]{'a', null, 'b', 'c'})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new Character[]{'a', null, 'b', 'c'})).isFalse();
    }

    @Test
    @DisplayName("Method test(Boolean)")
    public void test4() throws Exception {
        ArrayContainable<Boolean> arrayContainable = new ArrayContainableImpl<>();
        Boolean[] actual = {true, true};
        Boolean[] actual2 = {false, false};

        assertThat(arrayContainable.contains(actual, true)).isTrue();

        assertThat(arrayContainable.doesNotContain(actual, true)).isFalse();

        assertThat(arrayContainable.containsAll(actual, true, true, true)).isTrue();
        assertThat(arrayContainable.containsAll(actual, true, true, true)).isTrue();

        // all
        assertThat(arrayContainable.containsNotAll(actual2, true, true, true)).isTrue();
        // one
        assertThat(arrayContainable.containsNotAll(actual2, true, true, true)).isTrue();

        // one
        assertThat(arrayContainable.containsAny(actual2, true, false, true)).isTrue();
        // all
        assertThat(arrayContainable.containsAny(actual, false, true, false)).isTrue();
        // nothing
        assertThat(arrayContainable.containsAny(actual, false, true, true)).isTrue();

        // all
        assertThat(arrayContainable.doseNotContainAny(actual, false, false, false)).isTrue();
        // one
        assertThat(arrayContainable.doseNotContainAny(actual2, true, true, true)).isTrue();

        assertThat(arrayContainable.containsNull(actual)).isFalse();
        assertThat(arrayContainable.containsNull(new Boolean[]{true, null, true, true})).isTrue();

        assertThat(arrayContainable.doesNotContainNull(actual)).isTrue();
        assertThat(arrayContainable.doesNotContainNull(new Boolean[]{true, null, true, true})).isFalse();
    }

}