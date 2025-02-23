Here is the code for the README file that you can copy and use in your project:

```markdown
# Gas Utility Company Service Request System

This project provides a service request management system for a gas utility company. The system allows customers to submit service requests, track their request statuses, and view their account information. It also provides customer support representatives with tools to manage and resolve service requests.

The application is built with **Spring Boot**, **Hibernate**, and **MySQL**.

## Features

- **Customer Service Requests:**
  - Customers can submit requests for various services.
  - Attach files to the service request.
  - Select the service type and provide additional details.

- **Request Tracking:**
  - Customers can track the status of their service requests.
  - View the request's creation and resolution timestamps.
  
- **Customer Support Interface:**
  - Customer support representatives can view all requests.
  - Update the status of requests (e.g., "pending", "resolved").

- **REST API Endpoints:**
  - `POST /saveReq`: Submit a new service request.
  - `GET /getAllReq`: Retrieve all service requests.
  - `GET /getReq/{id}`: Retrieve a service request by ID.
  - `PUT /updReq/{id}`: Update the status of a service request.

## Prerequisites

Make sure you have the following installed on your machine:

- **Java 17 or higher**
- **MySQL** (or another compatible relational database)
- **Maven** or **Gradle** (to build the project)
- IDE like **IntelliJ IDEA**, **Eclipse**, or **Visual Studio Code**

## Setup and Installation

### 1. Clone the Repository

Clone this repository to your local machine:

```bash
git clone https://github.com/your-username/gas-utility-service-request-system.git
cd gas-utility-service-request-system
```

### 2. Set up the Database

1. **Create a MySQL database**:

    ```sql
    CREATE DATABASE abcd;
    ```

2. **Configure the application properties**:

    Open `src/main/resources/application.properties` and set up your MySQL connection details.

    ```properties
    spring.application.name=Gas_Utility_Company

    server.port=8090
    spring.datasource.url=jdbc:mysql://localhost:3306/abcd
    spring.datasource.username=root
    spring.datasource.password=root
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
    spring.jpa.show-sql=true
    ```

### 3. Run the Application

You can run the application with the following command:

```bash
./mvnw spring-boot:run
```

Or, if you're using an IDE like IntelliJ or Eclipse, you can directly run the `Application.java` class.

### 4. Access the Application

Once the application is up and running, you can access the APIs at:

```
http://localhost:8090
```

You can now test the endpoints using tools like **Postman** or **Curl**.

## API Endpoints

### 1. `POST /saveReq`
**Description**: Submit a new service request.

**Request Body**:
```json
{
  "customerName": "Sumit Sahare",
  "serviceType": "Gas Leak",
  "details": "There is a suspected gas leak at my address.",
  "attachment": "leak_image.jpg"
}
```

**Response**:
```json
{
  "id": 1,
  "customerName": "Sumit Sahare",
  "serviceType": "Gas Leak",
  "details": "There is a suspected gas leak at my address.",
  "attachment": "leak_image.jpg",
  "status": "pending",
  "createAt": "2025-02-23T10:00:00",
  "updateAt": "2025-02-23T10:00:00"
}
```

---

### 2. `GET /getAllReq`
**Description**: Retrieve all service requests.

**Response**:
```json
[
  {
    "id": 1,
    "customerName": "Sumit Sahare",
    "serviceType": "Gas Leak",
    "details": "There is a suspected gas leak at my address.",
    "attachment": "leak_image.jpg",
    "status": "pending",
    "createAt": "2025-02-23T10:00:00",
    "updateAt": "2025-02-23T10:00:00"
  }
]
```

---

### 3. `GET /getReq/{id}`
**Description**: Retrieve a specific service request by its ID.

**Response**:
```json
{
  "id": 1,
  "customerName": "Sumit Sahare",
  "serviceType": "Gas Leak",
  "details": "There is a suspected gas leak at my address.",
  "attachment": "leak_image.jpg",
  "status": "pending",
  "createAt": "2025-02-23T10:00:00",
  "updateAt": "2025-02-23T10:00:00"
}
```

---

### 4. `PUT /updReq/{id}`
**Description**: Update the status of a service request by its ID.

**Request Body**:
```json
{
  "status": "resolved"
}
```

**Response**:
```json
{
  "id": 1,
  "customerName": "Sumit Sahare",
  "serviceType": "Gas Leak",
  "details": "There is a suspected gas leak at my address.",
  "attachment": "leak_image.jpg",
  "status": "resolved",
  "createAt": "2025-02-23T10:00:00",
  "updateAt": "2025-02-23T11:00:00"
}
```

## Project Structure

```plaintext
gas-utility-service-request-system/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── guc/
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   └── ServiceRequestController.java
│   │   │   │   │   ├── entity/
│   │   │   │   │   │   └── ServiceRequest.java
│   │   │   │   │   ├── repo/
│   │   │   │   │   │   └── ServiceRequestRepo.java
│   │   │   │   │   ├── service/
│   │   │   │   │   │   └── ServiceRequestService.java
│   │   │   │   │   └── Application.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   └── static/
│   │   │       └── index.html
└── pom.xml
```

## Contributing

We welcome contributions! If you'd like to help improve the project, feel free to submit a pull request.

### Steps to Contribute:

1. Fork the repository.
2. Create a new branch for your feature (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push your branch (`git push origin feature/your-feature`).
5. Submit a pull request to the main repository.

```

This README provides all the necessary information to understand, set up, and contribute to the project. You can adjust the repository link and specific details as needed.
