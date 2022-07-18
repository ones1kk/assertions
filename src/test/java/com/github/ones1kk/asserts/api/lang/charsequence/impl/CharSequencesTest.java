package com.github.ones1kk.asserts.api.lang.charsequence.impl;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.lang.charsequence.CharSequencesInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CharSequencesTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Test methods")
    public void test1() throws Exception {
        // given
        CharSequencesInterface<CharSequence> charSequences = new CharSequences(asAssert);

        // when
        CharSequence actual1 = "actual";
        CharSequence actual2 = " ";

        // then
        assertThrows(Exception.class, () -> charSequences.assertIsBlank(actual1));
        assertThrows(Exception.class, () -> charSequences.assertIsNotBlank(actual2));
        assertThrows(Exception.class, () -> charSequences.assertIsEmpty(actual1));
        assertThrows(Exception.class, () -> charSequences.assertIsNotEmpty(""));
        assertThrows(Exception.class, () -> charSequences.assertIsEqualToIgnoreCase(actual1, "Expected"));

        charSequences.assertIsBlank(actual2);
        charSequences.assertIsNotBlank(actual1);
        charSequences.assertIsEmpty("");
        charSequences.assertIsNotEmpty(actual1);
        charSequences.assertIsEqualToIgnoreCase(actual1, "ACTUAL");
        charSequences.assertIsEqualToIgnoreCase(actual1, "actual");
    }

}