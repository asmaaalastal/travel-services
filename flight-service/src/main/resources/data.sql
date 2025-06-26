INSERT INTO flights (
    flight_id, from_city, to_city, departure_time, arrival_time,
    price, available_seats, airline_name, flight_code
) VALUES 
-- f1: b1, b2
('f1', 'Gaza', 'Istanbul', '2025-07-01 08:00:00', '2025-07-01 12:00:00', 350.00, 120, 'Turkish Airlines', 'TK202'),

-- f2: b3, b4
('f2', 'Cairo', 'Dubai', '2025-07-02 14:00:00', '2025-07-02 18:00:00', 420.00, 80, 'Emirates', 'EK404'),

-- f3: b5, b6
('f3', 'Amman', 'Doha', '2025-07-03 09:00:00', '2025-07-03 11:30:00', 250.00, 60, 'Qatar Airways', 'QR305'),

-- f4
('f4', 'Riyadh', 'Jeddah', '2025-07-04 06:00:00', '2025-07-04 07:30:00', 90.00, 100, 'Saudia', 'SV101'),

-- f5
('f5', 'Beirut', 'Athens', '2025-07-05 10:00:00', '2025-07-05 12:45:00', 200.00, 75, 'Aegean Airlines', 'A385'),

-- f6
('f6', 'Tunis', 'Rome', '2025-07-06 15:00:00', '2025-07-06 17:00:00', 180.00, 88, 'ITA Airways', 'AZ220');
