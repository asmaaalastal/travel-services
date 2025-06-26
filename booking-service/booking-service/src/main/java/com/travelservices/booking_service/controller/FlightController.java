package com.travelservices.booking_service.controller;

import com.travelservices.booking_service.dto.FlightDTO;
import com.travelservices.booking_service.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings/flights")
public class FlightController {

    private final BookingService bookingService;

    public FlightController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<FlightDTO> getAllFlights() {
        return bookingService.getAvailableFlights();
    }

    @GetMapping("/{id}")
    public FlightDTO getFlightById(@PathVariable String id) {
        return bookingService.getFlightById(id);
    }
}