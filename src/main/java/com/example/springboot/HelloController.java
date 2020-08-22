package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	private List<MyObj> objects = new ArrayList<>();
	@RequestMapping("/")
	public String index() {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i=0;i<=10;i++) {
			service.execute(new Runnable() {
				
				@Override
				public void run() {
					//System.out.println("thread!!");
					for(int x=0;x<=1000;x++) {
						String message = "ababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierfababorjoiejfoierf";
						objects.add(new MyObj(message));
					}

				}
			});
		}
		return "Greetings from Spring Boot!";
	}

}
