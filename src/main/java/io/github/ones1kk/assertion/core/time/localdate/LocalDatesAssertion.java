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

package io.github.ones1kk.assertion.core.time.localdate;

import io.github.ones1kk.assertion.core.info.AssertionsInfo;
import io.github.ones1kk.assertion.core.lang.object.ObjectsAssertion;

import java.time.LocalDate;

public interface LocalDatesAssertion extends ObjectsAssertion<LocalDate> {

    void assertBefore(AssertionsInfo info, LocalDate actual, LocalDate expected);

    void assertBeforeOrEqualTo(AssertionsInfo info, LocalDate actual, LocalDate expected);

    void assertAfter(AssertionsInfo info, LocalDate actual, LocalDate expected);

    void assertAfterOrEqualTo(AssertionsInfo info, LocalDate actual, LocalDate expected);

    void assertLeapYear(AssertionsInfo info, LocalDate actual);

    void assertNotLeapYear(AssertionsInfo info, LocalDate actual);
}
