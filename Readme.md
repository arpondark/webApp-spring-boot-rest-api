# Spring Boot REST API Example

This project is a simple Spring Boot REST API for managing products. It demonstrates basic CRUD operations using Spring Boot, Spring Data JPA, and an in-memory H2 database.

## Features

- RESTful endpoints for product management (Create, Read, Update, Delete)
- Layered architecture: Controller, Service, Repository
- Uses Spring Data JPA for database operations
- In-memory H2 database for easy setup

## Project Structure

```
src/
  main/
    java/
      com.arpon.webApp/
        controller/      # REST controllers
        models/          # Entity classes
        repository/      # JPA repositories
        services/        # Service layer
    resources/
      application.properties
  test/
    java/
      com.arpon.webApp/
        WebAppApplicationTests.java
pom.xml                  # Maven configuration
```

## Getting Started

### Prerequisites

- Java 17 or later
- Maven

### Build & Run

1. Clone the repository:
   ```
   git clone <repo-url>
   cd webApp-spring-boot-rest-api
   ```

2. Build the project:
   ```
   ./mvnw clean install
   ```

3. Run the application:
   ```
   ./mvnw spring-boot:run
   ```

The API will be available at `http://localhost:3000/`.

## API Endpoints

- `GET /products` - List all products
- `GET /products/{prodId}` - Get product by ID
- `POST /products` - Add a new product (JSON body)
- `PUT /products` - Update a product (JSON body)
- `DELETE /products/{id}` - Delete a product

## Example Product JSON

```
{
  "prodId": 1,
  "prodName": "Sample Product",
  "price": 100
}
```

## Database

- Uses H2 in-memory database (see `src/main/resources/application.properties`)
- Default credentials: username `arpon`, password `1234`

## License

This project is licensed under the MIT License.
