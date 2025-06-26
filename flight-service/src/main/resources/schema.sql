CREATE TABLE flights (
    flight_id VARCHAR(36) PRIMARY KEY,
    from_city VARCHAR(50),
    to_city VARCHAR(50),
    departure_time TIMESTAMP,
    arrival_time TIMESTAMP,
    price DECIMAL(10, 2),
    available_seats INT,
    airline_name VARCHAR(50),
    flight_code VARCHAR(10)
);
