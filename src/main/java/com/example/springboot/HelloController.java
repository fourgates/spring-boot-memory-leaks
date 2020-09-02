package com.example.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private List<MyObj> objects = new ArrayList<>();
	
	@RequestMapping("/threads")
	public String threads() {
		ExecutorService service = Executors.newFixedThreadPool(10, new CustomizableThreadFactory("findme-"));
		for(int i=0;i<=10;i++) {
			service.execute(new Runnable() {
				
				@Override
				public void run() {}
			});
		}
		return "Greetings from Spring Boot!";
	}
	@RequestMapping("/objects")
	public String objects() {
		for(int x=0;x<=1000;x++) {
			String message = "ababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierf";
			objects.add(new MyObj(message));
		}
		return "Greetings from Spring Boot!";
	}
}
