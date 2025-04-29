package com.cg.webpagesform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class WebpagesformApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebpagesformApplication.class, args);
	}

}
