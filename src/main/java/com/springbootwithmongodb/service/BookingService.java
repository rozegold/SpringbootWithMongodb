package com.springbootwithmongodb.service;

import com.springbootwithmongodb.models.Booking;

import java.util.List;

public interface BookingService {
    Booking book(Booking booking);

    Booking booking(Long id);

    List<Booking> bookings();
}
