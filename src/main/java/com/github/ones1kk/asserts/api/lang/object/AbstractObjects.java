package com.github.ones1kk.asserts.api.lang.object;

import com.github.ones1kk.asserts.api.exception.AssertException;
import com.github.ones1kk.asserts.api.feature.print.impl.DefaultPrinter;
import org.apache.commons.lang3.StringUtils;

public abstract class AbstractObjects implements ObjectsInterface<Object> {

    protected final String asDescription;

    protected String description;

    protected final DefaultPrinter describable = new DefaultPrinter();

    protected AbstractObjects(String asDescription) {
        this.asDescription = asDescription;
    }

    protected AssertException getException() {
        if (isEmptyAsDescription()) {
            return new AssertException(description);
        }
        return new AssertException(asDescription);
    }

    protected boolean isEmptyAsDescription() {
        return StringUtils.isEmpty(asDescription);
    }

}
