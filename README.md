junreachable
===

[![Maven Central](https://img.shields.io/maven-central/v/com.io7m.junreachable/com.io7m.junreachable.svg?style=flat-square)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.io7m.junreachable%22)
[![Maven Central (snapshot)](https://img.shields.io/nexus/s/com.io7m.junreachable/com.io7m.junreachable?server=https%3A%2F%2Fs01.oss.sonatype.org&style=flat-square)](https://s01.oss.sonatype.org/content/repositories/snapshots/com/io7m/junreachable/)
[![Codecov](https://img.shields.io/codecov/c/github/io7m-com/junreachable.svg?style=flat-square)](https://codecov.io/gh/io7m-com/junreachable)

![com.io7m.junreachable](./src/site/resources/junreachable.jpg?raw=true)

| JVM | Platform | Status |
|-----|----------|--------|
| OpenJDK (Temurin) Current | Linux | [![Build (OpenJDK (Temurin) Current, Linux)](https://img.shields.io/github/actions/workflow/status/io7m-com/junreachable/main.linux.temurin.current.yml)](https://www.github.com/io7m-com/junreachable/actions?query=workflow%3Amain.linux.temurin.current)|
| OpenJDK (Temurin) LTS | Linux | [![Build (OpenJDK (Temurin) LTS, Linux)](https://img.shields.io/github/actions/workflow/status/io7m-com/junreachable/main.linux.temurin.lts.yml)](https://www.github.com/io7m-com/junreachable/actions?query=workflow%3Amain.linux.temurin.lts)|
| OpenJDK (Temurin) Current | Windows | [![Build (OpenJDK (Temurin) Current, Windows)](https://img.shields.io/github/actions/workflow/status/io7m-com/junreachable/main.windows.temurin.current.yml)](https://www.github.com/io7m-com/junreachable/actions?query=workflow%3Amain.windows.temurin.current)|
| OpenJDK (Temurin) LTS | Windows | [![Build (OpenJDK (Temurin) LTS, Windows)](https://img.shields.io/github/actions/workflow/status/io7m-com/junreachable/main.windows.temurin.lts.yml)](https://www.github.com/io7m-com/junreachable/actions?query=workflow%3Amain.windows.temurin.lts)|

## junreachable

The `junreachable` package implements a set of exception types for
unambiguously marking code that is supposed to be unreachable (but that the
compiler cannot prove is unreachable).

## Status

As the Java platform evolves, libraries that may have been necessary in the
past can become unnecessary due to new platform features. The `junreachable`
package falls into this category: There are now far fewer instances in the
Java language where the compiler cannot determine that a given section of
code is unreachable. In particular, switch expressions and sealed types
eliminate many of the situations where unreachable code had to be explicitly
marked.

This package is in maintenance mode and will not see any new functionality.

## Features

* Exceptions for marking unreachable code.
* High coverage test suite.
* [OSGi-ready](https://www.osgi.org/)
* [JPMS-ready](https://en.wikipedia.org/wiki/Java_Platform_Module_System)
* ISC license.

## Usage

Throw the `UnreachableCodeException` exception at lines of code that are
expected to be unreachable, but that the compiler cannot prove are really
unreachable. If this exception ends up being thrown, it will unambiguously
signal that the code wasn't as unreachable as the developer thought; this
is clearly a bug.

Throw the `UnimplementedCodeException` exception at lines of code that have
yet to contain real implementations. If this exception ends up being thrown,
it is immediately clear to users and developers alike what happened: The user
tried to use some part of the code that hasn't yet been properly implemented.

