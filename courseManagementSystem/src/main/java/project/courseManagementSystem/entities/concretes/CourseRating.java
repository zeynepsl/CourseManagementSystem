package project.courseManagementSystem.entities.concretes;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//herhangi bir sayıda varlık türü arasındaki ilişkileri modelleyebiliriz.
@Entity

/**/
@Data
@AllArgsConstructor
@NoArgsConstructor
/*Bu bileşik anahtar sınıfını kullanarak, birleştirme tablosunu modelleyen varlık sınıfını oluşturabiliriz:*/
public class CourseRating {
	//birincil anahtar işaretlemek için bir örneğidir, CourseRatingKey sınıfına.
	@EmbeddedId
	private CourseRatingKey id;
	
	
	
	//mapsId
	//bu alanları anahtarın bir kısmına bağladığımız anlamına gelir ve bunlar çoktan bire ilişkinin yabancı anahtarlarıdır. Buna ihtiyacımız var çünkü bahsettiğimiz gibi bileşik anahtarda varlıklarımız olamaz.
	@ManyToOne
	@MapsId("instructorId")
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;
	
	@ManyToOne
	@MapsId("courseId")
	@JoinColumn(name =  "course_id")
	private Course course;
}
