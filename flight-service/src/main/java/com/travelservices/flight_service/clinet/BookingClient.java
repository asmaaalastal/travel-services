package com.travelservices.flight_service.clinet;

import com.travelservices.flight_service.dto.BookingDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "BOOKING-SERVICE")
public interface BookingClient {

    @GetMapping("/api/bookings/by-flight")
    List<BookingDTO> getBookingsByFlightId(@RequestParam String flightId);
}