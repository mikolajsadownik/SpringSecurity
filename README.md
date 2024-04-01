# Spring Security Example

This project demonstrates how to implement authentication and authorization using Spring Boot and Spring Security. It showcases the setup for two roles (`USER` and `ADMIN`) and how to secure endpoints based on these roles.

## Features

- **Spring Boot Application**: Utilizes Spring Boot for quick and easy project setup and configuration.
- **In-Memory Authentication**: Implements authentication using Spring Security with in-memory user details.
- **Role-Based Access Control**: Restricts access to certain pages based on user roles `USER` and `ADMIN`.
- **Custom Login and Logout**: Customizes login and logout functionalities, directing users based on their roles.
- **Thymeleaf Templates**: Employs Thymeleaf for server-side HTML rendering.

## Project Structure

- `SpringSecurityApplication.java`: Main application class that runs the Spring Boot application.
- `ContentController.java`: Controller class that handles navigation to different pages (`home`, `admin/home`, `user/home`).
- `SecurityConfiguration.java`: Configures Spring Security, specifying user roles and secured endpoints.
- `home.html`, `admin.html`, `user.html`: HTML templates for the landing page, admin, and user roles.
- `pom.xml`: Maven project configuration file including dependencies for Spring Boot, Spring Security, and Thymeleaf.
