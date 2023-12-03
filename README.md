# ⚡️ Assertions

## Assertions for java programming.

![build](https://github.com/ones1kk/assertions/actions/workflows/build.yml/badge.svg)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/f78d2672bc9e4c9cb77eadfa4bd4f59f)](https://www.codacy.com/gh/ones1kk/assertions/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ones1kk/assertions&amp;utm_campaign=Badge_Grade)
[![codecov](https://codecov.io/gh/ones1kk/assertions/branch/master/graph/badge.svg?token=IL6PDN0HUS)](https://codecov.io/gh/ones1kk/assertions)

## Getting started

### Maven

```xml
<dependency>
    <groupId>io.github.ones1kk</groupId>
    <artifactId>assertions</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

```groovy
implementation group: 'io.github', name: 'assertions', version: '1.0.0'
```

### Gradle(short)

```groovy(short)
implementation 'io.github.ones1kk:assertions:1.0.0'
```
## Overview

* Verifies assertions for JDK types.
* Provides assertions in the form of method chaining.
* Overrides error message by writing custom description.
* Customizes error message format.

## Example

```java
import io.github.ones1kk.assertion.core.description.formatter.Formattable;

List<String> actual = List.of("1", "2", "3", "4");

List<String> expected = List.of("1");

class CustomFormat implements Formattable {
    ...override methods
}

Asserts.that(actual)
    // customize error message format by using configure method.
    .configure(new CustomFormat)
    // write custom error message by using as method .
    .as("The given 'actual' should not be empty and be null.")
    .isNotEmptyOrNull()
    // write custom error message about next assertion.
    .as("The given 'actual' should contain one of '{}, {}'.", "1", "2", "a")
    .containsAny("1", "2", "a")
    .as("The given 'actual' should not contain null.")
    .doesNotContainNull()
    // if above assertions are paased, then if below assertions are failed, default error message will be printed.
    // check the given 'actual' size.
    .hasSize(4)
    // The size of given 'actual' should be larger than the size of given 'expected'.
    .isLargerThan(expecred);

```

## Inspired by

>  [AssertJ] - Fluent assertions java library 


[AssertJ]: https://assertj.github.io/doc/