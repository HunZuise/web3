[project_readme.md](https://github.com/user-attachments/files/34639147/project_readme.md)[Uploading project_readme# Event Registration REST API (Spring Boot)

This repository contains Laboratory Work 6 for the Web Technologies course at IITU. The application is a backend RESTful service built with Java and Spring Boot that exposes JSON endpoints, applies dependency injection, and reads external configurations.

---

Tech Stack & Environment
* **Language:** Java (JDK 17 or higher)
* **Framework:** Spring Boot 3.2.5
* **Build Tool:** Gradle (Groovy DSL)
* **Dependencies:** Spring Web (`spring-boot-starter-web`)

---

Project Structure & Architecture
The project follows a standard layered architecture:

```text
src/main/java/kz/iitu/registration/
├── EventRegistrationApplication.java  # Main application entry point
├── controller/
│   └── RegistrationController.java   # Handles HTTP GET requests and exposes REST API endpoints
├── service/
│   └── EventService.java              # Manages business logic and in-memory event data
└── model/
    └── EventInfo.java                 # Data model representing event details (ID, title, location)
```

---

Key Components Explained

1. **`EventInfo` (Model):** Represents the data transfer object containing event attributes (`id`, `title`, `location`).
2. **`EventService` (Service):** Annotated with `@Service`. Holds the in-memory list of events (`Web Design Workshop`, `JavaScript Quiz`, `IT Career Talk`) and provides data to the controller.
3. **`RegistrationController` (Controller):** Annotated with `@RestController`. Implements constructor-based dependency injection to access `EventService` and uses `@Value` annotations to inject application settings from `application.properties`.

---

 API Endpoints

| Method | Endpoint | Description | Sample Output |
| :--- | :--- | :--- | :--- |
| **GET** | `/api/hello` | Returns a welcome message provided by `EventService`. | `{"message": "Welcome to the Event Registration API"}` |
| **GET** | `/api/events` | Returns JSON array of all registered events. | `[{"id": 1, "title": "Web Design Workshop", "location": "Room 101"}, ...]` |
| **GET** | `/api/info` | Returns application configuration loaded from `application.properties`. | `{"appName": "event-registration-api", "course": "Web Technologies", ...}` |

---

 How to Run the Application

1. **Clone the repository:**
   ```bash
   git clone <YOUR_GITHUB_REPOSITORY_URL>
   cd event-registration-api
   ```

2. **Run using Gradle Wrapper:**
   * **Windows:**
     ```cmd
     gradlew bootRun
     ```
   * **macOS / Linux:**
     ```bash
     ./gradlew bootRun
     ```

3. **Access the API:**
   Open your browser or API client (Postman/curl) and navigate to:
   * [http://localhost:8080/api/hello](http://localhost:8080/api/hello)
   * [http://localhost:8080/api/events](http://localhost:8080/api/events)
   * [http://localhost:8080/api/info](http://localhost:8080/api/info).md…]()
