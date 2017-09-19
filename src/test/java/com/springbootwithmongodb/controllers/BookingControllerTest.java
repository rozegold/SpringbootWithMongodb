package com.springbootwithmongodb.controllers;

import com.springbootwithmongodb.models.Booking;
import com.springbootwithmongodb.repository.BookRepository;
import com.springbootwithmongodb.service.BookingService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Date;

import static org.junit.Assert.*;

public class BookingControllerTest {


    private BookingController subject;

    @Mock
    private BookingService service;

    private Booking testBooking;

    @Before
    public void setUp() throws Exception {
        subject = new BookingController(service);

        testBooking = new Booking("shreya","berlin","prague",new Date());
    }


    @Test
    public void shouldCreateBookingSuccessfully(){

        System.out.println(subject.book(testBooking));
    }


}