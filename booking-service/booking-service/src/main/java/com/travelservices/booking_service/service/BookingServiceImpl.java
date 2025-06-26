package com.travelservices.booking_service.service;

import com.travelservices.booking_service.model.Booking;
import com.travelservices.booking_service.repository.BookingRepository;
import com.travelservices.booking_service.dto.FlightDTO;
import com.travelservices.booking_service.dto.BookingDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final FlightServiceProxy flightServiceProxy; 

    public BookingServiceImpl(BookingRepository bookingRepository, FlightServiceProxy flightServiceProxy) {
        this.bookingRepository = bookingRepository;
        this.flightServiceProxy = flightServiceProxy;
    }

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(String id) {
        Optional<Booking> booking = bookingRepository.findById(id);
        return booking.orElseThrow(() -> new RuntimeException("Booking not found with ID: " + id));
    }

    @Override
    public Booking updateBooking(String id, Booking updatedBooking) {
        return bookingRepository.findById(id).map(existingBooking -> {
            existingBooking.setUserId(updatedBooking.getUserId());
            existingBooking.setFlightId(updatedBooking.getFlightId());
            existingBooking.setBookingDate(updatedBooking.getBookingDate());
            existingBooking.setStatus(updatedBooking.getStatus());
            existingBooking.setSeatNumber(updatedBooking.getSeatNumber());
            existingBooking.setTicketNumber(updatedBooking.getTicketNumber());
            existingBooking.setRefunded(updatedBooking.getRefunded());
            return bookingRepository.save(existingBooking);
        }).orElseThrow(() -> new RuntimeException("Booking not found with id " + id));
    }

    @Override
    public void deleteBooking(String id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public List<FlightDTO> getAvailableFlights() {
        return flightServiceProxy.getAllFlights();
    }

    @Override
    public List<BookingDTO> getBookingsByFlightId(String flightId) {
    List<Booking> bookings = bookingRepository.findByFlightId(flightId);

    if (bookings.isEmpty()) {
        throw new RuntimeException("No bookings found for flight ID: " + flightId);
    }

    return bookings.stream()
        .map(booking -> new BookingDTO(
            booking.getBookingId(),
            booking.getUserId(),
            booking.getFlightId(),
            booking.getBookingDate().toLocalDate(),
            booking.getStatus().toString(),
            booking.getSeatNumber(),
            booking.getTicketNumber(),
            booking.getRefunded()
        ))
        .toList();
    }

    @Override
    public FlightDTO getFlightById(String flightId) {
        return flightServiceProxy.getFlightById(flightId);
    }


}