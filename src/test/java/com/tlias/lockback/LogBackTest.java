package com.tlias.lockback;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LogBackTest {
    //private Logger logger = LoggerFactory.getLogger(LogBackTest.class);
     @Test
     public void testLogBack(){
          log.info("第二次日志打印");
     }
     @Test
     public void testLogLevel(){
         log.trace("trace");
         log.debug("debug");
         log.info("info");
         log.warn("warn");
         log.error("error");
     }
}
