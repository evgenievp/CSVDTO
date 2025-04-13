Spring Boot DTO Demo – Player Management API

This is a Spring Boot REST API that demonstrates how to use DTOs (Data Transfer Objects) to separate internal domain models from external API representations.

- Java Spring Boot REST API
- Player entity with relation to Team (ManyToOne)
- DTO pattern using `PlayerDTO`
- Custom Mapper to convert between Entity and DTO
- Endpoints that receive and return DTOs only
- PostgreSQL database connection
- CRUD operations with DTOs

 Used

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL (with Docker)
- Maven
- Postman (for testing)

Functionality

- `GET /api/players` – returns all players as DTOs
- `POST /api/players` – accepts a PlayerDTO and saves a new player

Example JSON
{
  "name": "Iniesta",
  "position": "Midfielder",
  "teamId": 1
}

If you want to test this app, please bear in mind that you have to set your own parameters in application.properties
