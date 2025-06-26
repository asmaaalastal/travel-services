package com.travelservices.flight_service.service;

import com.travelservices.flight_service.clinet.BookingClient;
import com.travelservices.flight_service.dto.BookingDTO;
import com.travelservices.flight_service.model.Flight;
import com.travelservices.flight_service.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;
    private final BookingClient bookingClient;


    public FlightServiceImpl(FlightRepository flightRepository, BookingClient bookingClient) {
        this.flightRepository = flightRepository;
        this.bookingClient = bookingClient;
    }

    @Override
    public List<BookingDTO> getBookingsForFlight(String flightId) {
        return bookingClient.getBookingsByFlightId(flightId);
    }

    @Override
    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight getFlightById(String id) {
        Optional<Flight> flight = flightRepository.findById(id);
        return flight.orElseThrow(() -> new RuntimeException("Flight not found with ID: " + id));
    }

    @Override
    public Flight updateFlight(String id, Flight updatedFlight) {
        Flight existingFlight = getFlightById(id);
        existingFlight.setFromCity(updatedFlight.getFromCity());
        existingFlight.setToCity(updatedFlight.getToCity());
        existingFlight.setDepartureTime(updatedFlight.getDepartureTime());
        existingFlight.setArrivalTime(updatedFlight.getArrivalTime());
        existingFlight.setPrice(updatedFlight.getPrice());
        existingFlight.setAvailableSeats(updatedFlight.getAvailableSeats());
        existingFlight.setAirlineName(updatedFlight.getAirlineName());
        existingFlight.setFlightCode(updatedFlight.getFlightCode());
        return flightRepository.save(existingFlight);
    }

    @Override
    public void deleteFlight(String id) {
        flightRepository.deleteById(id);
    }
}