package io.github.ones1kk.assertion.core.lang.object;

import io.github.ones1kk.assertion.core.AsAssert;
import io.github.ones1kk.assertion.core.lang.object.impl.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;

class AbstractObjectsTest {

    @Mock
    AsAssert<Object> asAssert;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Create Object test")
    public void test1() throws Exception {
        assertThat(new Objects<>(asAssert)).isInstanceOf(ObjectsInterface.class);
        assertThat(new Objects<>(asAssert)).isInstanceOf(AbstractObjects.class);
        assertThat(new Objects<>(asAssert)).isInstanceOf(Objects.class);
    }


}