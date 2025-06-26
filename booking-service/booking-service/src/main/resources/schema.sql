CREATE TABLE bookings (
    booking_id VARCHAR(36) PRIMARY KEY,
    user_id VARCHAR(36),
    flight_id VARCHAR(36),
    booking_date TIMESTAMP,
    status VARCHAR(20),
    seat_number VARCHAR(10),
    ticket_number VARCHAR(20),
    refunded BOOLEAN
);
