package io.github.ones1kk.asserts.core.file;

import io.github.ones1kk.asserts.core.exception.AssertException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractFileAssertTest {

    private static final String CAN_READ_PATH = "file/can_read.txt";
    private static final String CAN_WRITE_PATH = "file/can_write.txt";
    private static final String CAN_EXECUTE_PATH = "file/can_execute.txt";
    private static final String HIDDEN_FILE_PATH = "~/.gitignore";

    @Test
    @DisplayName("Object method test")
    public void test1() throws Exception {
        // given
        File actual1 = new File(HIDDEN_FILE_PATH);

        // when
        AbstractFileAssert<?> assert1 = new AbstractFileAssert<>(AbstractFileAssert.class, actual1);
        AbstractFileAssert<?> assert2 = new AbstractFileAssert<>(AbstractFileAssert.class, null);

        // then
        assertThrows(AssertException.class, assert1::isNull);
        assertThrows(AssertException.class, assert2::isNotNull);
        assertThrows(AssertException.class, () -> assert1.isSameAs(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotSameAs(actual1));
        assertThrows(AssertException.class, () -> assert1.isEqualTo(assert1));
        assertThrows(AssertException.class, () -> assert1.isNotEqualTo(actual1));
        assertThrows(AssertException.class, () -> assert1.isAssignableFrom(AbstractFileAssert.class));
        assertThrows(AssertException.class, () -> assert1.isNotAssignableFrom(File.class));

        assert2.isNull();
        assert1.isNotNull();
        assert1.isSameAs(actual1);
        assert1.isNotSameAs(assert1);
        assert1.isEqualTo(actual1);
        assert1.isNotEqualTo(assert1);
        assert1.isAssignableFrom(File.class);
        assert1.isNotAssignableFrom(AbstractFileAssert.class);
    }

    @Test
    @DisplayName("Method test")
    public void test2() throws Exception {
        // given
        ClassLoader loader = AbstractFileAssertTest.class.getClassLoader();
        File actual1 = new File(Objects.requireNonNull(loader.getResource(CAN_READ_PATH)).getFile());
        File actual2 = new File(Objects.requireNonNull(loader.getResource(CAN_WRITE_PATH)).getFile());
        File actual3 = new File(Objects.requireNonNull(loader.getResource(CAN_EXECUTE_PATH)).getFile());
        File actual4 = new File(".");
        File actual5 = new File(HIDDEN_FILE_PATH);
        File actual6 = new File("");

        // when
        AbstractFileAssert<?> assert1 = new AbstractFileAssert<>(AbstractFileAssert.class, actual1);
        AbstractFileAssert<?> assert2 = new AbstractFileAssert<>(AbstractFileAssert.class, actual2);
        AbstractFileAssert<?> assert3 = new AbstractFileAssert<>(AbstractFileAssert.class, actual3);
        AbstractFileAssert<?> assert4 = new AbstractFileAssert<>(AbstractFileAssert.class, actual4);
        AbstractFileAssert<?> assert5 = new AbstractFileAssert<>(AbstractFileAssert.class, actual5);
        AbstractFileAssert<?> assert6 = new AbstractFileAssert<>(AbstractFileAssert.class, actual6);

        // then
        assertThrows(AssertException.class, assert6::exists);
        assertThrows(AssertException.class, assert4::isFile);
        assertThrows(AssertException.class, assert1::isNotFile);
        assertThrows(AssertException.class, assert1::isDirectory);
        assertThrows(AssertException.class, assert4::isNotDirectory);
        assertThrows(AssertException.class, () -> assert1.hasExtension("pdf"));
        assertThrows(AssertException.class, () -> assert1.doesNotHaveExtension("txt"));

        assertThatNoException().isThrownBy(() -> {
            assert1.exists();
            assert1.isFile();
            assert4.isDirectory();
            assert2.isNotDirectory();
            assert1.hasExtension("txt");
            assert2.doesNotHaveExtension("jpg");
        });
    }

}