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
        - [MernisServiceAdapter](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/adapters/mernis/MernisServiceAdapter.java)
        - [UserCheckService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/adapters/mernis/UserCheckService.java)
    - [business](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/business)
        - [BaseService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/business/BaseService.java)
    - [email](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/email)
        - [EmailCheckService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/email/EmailCheckService.java)
        - [EmailCheckManager](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/email/EmailCheckManager.java)
    - [entities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/entities)
        - [User](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/entities/User.java)
        - [Role](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/entities/Role.java)
    - [security](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/security)
        - [CustomUserDetailsService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/security/CustomUserDetailsService.java)
        - [SecurityConfig](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/security/SecurityConfig.java)
    - [utilities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities)
        - [fileUpload](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/fileUpload)
            - [exception](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/fileUpload/exception)
            - [payload](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/fileUpload/payload)
            - [service](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/fileUpload/service)
            - [FileStorageProperties](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/fileUpload/FileStorageProperties.java)
        - [imageUpload](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/imageUpload)
        - [results](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/results)
- [Business](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business)
    - [abstracts](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts)
        - [AuthService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/AuthService.java)
        - [CourseService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/CourseService.java)
        - [HomeworkService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/HomeworkService.java)
        - [InstructorService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/InstructorService.java)
        - [LessonService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/LessonService.java)
        - [PointService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/PointService.java)
        - [RoleService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/RoleService.java)
        - [StudentService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/StudentService.java)
        - [UserService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/UserService.java)
    - [concretes](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes)
        - [AuthManager](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/AuthManager.java)
        - [CourseManager](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/CourseManager.java)
        - [HomeworkManager](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/HomeworkManager.java)
        - [InstructorManager](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/InstructorManager.java)
        - [LessonManager](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/LessonManager.java)
        - [PointManager](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/PointManager.java)
        - [RoleManager](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/RoleManager.java)
        - [StudentManager](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/StudentManager.java)
        - [UserManager](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/UserManager.java)
    - [validation rules](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules)
        - [CourseValidator](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/CourseValidator.java)
        - [CourseValidatorService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/CourseValidatorService.java)
        - [InstructorValidator](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/InstructorValidator.java)
        - [InstructorValidatorService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/InstructorValidatorService.java)
        - [StudentValidator](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/StudentValidator.java)
        - [StudentValidatorService](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/StudentValidatorService.java)
        - [UserValidator](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/UserValidator.java)
- [API/controllers](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers)
    - [AuthController](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/AuthController.java)
    - [CourseController](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/CourseController.java)
    - [HomeworkController](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/HomeworkController.java)
    - [InstructorsController](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/InstructorsController.java)
    - [LessonController](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/LessonController.java)
    - [PointController](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/PointController.java)
    - [RoleController](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/RoleController.java)
    - [StudentsController](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/StudentsController.java)
    - [UsersController](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/UsersController.java)
