package com.example.controller;
import com.example.entity.Hotel;
import com.example.service.HotelService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST API
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllHotels")
    public List<Hotel> getAllHotels() {

        return hotelService.getAllHotels();
    }
    
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/addHotel")
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelService.saveHotel(hotel);
    }
}
