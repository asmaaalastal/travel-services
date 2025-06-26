package com.travelservices.flight_service.service;

import com.travelservices.flight_service.clinet.BookingClient;
import com.travelservices.flight_service.dto.BookingDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceProxy {

    private final BookingClient bookingClient;

    public BookingServiceProxy(BookingClient bookingClient) {
        this.bookingClient = bookingClient;
    }

    public List<BookingDTO> getBookingsByFlightId(String flightId) {
        return bookingClient.getBookingsByFlightId(flightId);
    }
}
