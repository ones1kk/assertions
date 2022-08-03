package com.github.ones1kk.asserts.core.feature.iterable.containable.impl;

import com.github.ones1kk.asserts.core.feature.iterable.containable.Containable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayContainableTest {

    @Test
    @DisplayName("Method test(CharSequence)")
    public void test1() throws Exception {
        Containable<CharSequence> containable = new ArrayContainable<>();
        CharSequence[] actual = {"a", "b", "c", "d"};

        assertThat(containable.contains(actual, "a")).isTrue();
        assertThat(containable.contains(actual, "e")).isFalse();

        assertThat(containable.doesNotContain(actual, "z")).isTrue();
        assertThat(containable.doesNotContain(actual, "a")).isFalse();

        assertThat(containable.containsAll(actual, "a", "b", "c")).isTrue();
        assertThat(containable.containsAll(actual, "z", "x", "y")).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, "z", "y", "x")).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, "z", "a", "x")).isTrue();

        // one
        assertThat(containable.containsAny(actual, "z", "a", "x")).isTrue();
        // all
        assertThat(containable.containsAny(actual, "a", "b", "c")).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, "z", "y", "x")).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, "z", "y", "x")).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, "z", "a", "x")).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(new CharSequence[]{"a", null, "b", "c"})).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(new CharSequence[]{"a", null, "b", "c"})).isFalse();
    }

    @Test
    @DisplayName("Method test(String)")
    public void test2() throws Exception {
        Containable<String> containable = new ArrayContainable<>();
        String[] actual = {"a", "b", "c", "d"};

        assertThat(containable.contains(actual, "a")).isTrue();
        assertThat(containable.contains(actual, "e")).isFalse();

        assertThat(containable.doesNotContain(actual, "z")).isTrue();
        assertThat(containable.doesNotContain(actual, "a")).isFalse();

        assertThat(containable.containsAll(actual, "a", "b", "c")).isTrue();
        assertThat(containable.containsAll(actual, "z", "x", "y")).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, "z", "y", "x")).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, "z", "a", "x")).isTrue();

        // one
        assertThat(containable.containsAny(actual, "z", "a", "x")).isTrue();
        // all
        assertThat(containable.containsAny(actual, "a", "b", "c")).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, "z", "y", "x")).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, "z", "y", "x")).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, "z", "a", "x")).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(new String[]{"a", null, "b", "c"})).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(new String[]{"a", null, "b", "c"})).isFalse();
    }

    @Test
    @DisplayName("Method test(Character)")
    public void test3() throws Exception {
        Containable<Character> containable = new ArrayContainable<>();
        Character[] actual = {'a', 'b', 'c', 'd'};

        assertThat(containable.contains(actual, 'a')).isTrue();
        assertThat(containable.contains(actual, 'e')).isFalse();

        assertThat(containable.doesNotContain(actual, 'z')).isTrue();
        assertThat(containable.doesNotContain(actual, 'a')).isFalse();

        assertThat(containable.containsAll(actual, 'a', 'b', 'c')).isTrue();
        assertThat(containable.containsAll(actual, 'z', 'x', 'y')).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, 'z', 'y', 'x')).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, 'z', 'a', 'x')).isTrue();

        // one
        assertThat(containable.containsAny(actual, 'z', 'a', 'x')).isTrue();
        // all
        assertThat(containable.containsAny(actual, 'a', 'b', 'c')).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, 'z', 'y', 'x')).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, 'z', 'y', 'x')).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, 'z', 'a', 'x')).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(new Character[]{'a', null, 'b', 'c'})).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(new Character[]{'a', null, 'b', 'c'})).isFalse();
    }

}