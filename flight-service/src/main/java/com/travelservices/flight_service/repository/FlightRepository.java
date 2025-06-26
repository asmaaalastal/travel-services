package com.travelservices.flight_service.repository;

import com.travelservices.flight_service.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, String> {

}
