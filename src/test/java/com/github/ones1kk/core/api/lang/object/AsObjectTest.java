package com.github.ones1kk.core.api.lang.object;

import com.github.ones1kk.core.api.AbstractAssert;
import com.github.ones1kk.core.api.description.Describable;
import com.github.ones1kk.core.api.description.impl.DefaultTextDescription;
import com.github.ones1kk.core.api.lang.model.ObjectAssert;
import com.github.ones1kk.core.api.lang.object.impl.ObjectsImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AsObjectTest {

    Describable describable;

    @BeforeEach
    void init() {
        describable = new DefaultTextDescription();
    }

    @Test
    @DisplayName("Can use as() & Objects methods? ")
    public void test1() throws Exception {
        // given
        AbstractObjects objects = new ObjectsImpl(describable);

        // when
        AsObject asObject = new AsObject(AsObject.class, new Object(), objects);

        //then
        assertThat(asObject.as("description")).isInstanceOf(AbstractAssert.class);
        assertThat(asObject.as("description")).isInstanceOf(ObjectAssert.class);
    }

}