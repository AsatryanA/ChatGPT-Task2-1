
# Online Bookstore RESTful API

This project implements a simple RESTful API for an online bookstore using Spring Boot, Hibernate, and H2 Database.

## Prerequisites

- Java 11 or higher
- Maven

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/AsatryanA/ChatGPT-Task2-1
   cd online-bookstore-api
    ```
2. **Run the application:**
    ```bash
    mvn spring-boot:run
    ```
3. **Open the application in your browser:**
    ```bash
    http://localhost:8080
    ```
## API Endpoints
### Books
- **GET** /api/books
- **GET** /api/books/{id}
- **POST** /api/books
  - Request Body:
    ```json
    {
        "title": "Sample Book",
        "price": 29.99,
        "quantityAvailable": 20,
        "author": {"id": 1, "name": "Author Name"},
        "genre": {"id": 1, "name": "Genre Name"}
    }
    ```
- **PUT** /api/books/{id}
- **DELETE** /api/books/{id}
- **GET** /api/books/search
  - Query Parameters:
    - title
    - author
    - genre
    - minPrice
    - maxPrice
    - minQuantityAvailable
    - maxQuantityAvailable
    - sortBy
    - sortDirection
    - page
    - size
### Authors
- **GET** /api/authors
- **GET** /api/authors/{id}
- **POST** /api/authors
  - Request Body:
    ```json
    {
        "name": "Sample Author"
    }
    ```
- **PUT** /api/authors/{id}
- **DELETE** /api/authors/{id}
- **GET** /api/authors/search
  - Query Parameters:
    - name
    - sortBy
    - sortDirection
    - page
    - size
### Genres
- **GET** /api/genres
- **GET** /api/genres/{id}
- **POST** /api/genres
  - Request Body:
    ```json
    {
        "name": "Sample Genre"
    }
    ```
- **PUT** /api/genres/{id}
- **DELETE** /api/genres/{id}
- **GET** /api/genres/search
  - Query Parameters:
    - name
    - sortBy
    - sortDirection
    - page
    - size



## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

