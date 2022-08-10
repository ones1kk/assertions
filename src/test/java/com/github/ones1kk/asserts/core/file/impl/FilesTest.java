package com.github.ones1kk.asserts.core.file.impl;

import com.github.ones1kk.asserts.core.AsAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertThrows;

class FilesTest {

    @Mock
    AsAssert<?> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    private static final String CAN_READ_PATH = "file/can_read.txt";
    private static final String CAN_WRITE_PATH = "file/can_write.txt";
    private static final String CAN_EXECUTE_PATH = "file/can_execute.txt";
    private static final String HIDDEN_FILE_PATH = "~/.gitignore";

    @Test
    @DisplayName("Method test")
    public void test1() throws Exception {
        // given
        Files files = new Files(asAssert);

        // when
        ClassLoader loader = FilesTest.class.getClassLoader();
        File actual1 = new File(Objects.requireNonNull(loader.getResource(CAN_READ_PATH)).getFile());
        File actual2 = new File(Objects.requireNonNull(loader.getResource(CAN_WRITE_PATH)).getFile());
        File actual3 = new File(Objects.requireNonNull(loader.getResource(CAN_EXECUTE_PATH)).getFile());

        // then
        assertThrows(Exception.class, () -> files.assertExists(new File("")));
        assertThrows(Exception.class, () -> files.assertIsFile(new File("/user")));
        assertThrows(Exception.class, () -> files.assertIsNotFile(actual1));
        assertThrows(Exception.class, () -> files.assertIsDirectory(actual1));
        assertThrows(Exception.class, () -> files.assertIsHidden(actual1));
        assertThrows(Exception.class, () -> files.assertIsNotHidden(new File(HIDDEN_FILE_PATH)));
        assertThrows(Exception.class, () -> files.assertCanWrite(actual1));
        assertThrows(Exception.class, () -> files.assertCanNotWrite(actual2));
        assertThrows(Exception.class, () -> files.assertCanExecute(actual2));
        assertThrows(Exception.class, () -> files.assertCanNotExecute(actual3));
        assertThrows(Exception.class, () -> files.assertHasExtension(actual1, "pdf"));
        assertThrows(Exception.class, () -> files.assertDoesNotHaveExtension(actual1, "txt"));

        files.assertExists(actual1);
        files.assertIsFile(actual1);
        files.assertIsNotFile(new File(HIDDEN_FILE_PATH));
        files.assertIsDirectory(new File("."));
        files.assertIsNotDirectory(actual1);
        files.assertIsHidden(new File(HIDDEN_FILE_PATH));
        files.assertIsNotHidden(actual1);
        files.assertCanRead(actual1);
        files.assertCanWrite(actual2);
        files.assertCanExecute(actual3);
        files.assertHasExtension(actual1, "txt");
        files.assertDoesNotHaveExtension(actual1, "pdf");
    }

}