# SLF4J

---

- Type: Logging façade (API), not an implementation
- Use with: Logback, Log4j2, JUL, etc.

SLF4J provides a unified API so applications don’t depend on any particular logging backend.

# Logging Backends

---

## Logback

- Type: SLF4J’s native backend
- Default in Spring Boot
- Fast and stable
- Good configuration flexibility (logback.xml)
- Async appenders, filtering, rolling strategies

This is currently the most widely used JVM logging implementation.

## Log4j2

- Type: Logging framework + SLF4J backend
- High performance (Async Loggers with LMAX Disruptor)
- Rich configuration (XML, JSON, YAML)
- Supported widely in enterprise apps

Note: Log4j 1.x is deprecated. Log4j2 is still very active and widely used, especially in non-Spring ecosystems.

## Java Util Logging

- Built into the JDK

# Kotlin-Specific Logging Wrappers

---

## Kotlin Logging (kotlin-logging)

A thin wrapper around SLF4J:

```kotlin
val log = KotlinLogging.logger {}
```

Provides syntactic sugar + lazy logging.