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
        - [Course](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Course.java)
        - [Homework](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Homework.java)
        - [Instructor](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Instructor.java)
        - [Lesson](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Lesson.java)
        - [Point](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Point.java)
        - [Student](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Student.java)
    - [dtos](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos)
        - [CourseDto](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/CourseDto.java)
        - [InstructorDto](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/InstructorDto.java)
        - [LoginDto](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/LoginDto.java)
        - [PointDto](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/PointDto.java)
        - [RegisterDto](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/RegisterDto.java)
        - [StudentDto](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/StudentDto.java)
- [DataAccess](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts)
    - [CourseDao](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/CourseDao.java)
    - [HomeworkDao](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/HomeworkDao.java)
    - [InstructorDao](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/InstructorDao.java)
    - [LessonDao](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/LessonDao.java)
    - [PointDao](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/PointDao.java)
    - [PointDao](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/RoleDao.java)
    - [RoleDao](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/RoleDao.java)
    - [StudentDao](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/StudentDao.java)
    - [UserDao](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/UserDao.java)
- [Core](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core)
    - [adapters](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/adapters/mernis)
    - [business](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/business)
    - [email](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/email)
    - [entities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/entities)
    - [security](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/security)
    - [utilities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities)
- [Business](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business)
    - [abstracts](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts)
    - [concretes](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes)
    - [validation rules](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules)
- [API](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers)
