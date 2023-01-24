package io.github.ones1kk.assertion.core.lang.charsequence.impl;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.lang.charsequence.CharSequencesInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CharSequencesTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        CharSequencesInterface<CharSequence> charSequences = new CharSequences(asAssert);

        // when
        CharSequence actual1 = "actual";
        CharSequence actual2 = " ";

        // then
        assertThrows(Exception.class, () -> charSequences.assertIsBlank(actual1));
        assertThrows(Exception.class, () -> charSequences.assertIsNotBlank(actual2));
        assertThrows(Exception.class, () -> charSequences.assertHasText(""));
        assertThrows(Exception.class, () -> charSequences.assertHasNotText(actual1));
        assertThrows(Exception.class, () -> charSequences.assertIsEqualToIgnoreCase(actual1, "Expected"));

        assertThatNoException().isThrownBy(() -> {
            charSequences.assertIsBlank(actual2);
            charSequences.assertIsNotBlank(actual1);
            charSequences.assertHasText(actual1);
            charSequences.assertHasNotText("");
            charSequences.assertIsEqualToIgnoreCase(actual1, "ACTUAL");
            charSequences.assertIsEqualToIgnoreCase(actual1, "actual");
        });
    }
}