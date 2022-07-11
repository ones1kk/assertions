package com.github.ones1kk.core.api.lang.object;

import com.github.ones1kk.core.api.description.Describable;
import com.github.ones1kk.core.api.description.impl.DefaultTextDescription;
import com.github.ones1kk.core.api.lang.model.ObjectAssert;
import com.github.ones1kk.core.api.lang.object.impl.ObjectsImpl;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class AsObject extends AbstractObjectAssert<ObjectAssert, Object> {

    private final Object actual;

    public AsObject(Class<?> self, Object actual, AbstractObjects objects) {
        super(self, actual, objects);
        this.actual = actual;
    }

    public ObjectAssert as(Supplier<String> description, @Nullable Object... args) {
        objects.asDescription = objects.describedAs(description, args);
        return new ObjectAssert(ObjectAssert.class, actual, objects);
    }

    public ObjectAssert as(String description, @Nullable Object... args) {
        objects.asDescription = objects.describedAs(description, args);
        return new ObjectAssert(ObjectAssert.class, actual, objects);
    }

}
