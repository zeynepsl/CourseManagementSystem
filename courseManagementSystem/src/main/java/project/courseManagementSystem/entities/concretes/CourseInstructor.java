package project.courseManagementSystem.entities.concretes;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//herhangi bir sayıda varlık türü arasındaki ilişkileri modelleyebiliriz.

@Entity
/*
@Data
@AllArgsConstructor
@NoArgsConstructor*/

/*Bu bileşik anahtar sınıfını kullanarak, birleştirme tablosunu modelleyen varlık sınıfını oluşturabiliriz:*/
public class CourseInstructor {
	/*//birincil anahtar işaretlemek için bir örneğidir, CourseRatingKey sınıfına.
	//@EmbeddedId
	//private CourseRatingKey id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	//mapsId
	//bu alanları anahtarın bir kısmına bağladığımız anlamına gelir ve bunlar çoktan bire ilişkinin yabancı anahtarlarıdır. Buna ihtiyacımız var çünkü bahsettiğimiz gibi bileşik anahtarda varlıklarımız olamaz.
	@ManyToOne
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
	//@MapsId("courseId")
	//@MapsId("instructorId")*/
	@Id
	private int id;
	
}
