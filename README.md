# Eureka Discovery Service

## Eureka Discovery Service
- Run Eureka Service Discovery
- Run Microservice
- Open Eureka Serviece Discovery Dashboard via http:localhost:<PORT> and check the registered instances.

## Spring Cloud API Gateway
Single entry point to micro services.
- Run Eureaka Service Discovery
- Run API Gateway
- Run Users Microservice
- Check API Get request in Postman
http://localhost:8082/EUREKA-CLIENT-1/users/status/check

8082 - API Gateway port number

EUREKA-CLIENT-1 - Client Application name

## H2 In memory Database
- Connect to the console via API_GATEWAY_URL/h2-console
- Default jdbc url can be found from the log

## Spring security
- JWT token returned
- Spring security configured to protect certain web services when accessing via the API gateway

## Spring cloud config server
Externalizes configurations and keeps a centralized configuration.
- Secure file storage
- Secure vault
- Private Git repository

## Spring cloud bus
- Push configurations to micro-services while running

AMQP - Advanced Message Queeuing Protocol

## Spring Boot Actuator
- Health status and useful information about micro-services can be obtained