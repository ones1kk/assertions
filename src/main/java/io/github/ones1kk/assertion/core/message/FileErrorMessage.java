

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

package io.github.ones1kk.assertion.core.message;

import io.github.ones1kk.assertion.core.description.Description;

import java.io.File;

public final class FileErrorMessage {

    private FileErrorMessage() {
    }

    public static String shouldBeExist(File actual) {
        return new Description("The '{}' should be exist.", actual).toString();
    }

    public static String shouldBeFile(File actual) {
        return new Description("The '{}' should be file.", actual).toString();
    }

    public static String shouldNotBeFile(File actual) {
        return new Description("The given '{}' should not be file.", actual).toString();
    }

    public static String shouldBeDirectory(File actual) {
        return new Description("The given '{}' should be directory.", actual).toString();
    }

    public static String shouldNotBeDirectory(File actual) {
        return new Description("The given '{}' should not be directory.", actual).toString();
    }

    public static String shouldBeHidden(File actual) {
        return new Description("The given '{}' should be hidden.", actual).toString();
    }

    public static String shouldNotBeHidden(File actual) {
        return new Description("The given '{}' should not be hidden.", actual).toString();
    }

    public static String shouldBeReadable(File actual) {
        return new Description("The given '{}' should be readable.", actual).toString();
    }

    public static String shouldNotBeReadable(File actual) {
        return new Description("The given '{}' should be readable.", actual).toString();
    }

    public static String shouldBeWritable(File actual) {
        return new Description("The given '{}' should be writable.", actual).toString();
    }

    public static String shouldNotBeWritable(File actual) {
        return new Description("The given '{}' should be writable.", actual).toString();
    }

    public static String shouldBeExecutable(File actual) {
        return new Description("The given '{}' should be executable.", actual).toString();
    }

    public static String shouldNotBeExecutable(File actual) {
        return new Description("The given '{}' should be executable.", actual).toString();
    }

    public static String shouldHaveExtension(File actual, String extension) {
        return new Description("The given '{}' should have extension as '{}'.", actual, extension).toString();
    }

    public static String shouldDoNotHaveExtension(File actual, String extension) {
        return new Description("The given '{}' should do not have extension as {}.", actual, extension).toString();
    }
}
