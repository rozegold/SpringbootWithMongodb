package com.springbootwithmongodb.service;

import com.springbootwithmongodb.models.Booking;

public interface BookingService {
    Booking book(Booking booking);

    Booking booking(Long id);
}
