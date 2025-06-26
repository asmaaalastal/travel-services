package com.travelservices.flight_service.controller;

import com.travelservices.flight_service.dto.BookingDTO;
import com.travelservices.flight_service.service.BookingServiceProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights/bookings")
public class BookingController {

    private final BookingServiceProxy bookingServiceProxy;

    public BookingController(BookingServiceProxy bookingServiceProxy) {
        this.bookingServiceProxy = bookingServiceProxy;
    }

    @GetMapping
    public ResponseEntity<List<BookingDTO>> getBookings(@RequestParam String flightId) {
        return ResponseEntity.ok(bookingServiceProxy.getBookingsByFlightId(flightId));
    }
}