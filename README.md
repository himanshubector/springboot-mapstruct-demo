# SpringBoot MapStruct Demo

A Spring Boot application demonstrating clean and efficient mapping between Entities and DTOs using [MapStruct](https://mapstruct.org/).

## Features
- Spring Boot 3 REST APIs
- CRUD operations for Product entity
- MapStruct integration
- H2 in-memory database
- Unit and integration tests

## Getting Started

### Prerequisites
- Java 21+
- Maven 3.9+
- Git

### Run Application
```bash
Clone the repository: git clone https://github.com/himanshubector/springboot-mapstruct-demo.git
Navigate into the project directory: cd springboot-mapstruct-demo
Run the project using Maven: mvn spring-boot:run (for Mac/Linux)
The application will start on http://localhost:8080
```

### API Endpoints
## 1. Create a Product

POST /api/products

Request Body (JSON):

{
"name": "Laptop",
"price": 1200.50
}

Response Body (JSON):

{
"id": 1,
"name": "Laptop",
"price": 1200.50
}


## 2. Get All Products

GET /api/products

Response Body (JSON):

[
{
"id": 1,
"name": "Laptop",
"price": 1200.50
},
{
"id": 2,
"name": "Phone",
"price": 800.00
}
]



### Learn More
Read my Medium article: [Streamlining Mapping Between Entities and DTOs with MapStruct](https://medium.com/@bectorhimanshu/streamlining-mapping-between-entities-and-dtos-with-mapstruct-library-in-java-13284f2f6d4d)
