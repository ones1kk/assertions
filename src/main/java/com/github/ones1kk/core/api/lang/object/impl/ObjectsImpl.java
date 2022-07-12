package com.github.ones1kk.core.api.lang.object.impl;

import com.github.ones1kk.core.api.description.Describable;
import com.github.ones1kk.core.api.description.impl.DefaultTextDescription;
import com.github.ones1kk.core.api.lang.object.Objects;
import com.github.ones1kk.core.exception.AssertException;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public abstract class ObjectsImpl implements Objects<Object> {

    public String asDescription;

    protected String defaultDescription;

    public final Describable describable;

    public ObjectsImpl(Describable describable) {
        this.describable = describable;
    }

    protected AssertException getException() {
        if (isEmptyAsDescription()) {
            return new AssertException(defaultDescription);
        }
        return new AssertException(asDescription);
    }

    @Override
    public String described(Supplier<String> description, @Nullable Object... args) {
        return describable.described(description.get(), args);
    }

    @Override
    public String described(String description, @Nullable Object... args) {
        return describable.described(description, args);
    }

    @Override
    public void assertIsNull(Object actual) {
        if (actual != null) {
            defaultDescription = describable.describedFormat(actual, null,
                    String.format("%s is not null", actual));
            throw getException();
        }
    }

    @Override
    public void assertIsNotNull(Object actual) {
        if (actual == null) {
            defaultDescription = describable.describedFormat(actual, null,
                    String.format("%s is null", actual));
            throw getException();
        }
    }

    @Override
    public void assertIsSameAs(Object actual, Object expected) {
        if(actual != expected) {
            defaultDescription = describable.describedFormat(actual, null,
                    String.format("%s is not same as %s", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsNotSameAs(Object actual, Object expected) {
        if(actual == expected) {
            defaultDescription = describable.describedFormat(actual, null,
                    String.format("%s is same as %s", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsEqualTo(Object actual, Object expected) {
        if(!actual.equals(expected)) {
            defaultDescription = describable.describedFormat(actual, null,
                    String.format("%s is not equal to %s", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsNotEqualTo(Object actual, Object expected) {
        if(actual.equals(expected)) {
            defaultDescription = describable.describedFormat(actual, null,
                    String.format("%s is equal to %s", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsAssignableFrom(Object actual, Class<?> expected) {
        if(!actual.getClass().isAssignableFrom(expected)) {
            defaultDescription = describable.describedFormat(actual, null,
                    String.format("%s is not assignable from %s", actual, expected));
            throw getException();
        }
    }

    @Override
    public void assertIsNotAssignableFrom(Object actual, Class<?> expected) {
        if(actual.getClass().isAssignableFrom(expected)) {
            defaultDescription = describable.describedFormat(actual, null,
                    String.format("%s is assignable from %s", actual, expected));
            throw getException();
        }
    }

    protected boolean isEmptyAsDescription() {
        return StringUtils.isEmpty(asDescription);
    }
}
