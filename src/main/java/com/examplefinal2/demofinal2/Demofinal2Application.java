package com.examplefinal2.demofinal2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

//@RestController
public class Demofinal2Application {
//	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(Demofinal2Application.class, args);
	}
//@GetMapping("/xy")
//
//	public String xy(){
//		return "hii";
//}
}
