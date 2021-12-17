package project.courseManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.courseManagementSystem.business.abstracts.StudentService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.ErrorDataResult;
import project.courseManagementSystem.core.utilities.results.ErrorResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.core.utilities.results.SuccessDataResult;
import project.courseManagementSystem.core.utilities.results.SuccessResult;
import project.courseManagementSystem.dataAccess.abstracts.StudentDao;
import project.courseManagementSystem.entities.concretes.Student;

@Service
public class StudentManager implements StudentService {

	private StudentDao studentDao;

	@Autowired
	public StudentManager(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public Result add(Student entity) {
		studentDao.save(entity);
		return new SuccessResult("Student added!");
	}

	@Override
	public Result delete(int id) {
		try {
			if (getById(id).getData() == null) {
				return new ErrorResult("Student is not exist!");
			}
			studentDao.deleteById(id);
			return new SuccessResult("Student deleted!");
		} catch (Exception e) {
			return new ErrorResult(e.getLocalizedMessage());
			// TODO: handle exception
			//org.postgresql.util.PSQLException: HATA: "students" tablosu üzerinde yapılan update veya delete işlemi "homeworks" tablosunun "fks7g9phygqbdtcoljm5ydbuhxg" bütünlük kısıtlamasını ihlal ediyor
			//Ayrıntı: (user_id)=(4) anahtarı "homeworks" tablosundan hala referans edilmektedir.
		}

	}

	@Override
	public Result update(Student entity) {
		Student updatedStudent = getById(entity.getId()).getData();

		updatedStudent.setEmail(entity.getEmail());
		updatedStudent.setBirthDate(entity.getBirthDate());
		updatedStudent.setFirstName(entity.getFirstName());
		updatedStudent.setGender(entity.getGender());
		updatedStudent.setLastName(entity.getLastName());
		updatedStudent.setNationalityId(entity.getNationalityId());
		updatedStudent.setPassword(entity.getPassword());
		updatedStudent.setPhoneNumber(entity.getPhoneNumber());
		updatedStudent.setSchoolName(entity.getSchoolName());

		studentDao.save(updatedStudent);
		return new SuccessResult("Student updated!");
	}

	@Override
	public DataResult<Student> getById(int id) {
		Student student = studentDao.findById(id);
		if (student == null) {
			return new ErrorDataResult<Student>(null, "Student is not exist!");
		}
		return new SuccessDataResult<Student>(student, "Student viewed!");
	}

	@Override
	public DataResult<List<Student>> getAll() {
		return new SuccessDataResult<List<Student>>(studentDao.findAll(), "Students listed");
	}

	@Override
	public DataResult<Student> getByEmail(String email) {
		Student student = studentDao.findByEmail(email);
		if (student == null) {
			return new ErrorDataResult<Student>(null, "Student is not exist!");
		}
		return new SuccessDataResult<Student>(student, "Student viewed!");

	}

	@Override
	public DataResult<List<Student>> getAllByCourse_Id(int courseId) {
		return new SuccessDataResult<List<Student>>(studentDao.getAllByCourse_Id(courseId), "Students listed");
	}

}
