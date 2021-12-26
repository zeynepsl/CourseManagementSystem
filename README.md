<div align="center">
  <h1>Course Management System Project</h1>
  <p>This project is to simplify and systematize the management task in a course, increase efficiency and reduce the disadvantages of the existing manual system.</p>
  <a href="https://github.com/zeynepsl/CourseManagementSystem/issues">report bug</a> - 
  <a href="https://github.com/zeynepsl/CourseManagementSystem/issues">request feature</a>
</div>

# About the project

## Technologies used
- [Java](https://java.com/en/)
- Spring Boot
- Spring Framework
- Spring Fox Hibernate
- [PostgreSql](https://www.postgresql.org/)

## Features 
- Prepared with [Java Programming language](https://java.com/en/) and Layered architecture ([Entities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities),
[DataAccess](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts), 
[Business](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business), 
[Core](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core) and 
[API](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers) layers).
- Each method is provided to return a [Result structure](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/results).
- Autowired in SpringFramework structure is used for IoC.

## Layers
- [Entities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities)
    - [concretes](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes)
    - [dtos](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos)
- [DataAccess](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts)
- [Core](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core)
    - [adapters](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/adapters/mernis)
    - [business](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/business)
    - [email](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/email)
    - [entities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/entities)
    - [security](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/security)
    - [utilities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities)
- [Business](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business)
- [API](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers)
