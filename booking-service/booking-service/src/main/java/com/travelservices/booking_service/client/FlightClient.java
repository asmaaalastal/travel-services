package com.travelservices.booking_service.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.travelservices.booking_service.dto.FlightDTO;
import java.util.List;

@FeignClient(name = "flight-service")
public interface FlightClient {

    @GetMapping("/api/flights")
    List<FlightDTO> getAllFlights();

    @GetMapping("/api/flights/{id}")
    FlightDTO getFlightById(@PathVariable("id") String id);
}
