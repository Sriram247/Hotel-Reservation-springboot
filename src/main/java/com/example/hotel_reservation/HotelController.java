package com.example.hotel_reservation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST API
public class HotelController {
    
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello, " + "World" + "!";
    }

}
