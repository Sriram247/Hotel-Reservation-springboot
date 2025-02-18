package com.example.service;

import com.example.entity.Hotel;
import com.example.repository.HotelRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Cacheable(value = "hotels")
    public List<Hotel> getAllHotels() {
        System.out.println("Fetching from database...");
        return hotelRepository.findAll();
    }

    @CacheEvict(value = "hotels", allEntries = true)
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
