# spring-logging-test
SLF4J with Log4j2

ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL < OFF

If root logger level  is info then last four will come.

log.trace("Trace Message!");
log.debug("Debug Message!");
log.info("Info Message!");
log.warn("Warn Message!");
log.error("Error Message!");
log.fatal("Fatal Message!");
	  
	  
Info Message!
Warn Message!
Error Message!
Fatal Message!

<PatternLayout pattern="[%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n" />

[INFO ] 2021-07-10 17:06:19.398 [http-nio-8080-exec-2] SpringLoggingTestApplication - Info Message!
[WARN ] 2021-07-10 17:06:19.399 [http-nio-8080-exec-2] SpringLoggingTestApplication - Warn Message!
[ERROR] 2021-07-10 17:06:19.399 [http-nio-8080-exec-2] SpringLoggingTestApplication - Error Message!

<PatternLayout pattern="[%thread][%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] []%c{1.}.%M %L] - %msg%n" />

[http-nio-8080-exec-1][INFO ] 2021-07-10 17:10:48.874 [http-nio-8080-exec-1] []t.a.j.SpringLoggingTestApplication.getGreeting 21] - Info Message!
[http-nio-8080-exec-1][WARN ] 2021-07-10 17:10:48.874 [http-nio-8080-exec-1] []t.a.j.SpringLoggingTestApplication.getGreeting 22] - Warn Message!
[http-nio-8080-exec-1][ERROR] 2021-07-10 17:10:48.874 [http-nio-8080-exec-1] []t.a.j.SpringLoggingTestApplication.getGreeting 23] - Error Message!
