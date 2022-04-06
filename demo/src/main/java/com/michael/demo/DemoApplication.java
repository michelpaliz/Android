package com.michael.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.michael.demo.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@GetMapping
	public List<Student> print() {
		return List.of(new Student(1L, "MARIAM", 21, "maria@gmail.com", LocalDate.of(2000, Month.JANUARY, 5)));
	}

}
