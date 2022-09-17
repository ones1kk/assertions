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

package com.github.ones1kk.asserts.core.message;

import com.github.ones1kk.asserts.core.description.Describable;
import com.github.ones1kk.asserts.core.description.impl.Description;

import java.io.File;

public final class FileErrorMessages {

    private static final Describable DESCRIBABLE = new Description();

    private FileErrorMessages() {
    }

    public static String shouldBeExist(File actual) {
        return DESCRIBABLE.as("The {} should be exist.", actual);
    }

    public static String shouldBeFile(File actual) {
        return DESCRIBABLE.as("The {} should be file.", actual);
    }

    public static String shouldNotBeFile(File actual) {
        return DESCRIBABLE.as("The given {} should not be file.", actual);
    }

    public static String shouldBeDirectory(File actual) {
        return DESCRIBABLE.as("The given {} should be directory.", actual);
    }

    public static String shouldNotBeDirectory(File actual) {
        return DESCRIBABLE.as("The given {} should not be directory.", actual);
    }

    public static String shouldBeHidden(File actual) {
        return DESCRIBABLE.as("The given {} should be hidden.", actual);
    }

    public static String shouldNotBeHidden(File actual) {
        return DESCRIBABLE.as("The given {} should not be hidden.", actual);
    }

    public static String shouldBeReadable(File actual) {
        return DESCRIBABLE.as("The given {} should be readable.", actual);
    }

    public static String shouldNotBeReadable(File actual) {
        return DESCRIBABLE.as("The given {} should be readable.", actual);
    }

    public static String shouldBeWritable(File actual) {
        return DESCRIBABLE.as("The given {} should be writable.", actual);
    }

    public static String shouldNotBeWritable(File actual) {
        return DESCRIBABLE.as("The given {} should be writable.", actual);
    }

    public static String shouldBeExecutable(File actual) {
        return DESCRIBABLE.as("The given {} should be executable.", actual);
    }

    public static String shouldNotBeExecutable(File actual) {
        return DESCRIBABLE.as("The given {} should be executable.", actual);
    }

    public static String shouldHaveExtension(File actual) {
        return DESCRIBABLE.as("The given {} should have extension.", actual);
    }

    public static String shouldDoNotHaveExtension(File actual) {
        return DESCRIBABLE.as("The given {} should do not have extension.", actual);
    }
}
