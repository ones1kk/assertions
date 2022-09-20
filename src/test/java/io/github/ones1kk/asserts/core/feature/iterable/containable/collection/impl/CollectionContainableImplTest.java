package io.github.ones1kk.asserts.core.feature.iterable.containable.collection.impl;

import io.github.ones1kk.asserts.core.feature.iterable.containable.collection.CollectionContainable;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CollectionContainableImplTest {

    @Test
    @DisplayName("method test(String)")
    public void test1() throws Exception {
        // given
        CollectionContainable<String> containable = new CollectionContainableImpl<>();
        // when
        List<String> actual = Arrays.asList("a", "b", "c", "d");

        // then
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
        assertThat(containable.containsNull(Arrays.asList("a", null, "b", "c"))).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(Arrays.asList("a", null, "b", "c"))).isFalse();
    }

    @AllArgsConstructor
    static class User {
        private String name;
        private Integer age;
    }

    @Test
    @DisplayName("method test(Object)")
    public void test2() throws Exception {
        // given
        CollectionContainable<User> containable = new CollectionContainableImpl<>();

        // when
        User userA = new User("userA", 10);
        User userB = new User("userB", 20);
        User userC = new User("userC", 30);
        User userD = new User("userD", 40);

        List<User> actual = Arrays.asList(userA, userB);

        // then
        assertThat(containable.contains(actual, userA)).isTrue();
        assertThat(containable.contains(actual, userC)).isFalse();

        assertThat(containable.doesNotContain(actual, userC)).isTrue();
        assertThat(containable.doesNotContain(actual, userA)).isFalse();

        assertThat(containable.containsAll(actual, userA, userB)).isTrue();
        assertThat(containable.containsAll(actual, userA, userC)).isFalse();

        // all
        assertThat(containable.containsNotAll(actual, userC, userD)).isTrue();
        // one
        assertThat(containable.containsNotAll(actual, userA, userC, userD)).isTrue();

        // one
        assertThat(containable.containsAny(actual, userC, userA, userD)).isTrue();
        // all
        assertThat(containable.containsAny(actual, userA, userB)).isTrue();
        // nothing
        assertThat(containable.containsAny(actual, userC, userD)).isFalse();

        // all
        assertThat(containable.doseNotContainAny(actual, userC, userD)).isTrue();
        // one
        assertThat(containable.doseNotContainAny(actual, userA, userC, userD)).isFalse();

        assertThat(containable.containsNull(actual)).isFalse();
        assertThat(containable.containsNull(Arrays.asList(userA, null, userB))).isTrue();

        assertThat(containable.doesNotContainNull(actual)).isTrue();
        assertThat(containable.doesNotContainNull(Arrays.asList(userA, null, userB))).isFalse();
    }

}