package com.springbootwithmongodb.controllers;

import com.springbootwithmongodb.models.Booking;
import com.springbootwithmongodb.repository.BookRepository;
import com.springbootwithmongodb.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private BookingService service;

    public BookingController(BookingService service) {
        this.service = service;
    }


    @RequestMapping(path = "/booking", method = RequestMethod.POST)
    public @ResponseBody Booking book(Booking booking) {

        if(null == booking)
            throw new IllegalArgumentException("Booking data is null");

        return service.book(booking);

    }


    @RequestMapping(path = "/booking", method = RequestMethod.GET)
    public @ResponseBody Booking read(@PathVariable Long id) {

        if (null == id){
            throw new IllegalArgumentException("Booking ID is null");
        }

        return service.booking(id);
    }



}
