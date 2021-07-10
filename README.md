# spring-logging-test
SLF4J with Log4j2

ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL < OFF

If root logger level  is info then last four will come.

log.trace("Trace Message!"); <br />
log.debug("Debug Message!"); <br />
log.info("Info Message!"); <br />
log.warn("Warn Message!"); <br />
log.error("Error Message!"); <br />
log.fatal("Fatal Message!"); <br />
	  
	  
Info Message! <br />
Warn Message! <br />
Error Message! <br />
Fatal Message! <br />
```sh
<PatternLayout pattern="[%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n" />
```
[INFO ] 2021-07-10 17:06:19.398 [http-nio-8080-exec-2] SpringLoggingTestApplication - Info Message! <br />
[WARN ] 2021-07-10 17:06:19.399 [http-nio-8080-exec-2] SpringLoggingTestApplication - Warn Message! <br />
[ERROR] 2021-07-10 17:06:19.399 [http-nio-8080-exec-2] SpringLoggingTestApplication - Error Message! <br />

```sh
<PatternLayout pattern="[%thread][%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] []%c{1.}.%M %L] - %msg%n" />
```

[http-nio-8080-exec-1][INFO ] 2021-07-10 17:10:48.874 [http-nio-8080-exec-1] []t.a.j.SpringLoggingTestApplication.getGreeting 21] - Info Message! <br />
[http-nio-8080-exec-1][WARN ] 2021-07-10 17:10:48.874 [http-nio-8080-exec-1] []t.a.j.SpringLoggingTestApplication.getGreeting 22] - Warn Message! <br />
[http-nio-8080-exec-1][ERROR] 2021-07-10 17:10:48.874 [http-nio-8080-exec-1] []t.a.j.SpringLoggingTestApplication.getGreeting 23] - Error Message! <br />
