<div align="center">
  <h1>Course Management System Project</h1>
  <p>This project is to simplify and systematize the management task in a course, increase efficiency and reduce the disadvantages of the existing manual system.</p>
  <a href="https://github.com/zeynepsl/CourseManagementSystem/issues">report bug</a> - 
  <a href="https://github.com/zeynepsl/CourseManagementSystem/issues">request feature</a>
</div>

# About the project

## Technologies used
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
- [Java (v 11)](https://java.com/en/)
- Spring Boot (v 2.5.5)
- Spring Framework (v 2.5.5)
- Spring Fox Hibernate
- Swagger (v 2.9.2)
- [PostgreSql](https://www.postgresql.org/)

## Features 
- Prepared with [Java Programming language](https://java.com/en/) and Layered architecture ([Entities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities),
[DataAccess](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts), 
[Business](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business), 
[Core](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core) and 
[API](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers) layers).
- Each method is provided to return a [Result structure](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/results).
- Autowired in SpringFramework structure is used for IoC.


## Documents
- The language of the documents is Turkish. If there is anything you want to ask, please [contact me](https://www.linkedin.com/in/zeynepsalman/) without hesitation.
    - [SOFTWARE REQUIREMENTS SPECIFİCATIONS DOCUMENT - SRS](https://github.com/zeynepsl/CourseManagementSystem/blob/master/raporlar/analizRaporu-SRS.docx)
    - [SOFTWARE DESİGN DOCUMENT - SDS](https://github.com/zeynepsl/CourseManagementSystem/blob/master/raporlar/tasar%C4%B1mRaporu-SDS.docx)
    - [SOFTWARE IMPLEMENTATION DOCUMENT](https://github.com/zeynepsl/CourseManagementSystem/blob/master/raporlar/gerceklestirimRaporu.docx)


## Layers
- ***[Entities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities)***
    - *[concretes](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes)*
        - Curriculum created in each course: [Course.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Course.java)
        - [Homework.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Homework.java)
        - [Instructor.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Instructor.java)
        - [Lesson.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Lesson.java)
        - Grade given to assignments by the instructor: [Point.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Point.java)
        - [Student.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/concretes/Student.java)
    - *[dtos](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos)*
        - [CourseDto.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/CourseDto.java)
        - [InstructorDto.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/InstructorDto.java)
        - [LoginDto.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/LoginDto.java)
        - [PointDto.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/PointDto.java)
        - [RegisterDto.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/RegisterDto.java)
        - [StudentDto.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/entities/dtos/StudentDto.java)
- ***[DataAccess](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts)***
    - [CourseDao.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/CourseDao.java)
    - [HomeworkDao.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/HomeworkDao.java)
    - [InstructorDao.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/InstructorDao.java)
    - [LessonDao.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/LessonDao.java)
    - [PointDao.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/PointDao.java)
    - [RoleDao.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/RoleDao.java)
    - [StudentDao.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/StudentDao.java)
    - [UserDao.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/dataAccess/abstracts/UserDao.java)
- ***[Core](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core)***
    - *[adapters](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/adapters/mernis)*
        - [MernisServiceAdapter.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/adapters/mernis/MernisServiceAdapter.java)
        - [UserCheckService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/adapters/mernis/UserCheckService.java)
    - *[business](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/business)*
        - [BaseService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/business/BaseService.java)
    - *[email](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/email)*
        - [EmailCheckService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/email/EmailCheckService.java)
        - [EmailCheckManager.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/email/EmailCheckManager.java)
    - *[entities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/entities)*
        - [User.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/entities/User.java)
        - [Role.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/entities/Role.java)
    - *[security](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/security)*
        - [CustomUserDetailsService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/security/CustomUserDetailsService.java)
        - [SecurityConfig.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/security/SecurityConfig.java)
    - *[utilities](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities)*
        - *[fileUpload](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/fileUpload)*
            - *[exception](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/fileUpload/exception)*
            - *[payload](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/fileUpload/payload)*
            - *[service](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/fileUpload/service)*
            - [FileStorageProperties.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/fileUpload/FileStorageProperties.java)
        - *[imageUpload](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/imageUpload)*
        - *[results](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/core/utilities/results)*
- ***[Business](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business)***
    - *[abstracts](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts)*
        - [AuthService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/AuthService.java)
        - [CourseService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/CourseService.java)
        - [HomeworkService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/HomeworkService.java)
        - [InstructorService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/InstructorService.java)
        - [LessonService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/LessonService.java)
        - [PointService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/PointService.java)
        - [RoleService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/RoleService.java)
        - [StudentService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/StudentService.java)
        - [UserService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/abstracts/UserService.java)
    - *[concretes](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes)*
        - [AuthManager.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/AuthManager.java)
        - [CourseManager.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/CourseManager.java)
        - [HomeworkManager.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/HomeworkManager.java)
        - [InstructorManager.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/InstructorManager.java)
        - [LessonManager.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/LessonManager.java)
        - [PointManager.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/PointManager.java)
        - [RoleManager.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/RoleManager.java)
        - [StudentManager.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/StudentManager.java)
        - [UserManager.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/concretes/UserManager.java)
    - *[validation rules](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules)*
        - [CourseValidator.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/CourseValidator.java)
        - [CourseValidatorService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/CourseValidatorService.java)
        - [InstructorValidator.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/InstructorValidator.java)
        - [InstructorValidatorService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/InstructorValidatorService.java)
        - [StudentValidator.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/StudentValidator.java)
        - [StudentValidatorService.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/StudentValidatorService.java)
        - [UserValidator.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/business/validationRules/UserValidator.java)
- ***[API](https://github.com/zeynepsl/CourseManagementSystem/tree/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers)***
    - [AuthController.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/AuthController.java)
    - [CourseController.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/CourseController.java)
    - [HomeworkController.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/HomeworkController.java)
    - [InstructorsController.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/InstructorsController.java)
    - [LessonController.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/LessonController.java)
    - [PointController.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/PointController.java)
    - [RoleController.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/RoleController.java)
    - [StudentsController.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/StudentsController.java) 
    - [UsersController.java](https://github.com/zeynepsl/CourseManagementSystem/blob/master/courseManagementSystem/src/main/java/project/courseManagementSystem/api/controllers/UsersController.java)
    
      
