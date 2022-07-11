package com.github.ones1kk.core.api.lang.object;

import com.github.ones1kk.core.api.description.Describable;
import com.github.ones1kk.core.api.description.impl.DefaultTextDescription;
import com.github.ones1kk.core.exception.AssertException;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public abstract class AbstractObjects implements Objects<Object> {

    protected String asDescription;

    protected String defaultDescription;

    protected final Describable describable;

    protected AbstractObjects() {
        describable = new DefaultTextDescription();
    }

    protected AssertException getException() {
        if (isEmptyAsDescription()) {
            return new AssertException(defaultDescription);
        }
        return new AssertException(asDescription);
    }

    @Override
    public String describedAs(Supplier<String> description, @Nullable Object... args) {
        return describable.describedAs(description.get(), args);
    }

    @Override
    public String describedAs(String description, @Nullable Object... args) {
        return describable.describedAs(description, args);
    }

    protected boolean isEmptyAsDescription() {
        return StringUtils.isEmpty(asDescription);
    }
}
