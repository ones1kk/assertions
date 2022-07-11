package com.github.ones1kk.core.api;

import com.github.ones1kk.core.api.description.Describable;
import com.github.ones1kk.core.api.description.impl.DefaultTextDescription;
import com.github.ones1kk.core.api.lang.object.AsObject;
import com.github.ones1kk.core.api.lang.object.impl.ObjectsImpl;

public class AssertsForType {

    private static final Describable describable = new DefaultTextDescription();

    public static AsObject that(Object actual) {
        return new AsObject(AsObject.class, actual, new ObjectsImpl(describable));
    }

}
