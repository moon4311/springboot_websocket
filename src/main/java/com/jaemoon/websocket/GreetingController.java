package com.jaemoon.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {


	@MessageMapping("/hello") //받아서
	@SendTo("/topic/greetings")	//보낸다
	public Greeting greeting(HelloMessage message) throws Exception {
		Thread.sleep(500); // simulated delay
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getMsg()) + "!");
	}
	
	@MessageMapping("/hello/{id}") //받아서
	@SendTo("/topic/greetings/{id}")	//보낸다
	public Greeting greeting2(HelloMessage message) throws Exception {
		Thread.sleep(500); // simulated delay
		return new Greeting("BYE, " + HtmlUtils.htmlEscape(message.getMsg()) + "!");
	}
}
