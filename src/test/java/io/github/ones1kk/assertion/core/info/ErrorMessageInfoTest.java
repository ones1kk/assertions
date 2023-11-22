package io.github.ones1kk.assertion.core.info;

import io.github.ones1kk.assertion.core.description.Description;
import io.github.ones1kk.assertion.core.description.formatter.Formattable;
import io.github.ones1kk.assertion.core.description.formatter.TextFormatter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ErrorMessageInfoTest {

    @Nested
    @DisplayName("error message")
    class Test01 {

        @Test
        @DisplayName("override error message")
        void testOverrideErrorMessage() {
            // given
            String greeting = "hello i am {}";
            Object[] args = {"ones1kk"};

            // and
            ErrorMessageInfo errorMessageInfo = new ErrorMessageInfo();

            // and
            Description description = new Description(greeting, args);

            // when
            errorMessageInfo.overrideErrorMessage(description);

            // and
            Description errorMessage = errorMessageInfo.getErrorMessage();

            // then
            assertThat(errorMessage).isNotNull();
        }

        @Test
        @DisplayName("has override error message")
        void testHasOverrideErrorMessage() {
            // given
            String greeting = "hello i am {}";
            Object[] args = {"ones1kk"};

            // and
            ErrorMessageInfo errorMessageInfo = new ErrorMessageInfo();

            // and
            Description description = new Description(greeting, args);
            errorMessageInfo.overrideErrorMessage(description);

            // when
            boolean result = errorMessageInfo.hasOverrideErrorMessage();

            // then
            assertThat(result).isTrue();
        }
    }

    @Nested
    @DisplayName("configuration")
    class Test02 {

        @Test
        @DisplayName("configure")
        void testConfigure() {
            // given
            Formattable formatter = new TextFormatter();

            // and
            ErrorMessageInfo errorMessageInfo = new ErrorMessageInfo();

            // when
            errorMessageInfo.configure(formatter);

            // and
            Formattable configuration = errorMessageInfo.getConfiguration();

            // then
            assertThat(configuration).isNotNull()
                    .isEqualTo(formatter);
        }

        @Test
        @DisplayName("has configuration")
        void testHasConfigure() {
            // given
            Formattable formatter = new TextFormatter();

            // and
            ErrorMessageInfo errorMessageInfo = new ErrorMessageInfo();

            // when
            errorMessageInfo.configure(formatter);

            // and
            boolean result = errorMessageInfo.hasConfiguration();

            // then
            assertThat(result).isTrue();
        }
    }

}