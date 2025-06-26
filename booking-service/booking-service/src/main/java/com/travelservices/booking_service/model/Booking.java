package com.travelservices.booking_service.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "bookings")
@Data 
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {
    @Id
    @Column(name = "booking_id", nullable = false, length = 36)
    @Builder.Default
    private String bookingId = UUID.randomUUID().toString();

    @Column(name = "user_id", nullable = false, length = 36)
    private String userId;

    @Column(name = "flight_id", nullable = false, length = 36)
    private String flightId;

    @Column(name = "booking_date")
    private LocalDateTime bookingDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private BookingStatus status;

    @Column(name = "seat_number", length = 10)
    private String seatNumber;

    @Column(name = "ticket_number", length = 20)
    private String ticketNumber;

    @Column(name = "refunded")
    private Boolean refunded;
}
