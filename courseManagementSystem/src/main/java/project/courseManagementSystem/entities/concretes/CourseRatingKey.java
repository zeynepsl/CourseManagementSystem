package project.courseManagementSystem.entities.concretes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
/*Birincil anahtarımız bir bileşik anahtar olduğundan, anahtarın farklı bölümlerini tutacak yeni bir sınıf oluşturmamız gerekiyor */
public class CourseRatingKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "instructor_id")
	private int instructorId;
	
	@Column(name = "course_id")
	private int courseId;

}
