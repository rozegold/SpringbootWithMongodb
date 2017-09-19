package com.springbootwithmongodb.service;

import com.springbootwithmongodb.models.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {
    Booking book(Booking booking);

    Booking booking(Long id);

    List<Booking> bookings();
}
