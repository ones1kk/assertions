package io.github.ones1kk.assertion.core.lang.charsequence;

import io.github.ones1kk.assertion.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractCharSequenceAssertTest {

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        CharSequence actual1 = "actual";
        CharSequence actual2 = null;

        // when
        AbstractCharSequenceAssert<?, CharSequence> assert1 = new AbstractCharSequenceAssert<>(AbstractCharSequenceAssert.class, actual1);
        AbstractCharSequenceAssert<?, CharSequence> assert2 = new AbstractCharSequenceAssert<>(AbstractCharSequenceAssert.class, actual2);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractCharSequenceAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(String.class));

        assertThatNoException().isThrownBy(() -> {
            assert2.isNull();
            assert1.isNotNull();
            assert1.isSameAs(actual1);
            assert1.isNotSameAs(assert1);
            assert1.isEqualTo(actual1);
            assert1.isNotEqualTo(assert1);
            assert1.isAssignableFrom(String.class);
            assert1.isNotAssignableFrom(AbstractCharSequenceAssert.class);
        });
    }

    @Test
    @DisplayName("CharSequences test")
    public void test2() throws Exception {
        // given
        CharSequence actual1 = "actual";
        CharSequence actual2 = "";
        CharSequence actual3 = " ";

        // when
        AbstractCharSequenceAssert<?, CharSequence> assert1 = new AbstractCharSequenceAssert<>(AbstractCharSequenceAssert.class, actual1);
        AbstractCharSequenceAssert<?, CharSequence> assert2 = new AbstractCharSequenceAssert<>(AbstractCharSequenceAssert.class, actual2);
        AbstractCharSequenceAssert<?, CharSequence> assert3 = new AbstractCharSequenceAssert<>(AbstractCharSequenceAssert.class, actual3);

        // then
        assertThrows(AssertException.class, assert1::isEmpty);
        assertThrows(AssertException.class, assert2::isNotEmpty);
        assertThrows(AssertException.class, assert1::isBlank);
        assertThrows(AssertException.class, assert3::isNotBlank);
        assertThrows(AssertException.class, () -> assert3.isEqualToIgnoreCase(actual1));

        assertThatNoException().isThrownBy(() -> {
            assert2.isEmpty();
            assert1.isNotEmpty();
            assert3.isBlank();
            assert1.isNotBlank();
            assert1.isEqualToIgnoreCase("ACTUAL");
        });
    }
}