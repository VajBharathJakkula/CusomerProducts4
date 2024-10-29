Spring Boot API for Customer and Product Management
This project is a Spring Boot application that provides RESTful API endpoints to manage Customers and Products. It is built with a focus on modern Java development standards, including proper annotations, logging, and error handling. This README provides an overview of the setup, Swagger integration, and key functionalities.

Prerequisites
Java: OpenJDK 17 or later (LTS/Stable version)
Spring Boot: Version 3.3.x or later (LTS/Stable version)
Database: SQL-based (MS SQL, Oracle, or equivalent)
Version Control: GitHub (for repository and code management)
**Features**
CRUD operations: Supports POST, GET, PUT/PATCH for managing customers and products.
Data Models:
Customer: Fields include first_name, last_name, email (office and personal), family_members, and more.
Product: Fields include book_title, book_price, book_quantity, and more.
Swagger UI: API documentation and testing.
Error Handling: Comprehensive logging and exception handling using Logback.
Optional Integrations:

Documentation: Swagger for in-depth API documentation.
**Getting Started**
Clone the Repository
bash
Copy code
git clone https://github.com/VajBharathJakkula/CusomerProducts4
cd your-repository
Set up the Database
Ensure you have a compatible SQL database (e.g., MS SQL, Oracle) and configure the database connection details in application.properties or application.yml.

Run the Application
bash
Copy code
./mvnw spring-boot:run
The application will start on http://localhost:8080.

Access Swagger UI
Swagger UI provides interactive documentation and testing for the API.

Open your browser.
Go to http://localhost:8080/swagger-ui.html.
Here, you can explore all the API endpoints with their request and response structures.

Swagger Documentation
This project includes Swagger for API documentation to make it easier to understand and test API endpoints.

Key Endpoints
Customer Management:
POST /api/customers - Add a new customer.
GET /api/customers - Retrieve a list of all customers.
PUT /api/customers/{id} - Update customer details.
DELETE /api/customers/{id} - Remove a customer.
Product Management:
POST /api/products - Add a new product.
GET /api/products - Retrieve a list of all products.
PUT /api/products/{id} - Update product details.
DELETE /api/products/{id} - Remove a product.
Swagger will generate automatic documentation for these endpoints and display request/response examples and schemas.

Enabling Swagger UI
Swagger is enabled by default. If you need to disable it in certain environments, you can configure this in application.properties:

properties
Copy code
springdoc.api-docs.enabled=true
springdoc.swagger-ui.enabled=true
Logging and Error Handling
The application uses Logback for logging API requests and responses, along with error handling. This ensures all critical events and errors are captured.

Sample Logback Configuration
To customize the logging configuration, refer to logback-spring.xml in the src/main/resources directory.

Testing
This project includes unit tests configured with GitHub Actions. Run tests locally using:

bash
Copy code
./mvnw test
