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

package com.github.ones1kk.asserts.core.description;

import java.util.function.Supplier;

/**
 * <strong> The Describable is made for that users can conveniently use it when using the as method.</strong>
 *
 * <p> The Describable class is made for {@link com.github.ones1kk.asserts.core.AsAssert} class</p>
 *
 * <p> This class handle description and arguments for transforming the way the user uses it to the way it behaves internally.</p>
 */
public interface Describable {

    String as(Supplier<String> description, Object... args);

    String as(String description, Object... args);

}
