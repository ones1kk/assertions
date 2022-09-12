/*
 * Copyright (c) 2022. Wonsik Kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.ones1kk.asserts.core.time.time;

import com.github.ones1kk.asserts.core.lang.object.AbstractObjectAssert;
import com.github.ones1kk.asserts.core.time.temporal.accessor.AbstractTemporalAccessorAssert;

import java.time.LocalTime;

/**
 * <strong> The AbstractLocalTimeAssert class inherits {@link AbstractObjectAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the LocalTime type and verify assertion.</p>
 *
 * @param <SELF>
 */
public class AbstractLocalTimeAssert<SELF extends AbstractLocalTimeAssert<SELF, ACTUAL>, ACTUAL> extends AbstractTemporalAccessorAssert<SELF, LocalTime> implements LocalTimeAssertInterface<SELF> {

    public AbstractLocalTimeAssert(Class<?> self, LocalTime actual) {
        super(self, actual);
    }

    /**
     * Verify {@code actual} is midnight or not.
     *
     * @return {@code self}
     */
    @Override
    public SELF isMidnight() {
        super.isEqualTo(LocalTime.MIDNIGHT);
        return self;
    }

    /**
     * Verify {@code actual} is noon or not.
     *
     * @return {@code self}
     */
    @Override
    public SELF isNoon() {
        super.isEqualTo(LocalTime.NOON);
        return self;
    }

    /**
     * Verify {@code actual} is before noon or not.
     *
     * @return {@code self}
     */
    @Override
    public SELF isBeforeNoon() {
        super.isBefore(LocalTime.NOON);
        return self;
    }

    /**
     * Verify {@code actual} is before or equal to noon or not.
     *
     * @return {@code self}
     */
    @Override
    public SELF isBeforeOrEqualToNoon() {
        super.isBeforeOrEqualTo(LocalTime.NOON);
        return self;
    }

    /**
     * Verify {@code actual} is after noon or not.
     *
     * @return {@code self}
     */
    @Override
    public SELF isAfternoon() {
        super.isAfter(LocalTime.NOON);
        return self;
    }

    /**
     * Verify {@code actual} is after or equal to noon or not.
     *
     * @return {@code self}
     */
    @Override
    public SELF isAfterOrEqualToNoon() {
        super.isAfterOrEqualTo(LocalTime.NOON);
        return self;
    }
}
