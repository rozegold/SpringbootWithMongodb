package com.springbootwithmongodb.service;

import com.springbootwithmongodb.models.Booking;
import com.springbootwithmongodb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookingServiceImpl implements BookingService {


    private BookRepository repository;

    @Autowired
    public BookingServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Booking book(Booking booking){

        return repository.save(booking);
    }

    @Override
    public Booking booking(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Booking> bookings() {
        return repository.findAll();
    }
}
