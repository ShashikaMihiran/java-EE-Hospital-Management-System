# [Spring Boot Folder Structure](https://malshani-wijekoon.medium.com/spring-boot-folder-structure-best-practices-18ef78a81819)

## Config: 
> Contains configuration classes, where you configure application settings, or AppConfig for other application-level configurations.

## Controller: 
> Contains your RESTful controller classes. These classes handle incoming HTTP requests and define the API endpoints.

## DTO (Data Transfer Object): 
> A DTO, is a design pattern used to transfer data between different layers or components of an application. The main purpose of a DTO is to encapsulate data and provide a simple data structure that can be easily passed around the application. DTOs are often used to transfer data between the front-end and back-end of a web application, between microservices, or between different layers of an application, like the service layer and the presentation layer.

###     Characteristics of a DTO:
            - It typically contains only private fields with getters and setters to access the data.
            - DTOs do not contain any business logic, and their primary focus is to carry data.
            - They are often used to represent a subset of data from an entity or a combination of data from multiple entities.
            - DTOs help to reduce the amount of data transferred over the network, improving performance by avoiding excessive data exchange.

## Enum (Enumeration class): 
> Enum classes are typically used to represent a set of closely related and pre-defined values. Examples of common use cases for Enum classes include request status like SUCCESS, FAIL, PENDING and more.


## Model: 
> The model folder stores data models or entities that represent structure and behaviour of the application domain. These classes are mapped to database tables and define the properties and relationships of the application data.

## Repository: 
> Contains repository classes that deal with data access. These classes typically use an ORM (Object-Relational Mapping) framework or JPA (Java Persistence API) to interact with the database.

## Service: 
> Contains service classes that implement business logic. Controllers use these services to perform operations on data.

## Util (Utilities): 
> The “util” folder is not specific to Spring Boot; it is a general practice followed in many programming languages and frameworks. In Spring Boot projects, you might find a “util” package or folder where developers place utility classes to keep the codebase organized and modular.


###     Folder Structure
![Folder Structure](https://miro.medium.com/v2/resize:fit:640/format:webp/1*odRt7mD5fBVaS9eED51Mlg.png)