INSERT INTO bookings (booking_id, user_id, flight_id, booking_date, status, seat_number, ticket_number, refunded)
VALUES 
  ('b1', 'u1', 'f1', CURRENT_TIMESTAMP, 'CONFIRMED', 'A1', 'TCKT001', false),
  ('b2', 'u2', 'f1', CURRENT_TIMESTAMP, 'CANCELED', 'B2', 'TCKT002', true),
  ('b3', 'u3', 'f2', CURRENT_TIMESTAMP, 'CONFIRMED', 'C3', 'TCKT003', false),
  ('b4', 'u4', 'f2', CURRENT_TIMESTAMP, 'CANCELED', 'D4', 'TCKT004', true),
  ('b5', 'u5', 'f3', CURRENT_TIMESTAMP, 'CONFIRMED', 'E5', 'TCKT005', false),
  ('b6', 'u6', 'f3', CURRENT_TIMESTAMP, 'CONFIRMED', 'F6', 'TCKT006', true);