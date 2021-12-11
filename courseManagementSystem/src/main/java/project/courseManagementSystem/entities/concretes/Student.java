package project.courseManagementSystem.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import project.courseManagementSystem.core.entities.User;

@Entity
@Data
@Table(name = "students")
@PrimaryKeyJoinColumn(name = "user_id") //gecerli tablodaki(students) kolonun adi
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializier", "handler", "homeworks"})
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
	
	@JsonIgnoreProperties
	@OneToMany(mappedBy = "student")
	private List<Homework> homeworks;
	
}
