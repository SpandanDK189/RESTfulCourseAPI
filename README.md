
# Spring Boot REST API with MySQL Database Integration

This project demonstrates the development of a Spring Boot application to manage Course details using REST APIs. It leverages Spring Data JPA for database interactions and connects to a MySQL database.

## Purpose of the Project

The purpose of this project is to:

- Create a REST API to perform CRUD operations on Course details.
- Demonstrate the use of Spring Boot and Spring Data JPA for database handling.
- Showcase the integration of MySQL as a database solution.

## Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL Server
- IDE (e.g., IntelliJ IDEA, Eclipse)
- Postman or any REST client (optional, for testing APIs)

## Steps to Set Up and Run the Project

### 1. Clone the Repository
Clone the project repository to your local machine.

```bash
git clone https://github.com/your-username/springboot-rest-mysql-app.git
```

### 2. Configure the Database
Create a database in MySQL `YOUR_MYSQL_DATABASE_NAME`.

```sql
CREATE DATABASE YOUR_MYSQL_DATABASE_NAME;
```

Update the `application.yml` file with your MySQL username, password and database name.

```yaml
spring:
  datasource:
    username: YOUR_MYSQL_USERNAME
    password: YOUR_MYSQL_PASSWORD
    url: jdbc:mysql://localhost:3306/YOUR_MYSQL_DATABASE_NAME
```

### 3. Build the Project
Navigate to the project directory and build it using Maven.

```bash
mvn clean install
```

### 4. Run the Application
Start the application using the following command:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

### 5. Test the REST APIs
You can test the APIs using Postman or any REST client. Below are the endpoints:

#### Create a Course
- **Endpoint:** `POST /course`
- **Body:**
  ```json
  {
    "name": "Java Programming",
    "price": 499.99
  }
  ```

#### Get a Course by ID
- **Endpoint:** `GET /course/{cid}`

#### Get All Courses
- **Endpoint:** `GET /courses`

#### Update a Course
- **Endpoint:** `PUT /course`
- **Body:**
  ```json
  {
    "cid": 1,
    "name": "Advanced Java",
    "price": 599.99
  }
  ```

#### Delete a Course
- **Endpoint:** `DELETE /course/{cid}`

---

## Project Structure

- **Entity Layer:** Contains the `Course` class representing the data model.
- **Repository Layer:** Contains the `CourseRepository` interface extending `JpaRepository`.
- **Service Layer:** Contains the `CourseService` interface and its implementation `CourseServiceImpl`.
- **Controller Layer:** Contains `CourseRestController` to handle REST API requests.

---

## Technologies Used

- **Framework:** Spring Boot
- **Database:** MySQL
- **ORM:** Spring Data JPA
- **Language:** Java
- **Build Tool:** Maven
- **Tools:** Postman (for API testing)

---

## Future Enhancements

- Add validation for request data.
- Include authentication and authorization.
- Implement pagination and sorting for course retrieval.
- Use Docker for containerized deployment.

---

Feel free to fork the repository and contribute by submitting issues or pull requests!