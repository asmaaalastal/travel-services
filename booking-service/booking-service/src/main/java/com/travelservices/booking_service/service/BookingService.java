package com.travelservices.booking_service.service;

import com.travelservices.booking_service.model.Booking;
import com.travelservices.booking_service.dto.BookingDTO;
import com.travelservices.booking_service.dto.FlightDTO;
import java.util.List;

public interface BookingService {
    Booking createBooking(Booking booking);
    List<Booking> getAllBookings();
    Booking getBookingById(String id);
    void deleteBooking(String id);
    Booking updateBooking(String id, Booking booking);
    List<FlightDTO> getAvailableFlights();
    FlightDTO getFlightById(String flightId);
    List<BookingDTO> getBookingsByFlightId(String flightId);
}
