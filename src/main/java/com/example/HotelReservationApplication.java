package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching  // Enables Redis caching
public class HotelReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelReservationApplication.class, args);
	}
}
