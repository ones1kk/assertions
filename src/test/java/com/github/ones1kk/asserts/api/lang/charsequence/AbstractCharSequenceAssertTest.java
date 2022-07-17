package com.github.ones1kk.asserts.api.lang.charsequence;

import com.github.ones1kk.asserts.api.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        assert2.isNull();
        assertThrows(AssertException.class, assert1::isNull);

        assert1.isNotNull();
        assertThrows(AssertException.class, assert2::isNotNull);

        assert1.isSameAs(actual1);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));

        assert1.isNotSameAs(assert1);
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));

        assert1.isEqualTo(actual1);
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));

        assert1.isNotEqualTo(assert1);
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
    }

    @Test
    @DisplayName("CharSequence test")
    public void test2() throws Exception {
        // given
        CharSequence actual1 = "actual";
        CharSequence actual2 = "";
        CharSequence actual3= " ";

        // when
        AbstractCharSequenceAssert<?, CharSequence> assert1 = new AbstractCharSequenceAssert<>(AbstractCharSequenceAssert.class, actual1);
        AbstractCharSequenceAssert<?, CharSequence> assert2 = new AbstractCharSequenceAssert<>(AbstractCharSequenceAssert.class, actual2);
        AbstractCharSequenceAssert<?, CharSequence> assert3 = new AbstractCharSequenceAssert<>(AbstractCharSequenceAssert.class, actual3);

        // then
        assert2.isEmpty();
        assertThrows(AssertException.class, assert1::isEmpty);

        assert1.isNotEmpty();
        assertThrows(AssertException.class, assert2::isNotEmpty);

        assert3.isBlank();
        assertThrows(AssertException.class, assert1::isBlank);

        assert1.isNotBlank();
        assertThrows(AssertException.class, assert3::isNotBlank);

        assert1.isEqualToIgnoreCase("ACTUAL");
        assertThrows(AssertException.class, () -> assert3.isEqualToIgnoreCase(actual1));
    }

}