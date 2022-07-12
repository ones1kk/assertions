package com.github.ones1kk.asserts.api.lang.object;

import com.github.ones1kk.asserts.api.description.Describable;
import com.github.ones1kk.asserts.api.description.impl.Description;
import com.github.ones1kk.asserts.api.lang.model.ObjectAssert;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ObjectAssertWrapper extends AbstractObjectAssert<ObjectAssert, Object> {

    private final Describable describable = new Description();

    public ObjectAssertWrapper(Class<?> self, Object actual, String asDescription) {
        super(self, actual, asDescription);
    }

    public ObjectAssert as(Supplier<String> description, @Nullable Object... args) {
        String asDescription = describable.as(description, args);
        return new ObjectAssert(actual, asDescription);
    }

    public ObjectAssert as(String description, @Nullable Object... args) {
        String asDescription = describable.as(description, args);
        return new ObjectAssert(actual, asDescription);
    }
}
