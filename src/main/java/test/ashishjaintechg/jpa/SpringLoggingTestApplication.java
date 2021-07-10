package test.ashishjaintechg.jpa;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController

@Slf4j
public class SpringLoggingTestApplication {

	
    @GetMapping(value="/")
	public String getGreeting() {
    	for(int i=0;i<2000;i++) {
        log.trace(i+"Trace Message!");
        log.debug(i+"Debug Message!");
        if(i%2==0) {
    	MDC.put("testId", ""+i); }
    	else
    		MDC.put("testId", "a");

        log.info(i+"Info Message!");
        log.warn(i+"Warn Message!");
        log.error(i+"Error Message!");
    	}
    	return "hello";
	}
    
	public static void main(String[] args) {
		SpringApplication.run(SpringLoggingTestApplication.class, args);
	}

}
