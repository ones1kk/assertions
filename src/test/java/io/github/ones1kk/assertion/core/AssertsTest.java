package io.github.ones1kk.assertion.core;

import io.github.ones1kk.assertion.core.array.AbstractArrayAssert;
import io.github.ones1kk.assertion.core.array.number.AbstractNumberArrayAssert;
import io.github.ones1kk.assertion.core.clazz.AbstractClassAssert;
import io.github.ones1kk.assertion.core.collection.AbstractCollectionAssert;
import io.github.ones1kk.assertion.core.collection.list.AbstractListAssert;
import io.github.ones1kk.assertion.core.collection.map.AbstractMapAssert;
import io.github.ones1kk.assertion.core.file.AbstractFileAssert;
import io.github.ones1kk.assertion.core.lang.bolean.AbstractBooleanAssert;
import io.github.ones1kk.assertion.core.lang.character.AbstractCharacterAssert;
import io.github.ones1kk.assertion.core.lang.charsequence.AbstractCharSequenceAssert;
import io.github.ones1kk.assertion.core.lang.number.bte.AbstractByteAssert;
import io.github.ones1kk.assertion.core.lang.number.duble.AbstractDoubleAssert;
import io.github.ones1kk.assertion.core.lang.number.flot.AbstractFloatAssert;
import io.github.ones1kk.assertion.core.lang.number.integer.AbstractIntegerAssert;
import io.github.ones1kk.assertion.core.lang.number.lng.AbstractLongAssert;
import io.github.ones1kk.assertion.core.lang.number.shrt.AbstractShortAssert;
import io.github.ones1kk.assertion.core.lang.object.AbstractObjectAssert;
import io.github.ones1kk.assertion.core.lang.string.AbstractStringAssert;
import io.github.ones1kk.assertion.core.net.AbstractUrlAssert;
import io.github.ones1kk.assertion.core.time.localdate.AbstractLocalDateAssert;
import io.github.ones1kk.assertion.core.time.localdatetime.AbstractLocalDateTimeAssert;
import io.github.ones1kk.assertion.core.time.month.AbstractMonthAssert;
import io.github.ones1kk.assertion.core.time.monthday.AbstractMonthDayAssert;
import io.github.ones1kk.assertion.core.time.time.AbstractLocalTimeAssert;
import io.github.ones1kk.assertion.core.time.year.AbstractYearAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URL;
import java.time.*;
import java.time.temporal.TemporalAccessor;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class AssertsTest {

    @Test
    @DisplayName("All of Assertion should inherit AbstractObjectAssert")
    @SuppressWarnings("unchecked")
    public void test1() throws Exception {
        // given
        AbstractObjectAssert<?, Object> actual1 = Asserts.that(new Object());
        AbstractCharSequenceAssert<?, CharSequence> actual2 = Asserts.that((CharSequence) "actual2");
        AbstractStringAssert<?> actual3 = Asserts.that("actual3");
        AbstractCharacterAssert<?, Character> actual4 = Asserts.that('a');
        AbstractIntegerAssert<?, Integer> actual5 = Asserts.that(1);
        AbstractLongAssert<?, Long> actual6 = Asserts.that(1L);
        AbstractDoubleAssert<?, Double> actual7 = Asserts.that(1.1);
        AbstractFloatAssert<?, Float> actual8 = Asserts.that(4F);
        AbstractShortAssert<?, Short> actual9 = Asserts.that((short) 1);
        AbstractByteAssert<?, Byte> actual10 = Asserts.that((byte) 1);
        AbstractBooleanAssert<?, Boolean> actual11 = Asserts.that(false);

        AbstractClassAssert<?> actual12 = Asserts.that(Object.class);

        AbstractArrayAssert<?, String> actual13 = Asserts.that(new String[1]);
        AbstractNumberArrayAssert<?, Number[]> actual14 = Asserts.that(new Number[2]);

        AbstractFileAssert<?> actual15 = Asserts.that(mock(File.class));
        AbstractUrlAssert<?> actual16 = Asserts.that(new URL("https://www.github.com/ones1kk"));

        AbstractCollectionAssert<?, Collection<?>> actual17 = Asserts.that(mock(Collection.class));
        AbstractListAssert<?, List<?>> actual18 = Asserts.that(mock(List.class));
        AbstractMapAssert<?, Map<Object, Object>, Object, Object> actual19 = Asserts.that(mock(Map.class));
        AbstractClassAssert<?> actual20 = Asserts.that(Set.class);

        AbstractObjectAssert<?, Object> actual21 = Asserts.that(mock(TemporalAccessor.class));
        AbstractLocalDateAssert<?, LocalDate> actual22 = Asserts.that(LocalDate.of(1995, 2, 1));
        AbstractLocalDateTimeAssert<?, LocalDateTime> actual23 = Asserts.that(LocalDateTime.of(1995, 2, 1, 1, 1, 1));
        AbstractMonthAssert<?, Month> actual24 = Asserts.that(Month.of(2));
        AbstractMonthDayAssert<?, MonthDay> actual25 = Asserts.that(MonthDay.of(2, 1));
        AbstractLocalTimeAssert<?, LocalTime> actual26 = Asserts.that(LocalTime.of(1, 1));
        AbstractYearAssert<?, Year> actual27 = Asserts.that(Year.of(1995));

        //then
        assertThat(actual1).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual2).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual3).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual4).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual5).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual6).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual7).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual8).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual9).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual10).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual11).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual12).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual13).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual14).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual15).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual16).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual17).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual18).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual19).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual20).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual21).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual22).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual23).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual24).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual25).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual26).isInstanceOf(AbstractObjectAssert.class);
        assertThat(actual27).isInstanceOf(AbstractObjectAssert.class);
    }

}