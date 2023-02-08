<div align="center"> 
    <h1>⚡️ Assertions</h1> 
</div>

<div align="center">
 <h3>Assertions for java programming.</h3>
</div>

![build](https://github.com/ones1kk/assertions/actions/workflows/coverage.yml/badge.svg)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/f78d2672bc9e4c9cb77eadfa4bd4f59f)](https://www.codacy.com/gh/ones1kk/assertions/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ones1kk/assertions&amp;utm_campaign=Badge_Grade)
[![codecov](https://codecov.io/gh/ones1kk/assertions/branch/main/graph/badge.svg?token=IL6PDN0HUS)](https://codecov.io/gh/ones1kk/assertions)

## Getting started

### Maven

```xml
<dependency>
    <groupId>io.github.ones1kk</groupId>
    <artifactId>assertions</artifactId>
    <version>0.0.5</version>
</dependency>
```

### Gradle

```groovy
implementation group: 'io.github', name: 'assertions', version: '0.0.5'
```

### Gradle(short)

```groovy(short)
implementation 'io.github.ones1kk:assertions:0.0.5'
```
## Overview

* Verifies assertions for JDK types.(Class, Lang type of Java, Collection, Array(1D), File, URL ...)
* Provides assertions in the form of method chaining.
* Overrides error message by writing custom description.(For using 'as()' method)



## Example

```java
List<String> list = Arrays.asList("A", "a", "B", "b", "C", "2");

List<String> expected = singletonList("a");

Asserts.that(list)
    // First off, it can be described as combining 2 step assertion.
    .as("The given 'list' should not be empty and not be null.")
    // The given 'list' should not be empty, assertion will verify it's empty or not.
    .isNotEmpty()
    // The given 'list' should not be null, assertion will verify it's null or not.
    .isNotNull()
    // If the verification of the above assertion is passed,
    // User can define new description for new step.
    // Also can put parameters into description with braces.
    .as("The given 'list' should contain one of '{}'.", "1, 2, or 3")
    // The given 'list' should contain any of the arguments.
    .containsAny("1", "2", "3")
    // Also, all of the arguments should be contained in given 'list'.
    .containsAll("a", "b")
    // Write description again.
    .as("The given 'list' shouldn't contain null.")
    // The given 'list' shouldn't contain null.
    .doesNotContainNull()
    // The all of elements in 'list' should match all the provided predicate.
    .allMatch(str -> str.length() > 0)
    // Write description again.
    .as("The size of given 'list' should be larger than 'expected'.")
    // The size of given 'list' should be larger than the size of given the size of 'expected'.
    .isLargerThan(expected);         
```

## Inspired

>  [AssertJ] - Fluent assertions java library 


[AssertJ]: https://assertj.github.io/doc/