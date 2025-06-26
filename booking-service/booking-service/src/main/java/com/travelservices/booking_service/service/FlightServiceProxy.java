package com.travelservices.booking_service.service;


import com.travelservices.booking_service.client.FlightClient;
import com.travelservices.booking_service.dto.FlightDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceProxy {

    private final FlightClient flightClient;

    public FlightServiceProxy(FlightClient flightClient) {
        this.flightClient = flightClient;
    }

    public List<FlightDTO> getAllFlights() {
        return flightClient.getAllFlights();
    }

    public FlightDTO getFlightById(String flightId) {
        return flightClient.getFlightById(flightId); 
    }
}
