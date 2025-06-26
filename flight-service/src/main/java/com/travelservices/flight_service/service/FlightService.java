package com.travelservices.flight_service.service;

import com.travelservices.flight_service.dto.BookingDTO;
import com.travelservices.flight_service.model.Flight;
import java.util.List;

public interface FlightService {
    Flight createFlight(Flight flight);
    List<Flight> getAllFlights();
    Flight getFlightById(String id);
    Flight updateFlight(String id, Flight flight);
    void deleteFlight(String id);
    List<BookingDTO> getBookingsForFlight(String flightId);

}
