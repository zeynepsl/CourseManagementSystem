package project.courseManagementSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "students")
@PrimaryKeyJoinColumn(name = "user_id") //gecerli tablodaki(students) kolonun adi
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Student extends User{
	// private int userId;
	
	@Column(name = "school_name")
	@NotNull
	private String schoolName;
	
	@Column(name = "gender")
	@NotNull
	private String gender;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
}
