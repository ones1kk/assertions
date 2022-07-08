package com.github.ones1kk.core.api.lang.object;

import com.github.ones1kk.core.api.lang.model.ObjectAssert;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class AsObject extends AbstractObjectAssert<ObjectAssert, Object> {

    private final Object actual;

    public AsObject(Class<?> self, Object actual) {
        super(self, actual);
        this.actual = actual;
    }

    public ObjectAssert as(Supplier<String> description, @Nullable Object... args) {
        return new ObjectAssert(ObjectAssert.class, actual);
    }

    public ObjectAssert as(String description, @Nullable Object... args) {
        return new ObjectAssert(ObjectAssert.class, actual);
    }

}
