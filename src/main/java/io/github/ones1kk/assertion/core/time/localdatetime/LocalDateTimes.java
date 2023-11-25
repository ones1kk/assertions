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

package io.github.ones1kk.assertion.core.time.localdatetime;

import io.github.ones1kk.assertion.core.feature.compare.temporal.ComparableTemporal;
import io.github.ones1kk.assertion.core.feature.compare.temporal.LocalDateTimeComparable;
import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.TemporalErrorMessage;

import java.time.LocalDateTime;

/**
 * <strong> The LocalDateTimes class inherits {@link Objects} </strong>
 */
public final class LocalDateTimes extends Objects<LocalDateTime> implements LocalDateTimesAssertions {

    private final ComparableTemporal<LocalDateTime> comparable = new LocalDateTimeComparable<>();

    /**
     * assert {@code actual} is before than {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertBefore(AssertionsInfo info, LocalDateTime actual, LocalDateTime expected) {
        if (comparable.isAfterOrEqualTo(actual, expected)) {
            throw failures.failure(info, TemporalErrorMessage.shouldBeBefore(actual, expected));
        }
    }

    /**
     * assert {@code actual} is before than or equal to {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertBeforeOrEqualTo(AssertionsInfo info, LocalDateTime actual, LocalDateTime expected) {
        if (comparable.isAfter(actual, expected)) {
            throw failures.failure(info, TemporalErrorMessage.shouldBeBeforeOrEqualTo(actual, expected));
        }
    }

    /**
     * assert {@code actual} is after than {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertIsAfter(AssertionsInfo info, LocalDateTime actual, LocalDateTime expected) {
        if (comparable.isBeforeOrEqualTo(actual, expected)) {
            throw failures.failure(info, TemporalErrorMessage.shouldBeAfter(actual, expected));
        }
    }

    /**
     * assert {@code actual} is after than or equal to {@code expected}.
     *
     * @param info     {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual   actual
     * @param expected expected
     */
    @Override
    public void assertIsAfterOrEqualTo(AssertionsInfo info, LocalDateTime actual, LocalDateTime expected) {
        if (comparable.isBefore(actual, expected)) {
            throw failures.failure(info, TemporalErrorMessage.shouldBeAfterOrEqualTo(actual, expected));
        }
    }
}
