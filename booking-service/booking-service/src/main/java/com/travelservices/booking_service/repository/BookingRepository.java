package com.travelservices.booking_service.repository;

import com.travelservices.booking_service.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface BookingRepository extends JpaRepository<Booking, String> {
     List<Booking> findByFlightId(String flightId);


}
