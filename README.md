# <center> ⚡️ Assertions </center>

### <center> Assertions for java programming. </center>

<div align="center">
    <a href="https://www.azul.com/downloads/?version=java-8-lts&package=jdk">
    <img alt="jdk11" src="https://img.shields.io/badge/jdk-8-orange?style=flat-square">
    </a>
    <a href="https://lgtm.com/projects/g/ones1kk/assertions/alerts/">
        <img alt="Total alerts" src="https://img.shields.io/lgtm/alerts/g/ones1kk/assertions.svg?logo=lgtm&logoWidth=18"/>
    </a>
    <a href="https://lgtm.com/projects/g/ones1kk/assertions/context:java">
        <img alt="Language grade: Java" src="https://img.shields.io/lgtm/grade/java/g/ones1kk/assertions.svg?logo=lgtm&logoWidth=18"/>
    </a>
</div>

[![Coverage](.github/badges/jacoco.svg)](https://github.com/ones1kk/assertions/actions/workflows/build.yml)

## Getting started

### Maven

```xml
<dependency>
    <groupId>io.github.ones1kk</groupId>
    <artifactId>assertions</artifactId>
    <version>0.0.1</version>
</dependency>
```

### Gradle

```groovy
implementation group: 'io.github', name: 'assertions', version: '0.0.1'
```

### Gradle(short)

```groovy(short)
implementation 'io.github.ones1kk:assertions:0.0.1'
```
## Overview

* Verifies assertions for JDK types.(Class, String, Array, Collection, File, URL ...)
* Provides assertions in the form of method chaining.
* Overrides error message by writing custom description.(For using 'as()' method)



## Example

```java
List<String> lists = Arrays.asList("A", "a", "B", "b", "C", "2");

List<String> expected = singletonList("a");

    Asserts.that(lists)
        // First off, it can be described as combining 2 step assertion.
        .as("The given lists should not be empty and not be null.")
        // The given 'lists' should not be empty, assertion will verify it's empty or not.
        .isNotEmpty()
        // The given 'lists' should not be null, assertion will verify it's null or not.
        .isNotNull()
        // If the verification of the above assertion is passed, define the new description for the new step. Also can put parameter into description with braces.
        .as("The given lists should contain one of '{}'.", "1, 2, or 3")
        // The given 'list' should contain any of the arguments.
        .containsAny("1", "2", "3")
        // Also, all of the arguments should be contained in given 'lists'.
        .containsAll("a", "b")
        // Write description again.
        .as("The given 'lists' shouldn't contain null.")
        // The given 'lists' shouldn't contain null.
        .doesNotContainNull()
        // The all of elements in 'lists' should all match the provided predicate.
        .allMatch(str -> str.length() > 0)
        // Write description again.
        .as("The size of given lists should be larger than 'expected'.")
        // The size of given 'lists' should be larger than the size of given 'expected'.
        .isLargerThan(expected);         
```

## Inspired

>  [AssertJ] - Fluent assertions java library 


[AssertJ]: https://assertj.github.io/doc/