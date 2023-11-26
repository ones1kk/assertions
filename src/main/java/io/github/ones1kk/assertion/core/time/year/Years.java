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
package io.github.ones1kk.assertion.core.time.year;

import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.Objects;
import io.github.ones1kk.assertion.core.message.YearErrorMessage;

import java.time.Year;

public class Years extends Objects<Year> implements YearsAssertion<Year> {

    /**
     * assert {@code actual} is leap year.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertLeapYear(AssertionsInfo info, Year actual) {
        if (!actual.isLeap()) {
            throw failures.failure(info, YearErrorMessage.shouldBeLeapYear(actual));
        }
    }

    /**
     * assert {@code actual} is not leap year.
     *
     * @param info   {@link io.github.ones1kk.assertion.core.info.ErrorMessageInfo}
     * @param actual actual
     */
    @Override
    public void assertNotLeapYear(AssertionsInfo info, Year actual) {
        if (actual.isLeap()) {
            throw failures.failure(info, YearErrorMessage.shouldNotBeLeapYear(actual));
        }
    }
}
