package com.wsy.forum;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.wsy.forum.utils.MailClient;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=ForumApplication.class)
public class MailTests {
	
	@Autowired
	private MailClient mailClient;
	
	@Autowired
	private TemplateEngine templateEngine;
	
	@Test
	public void testHtmlMail() {
		Context context = new Context();
		context.setVariable("username", "王福艺");
		String content = templateEngine.process("/mail/demo", context);
		System.out.println(content);
		mailClient.sendMail("2456455089@qq.com", "HTML Emial", content);
	}
	
	
	public void testTextMail() {
		mailClient.sendMail("2456455089@qq.com", "TEST", "www.pornhub.com");
	}
}
