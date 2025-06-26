# Travel Services Microservices Project

This project is part of the Advanced Software Engineering course, designed to demonstrate microservices architecture implementation using Spring Boot. It includes:

- API Gateway
- Eureka Discovery Server
- Spring Cloud Config Server
- Booking Service (Microservice)
- Flight Service (Microservice)

## 1. Project Structure:
   
   travel-services-microservices/
   
   ├── api-gateway
   
   ├── booking-service
   
   ├── config-server
   
   ├── discovery-server
   
   ├── flight-service
   
   Each folder represents a separate Spring Boot application.

## 2. Technologies Used:
   - Java 17
   - Spring Boot 3.1.8
   - Spring Cloud 2022.0.5
   - Spring Cloud Gateway
   - Spring Cloud Config
   - Eureka Discovery Service
   - Maven

## 3. Technologies Used:
   - Step 1: Start Config Server:
     
     cd config-server
     
     ./mvnw spring-boot:run
     
   - Step 2:Start Discovery Server (Eureka)
     
     cd discovery-server, cd discovery-server
     
     ./mvnw spring-boot:run
     
   - Step 3: Start Flight & Booking Services
     
     cd flight-service
     
     ./mvnw spring-boot:run
     
     cd booking-service, cd booking-service
     
     ./mvnw spring-boot:run
     
   - Step 4: Start API Gateway
     
     cd api-gateway
     
     ./mvnw spring-boot:run

## 4. Application Ports
   - Config Server: 8888
   - Discovery Server: 8761
   - Flight Service: 8082
   - Booking Service: 8081
   - API Gateway: 8088

## 5. Example Routes via API Gateway
   🎯 Booking Service
   
   GET http://localhost:8088/api/bookings
   
   ![image](https://github.com/user-attachments/assets/98e4e8d0-80ab-4c67-a99f-072fca58a22a)

   🎯 Flight Service
   
   GET http://localhost:8088/api/bookings/flights
   
   ![image](https://github.com/user-attachments/assets/f0d62371-9322-4734-b07a-15b6a573f474)

   GET http://localhost:8088/api/flights/f2/bookings

   ![image](https://github.com/user-attachments/assets/c7e0d3a7-15ac-42d8-8c7a-4bd2a3bedee5)


## 6. Microservice Communication
   - Booking Service fetches available flights from Flight Service. In addition, Flight Service retrieves booking details from the Booking Service to check reserved seats or user-specific reservations.

   - Communication is done via RESTful APIs.

### Notes:
   - You can test with tools like Postman or directly from the browser.
   - Make sure all ports are free before running the services.

Prepared by Asmaa AL-Astal for Advanced Software Engineering Course..







     
