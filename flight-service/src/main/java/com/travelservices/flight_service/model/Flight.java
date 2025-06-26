package com.travelservices.flight_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @Column(name = "flight_id", length = 36)
    private String flightId;

    @Column(name = "from_city", length = 50, nullable = false)
    private String fromCity;

    @Column(name = "to_city", length = 50, nullable = false)
    private String toCity;

    @Column(name = "departure_time", nullable = false)
    private LocalDateTime departureTime;

    @Column(name = "arrival_time", nullable = false)
    private LocalDateTime arrivalTime;

    @Column(name = "price", precision = 10, scale = 2, nullable = false)
    private BigDecimal price;

    @Column(name = "available_seats", nullable = false)
    private Integer availableSeats;

    @Column(name = "airline_name", length = 50, nullable = false)
    private String airlineName;

    @Column(name = "flight_code", length = 10, nullable = false)
    private String flightCode;
}
