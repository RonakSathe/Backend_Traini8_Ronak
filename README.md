# Training Center Registry

This project is a simple Spring Boot application that provides APIs to manage government-funded training centers. It includes endpoints to create new training centers and retrieve a list of all training centers.

## Setup Instructions

### Prerequisites

- Java 17 or later
- Maven
- PostgreSQL

### Project Structure

training-center-registry
│ ├── src
│ │ ├── main
│ │ │ ├── java
│ │ │ │ ├── com.traini8.tcr
│ │ │ │ │ ├── controller
│ │ │ │ │ ├── entity
│ │ │ │ │ ├── repository
│ │ │ │ │ ├── service
│ │ │ ├── resources
│ │ │ │ ├── application.yml
│ │ ├── test
│ ├── pom.xml
│ ├── README.md


### Step-by-Step Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/RonakSathe/Backend_Traini8_Ronak/edit/master

   Configure PostgreSQL

2.**Configure PostgreSQL**

Ensure PostgreSQL is installed and running.
Create a new database:
  CREATE DATABASE tcr;

3.**Application.yml**
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/tcr
    username: yourusername
    password: yourpassword
    driver-class-name: org.postgresql.Driver
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
  h2:
    console:
      enabled: false

logging:
  level:
    root: INFO
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE

TO Test your API:
 json data below:

Ensure that your PostgreSQL database is running before starting the Spring Boot application.
Use a tool like Postman to test the APIs
 
{
  "centerName": "Training Center 1",
  "centerCode": "123456789012",
  "address": {
    "detailedAddress": "123 Main St",
    "city": "City",
    "state": "State",
    "pincode": "123456"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Course 1", "Course 2"],
  "contactEmail": "contact@center1.com",
  "contactPhone": "+1234567890"
}


