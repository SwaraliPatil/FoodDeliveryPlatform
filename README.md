# Food Delivery Platform API

Welcome to food delivery platform :)

## Frameworks and Language Used
This project is developed using the following frameworks and language:

### Java: The primary programming language for backend development.
### Spring Boot: A powerful and popular framework for building Java-based web applications.
### Spring Data JPA: Part of the Spring framework, used for simplifying database access with JPA (Java Persistence API).
### MySQL: The chosen database system for storing application data.

## Data Flow
### Model Classes:
 These classes represent the data entities used in the application, such as User, FoodItem, and Order.

### Service Classes: 
These classes handle business logic and interact with the database to perform operations like user registration, adding food items, and placing orders.

### Controller Classes: 
These classes handle incoming HTTP requests, invoke the corresponding service methods, and return HTTP responses.

### Data Initialization: 
The data.sql file contains SQL statements to pre-populate initial data into the database when the application starts.

### Security Configuration: 
The WebSecurityConfig class configures security settings, such as authentication and authorization rules.

### Application Properties: 
The application.properties file holds various configurations for the Spring Boot application, such as database settings.

## Data Structure Used
The project mainly uses the following data structures:

### Java Classes: Data models/entities (UserEntity and FoodItemEntity) are used to structure and represent the data.
### Data Transfer Objects (DTOs): These objects (UserDTO and FoodItemDTO) facilitate the exchange of data between the frontend and backend in a structured manner.
## Project Summary
The Food Delivery Platform API is a backend application that provides RESTful endpoints for users to order food from restaurants. It is built using Java and the Spring Boot framework, making it easy to develop, maintain, and scale. The API follows a structured data flow, with controllers handling incoming requests, services implementing business logic, and repositories managing data access to the MySQL database.

Users can register, log in, and place orders for food items. The admin has additional privileges to add new food items and perform CRUD operations on food items. The data structure includes entities for users and food items, each with specific attributes to store relevant information.

This API lays the foundation for building a fully functional food delivery platform that can be further expanded with additional features like payment processing, delivery tracking, and user reviews. It is designed to be secure, scalable, and easily extensible to meet the needs of a real-world food delivery service.
