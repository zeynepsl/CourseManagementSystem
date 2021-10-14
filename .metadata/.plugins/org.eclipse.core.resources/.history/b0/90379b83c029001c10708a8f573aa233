package project.courseManagementSystem.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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
	
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "gender")
	private String gender;
}
