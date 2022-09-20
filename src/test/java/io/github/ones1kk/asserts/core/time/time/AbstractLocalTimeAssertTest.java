package io.github.ones1kk.asserts.core.time.time;

import io.github.ones1kk.asserts.core.exception.AssertException;
import io.github.ones1kk.asserts.core.time.model.LocalTimeAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractLocalTimeAssertTest {

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        LocalTime actual1 = LocalTime.of(11, 11, 11);
        LocalTime actual2 = LocalTime.of(13, 11, 11);

        // when
        AbstractLocalTimeAssert<?, LocalTime> assert1 = new LocalTimeAssert(actual1);
        AbstractLocalTimeAssert<?, LocalTime> assert2 = new LocalTimeAssert(actual2);

        // then
        assertThrows(AssertException.class, assert1::isMidnight);
        assertThrows(AssertException.class, assert1::isNoon);
        assertThrows(AssertException.class, assert1::isAfternoon);
        assertThrows(AssertException.class, assert2::isBeforeNoon);
        assertThrows(AssertException.class, assert2::isBeforeOrEqualToNoon);


        assertThatNoException().isThrownBy(() -> {
            assert1.isBeforeNoon();
            assert1.isBeforeOrEqualToNoon();
            assert2.isAfterOrEqualToNoon();
            assert2.isAfternoon();
        });
    }
}