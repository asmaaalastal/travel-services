package com.travelservices.booking_service.dto;

import java.time.LocalDate;


import lombok.Data;


@Data
public class BookingDTO {
    private String bookingId;
    private String userId;
    private String flightId;
    private LocalDate bookingDate;
    private String status;
    private String seatNumber;
    private String ticketNumber;
    private boolean refunded;

    // Constructors
    public BookingDTO() {}

    public BookingDTO(String bookingId, String userId, String flightId, LocalDate bookingDate,
                      String status, String seatNumber, String ticketNumber, boolean refunded) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.flightId = flightId;
        this.bookingDate = bookingDate;
        this.status = status;
        this.seatNumber = seatNumber;
        this.ticketNumber = ticketNumber;
        this.refunded = refunded;
    }


}