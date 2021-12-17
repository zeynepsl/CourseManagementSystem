package project.courseManagementSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor*/

//PK bir bileşik anahtar
//anahtarın farklı bölümlerini tutacak yeni bir sınıf oluşturmalıyız:
public class CourseInstructor {
	/*	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "instructor_id")
	Instructor instructor;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	Course course;*/

	
	
}
