package com.wsy.forum;


import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=ForumApplication.class)
public class LoggerTests {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggerTests.class);
	
	
	public void testLogger() {
		System.out.println(logger.getName());
		logger.debug("Debug Log");
		logger.info("Info Log");
		logger.warn("Warn Log");
		logger.error("Error Log");
	}
	
	

}
