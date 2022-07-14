package com.github.ones1kk.asserts.api.lang.object;

import com.github.ones1kk.asserts.api.AsAssert;
import com.github.ones1kk.asserts.api.AsAssertInterface;
import com.github.ones1kk.asserts.api.description.Describable;
import com.github.ones1kk.asserts.api.description.impl.Description;
import com.github.ones1kk.asserts.api.exception.AssertException;
import com.github.ones1kk.asserts.api.feature.print.impl.DefaultPrinter;
import org.apache.commons.lang3.StringUtils;

public abstract class AbstractObjects<ACTUAL> implements ObjectsInterface<Object> {

    protected final AsAssert<?> asAssert;

    protected AbstractObjects(ACTUAL actual, AsAssert<?> asAssert) {
        this.asAssert = asAssert;
    }

}
