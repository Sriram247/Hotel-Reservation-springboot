
# Hotel Reservation System API

This is a **Spring Boot Web App** for a **Hotel Reservation System**. It allows users to:

-   **Retrieve a list of available hotels** (GET request)   
-   **Add a new hotel to the database** (POST request)
 
## 📌 Technologies Used

-   Java Spring Boot
-   MySQL Database
-   Redis for Caching
 -   UUID for Unique Identifiers
-   CORS Handling for Frontend Integration
-   Maven

## 📌 Database Setup

1.  Create a MySQL database named `hotel_db`.
    
2.  Open MySQL Workbench or a terminal and run:
    
    ```
    CREATE DATABASE hotel_db;
    ```
    
3.  Update the `application.properties` file:
    
    ```
    spring.datasource.url=jdbc:mysql://localhost:3306/hotel_db
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
    spring.jpa.hibernate.ddl-auto=update
    ```
    
## 📌 Redis Caching Setup

1.  Install and run Redis:
    
    -   **On Windows**: Use [Memurai](https://www.memurai.com/) or install Redis via WSL.
        
    -   **On Mac**: Install via Homebrew:
        
        ```
        brew install redis
        brew services start redis
        ```
        
    -   **On Linux**: Install via:
        
        ```
        sudo apt update
        sudo apt install redis-server
        sudo systemctl start redis
        sudo systemctl enable redis
        ```
        
2.  Update `application.properties` to configure Redis:
    
    ```
    spring.cache.type=redis
    spring.data.redis.host=localhost
    spring.data.redis.port=6379
    ```
    

## 📌 UUID Feature

The `Hotel` entity uses a **UUID** as the primary key instead of an auto-incremented integer. This ensures global uniqueness across distributed systems.


## 📌 _Running the Application_

1.  _Clone the repository:_
    
    ```
    git clone https://github.com/Sriram247/Hotel-Reservation-springboot.git
    cd Hotel-Reservation-springboot
    ```
    
2.  _Build and run the Spring Boot application:_
    
    ```
    mvn spring-boot:run
    ```
    

## 📌 API Endpoints

### 1️⃣ Get List of Hotels (with Redis Caching)

-   **URL:**  `GET /hotels`
    
-   **Description:** Returns a list of all hotels in the database. Uses Redis caching to optimize performance.
    
-   **Example Request:**
    
    ```
    curl -X GET http://localhost:8080/hotels
    ```
    
-   **Example Response:**
    
    ```
    [
      {
        "id": "550e8400-e29b-41d4-a716-446655440000",
        "name": "HotelTheSara",
        "location": "Halifax"
      }
    ]
    ```
    

### 2️⃣ Add a New Hotel (Invalidates Cache)

-   **URL:**  `POST /hotels`
    
-   **Description:** Adds a new hotel to the database and clears cache to ensure fresh data is retrieved.
    
-   **Example Request:**
    
    ```
    curl -X POST http://localhost:8080/hotels \
    -H "Content-Type: application/json" \
    -d '{"name": "Sunrise Inn", "location": "Dartmouth"}'
    ```
    
-   **Example Response:**
    
    ```
    {
      "id": "4f9b95e3-839b-4eb7-9f8e-5fbb5a3e7c94",
      "name": "Sunrise Inn",
      "location": "Dartmouth"
    }
    ```
    

## 📌 Screenshots

### **GET Request Example:**


### **POST Request Example:**

----------

🚀 **Happy Coding!**