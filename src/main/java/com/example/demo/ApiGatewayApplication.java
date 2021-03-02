package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")

public class ApiGatewayApplication {
	  private List<bookmodel> books = new ArrayList<>();

	    @PostMapping
	    public bookmodel addBook(@RequestBody bookmodel book) {
	        books.add(book);
	        return book;
	    }

	    @GetMapping
	    public List<bookmodel> getBooks() {
	        return books;
	    }

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
