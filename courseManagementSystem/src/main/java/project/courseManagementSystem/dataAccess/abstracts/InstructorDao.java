package project.courseManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.courseManagementSystem.entities.concretes.Instructor;

public interface InstructorDao extends JpaRepository<Instructor, Integer>{
	Instructor findById(int id);
	
	/*@Query("select new project.courseManagementSystem.entities.concretes.EnrolledInstructor"
			+ "(n.id, c.id)"
			+ "From Course c Inner Join c.instructors n")
	List<Instructor> getByCourses_Course_Id(int courseId);*/
	
	
	//userData 3.
	/*	var m =(from data in _dbContext.UserData
			Join details in _dbContext.UserDetails on data.UserID equals details.UserID
			Join dict in _dbContext.UserDetailsDictionary on data.DictionaryID equals dict.DictID 
			//where Condition if required 
			select new {
			UserName=details.UserName,
			Interest= dict.IntersetName,
			//_value=true/false 
			}
			).ToList();*/

}
