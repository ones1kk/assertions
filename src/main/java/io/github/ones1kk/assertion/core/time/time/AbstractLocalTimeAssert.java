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

package io.github.ones1kk.assertion.core.time.time;

import io.github.ones1kk.assertion.core.time.temporal.AbstractTemporalAccessorAssert;

import java.time.LocalTime;

/**
 * <strong> The AbstractLocalTimeAssert class inherits {@link AbstractTemporalAccessorAssert}</strong>
 * <br>
 * <p> This is that implements the assertion method of the LocalTime type and verify assertion.</p>
 */
public class AbstractLocalTimeAssert extends AbstractTemporalAccessorAssert<AbstractLocalTimeAssert, LocalTime> implements LocalTimeAssertion<AbstractLocalTimeAssert> {

    public AbstractLocalTimeAssert(Class<?> self, LocalTime actual) {
        super(self, actual);
    }

    /**
     * Verify {@code actual} is midnight
     *
     * @return {@code self}
     */
    @Override
    public AbstractLocalTimeAssert isMidnight() {
        super.isEqualTo(LocalTime.MIDNIGHT);
        return self;
    }

    /**
     * Verify {@code actual} is noon
     *
     * @return {@code self}
     */
    @Override
    public AbstractLocalTimeAssert isNoon() {
        super.isEqualTo(LocalTime.NOON);
        return self;
    }

    /**
     * Verify {@code actual} is before noon
     *
     * @return {@code self}
     */
    @Override
    public AbstractLocalTimeAssert isBeforeNoon() {
        super.isBefore(LocalTime.NOON);
        return self;
    }

    /**
     * Verify {@code actual} is before or equal to noon
     *
     * @return {@code self}
     */
    @Override
    public AbstractLocalTimeAssert isBeforeOrEqualToNoon() {
        super.isBeforeOrEqualTo(LocalTime.NOON);
        return self;
    }

    /**
     * Verify {@code actual} is after noon
     *
     * @return {@code self}
     */
    @Override
    public AbstractLocalTimeAssert isAfternoon() {
        super.isAfter(LocalTime.NOON);
        return self;
    }

    /**
     * Verify {@code actual} is after or equal to noon
     *
     * @return {@code self}
     */
    @Override
    public AbstractLocalTimeAssert isAfterOrEqualToNoon() {
        super.isAfterOrEqualTo(LocalTime.NOON);
        return self;
    }
}
