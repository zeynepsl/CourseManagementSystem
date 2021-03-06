package project.courseManagementSystem.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializier", "handler", "students"})
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private int id;
	
	@Column(name = "name")
	@NotNull
	private String name;
	
	@Column(name = "startDate")
	private LocalDate startDate;
	
	@Column(name = "endDate")
	private LocalDate endDate;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
			name = "enrolled_instructors",
			joinColumns = @JoinColumn(referencedColumnName = "course_id"),
			inverseJoinColumns = @JoinColumn(referencedColumnName = "user_id")
			)
	private List<Instructor> enrolledInstructors;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
			name = "enrolled_lessons",
			joinColumns = @JoinColumn(referencedColumnName = "course_id"),
			inverseJoinColumns = @JoinColumn(referencedColumnName = "lesson_id"))
	private List<Lesson> enrolledLessons;
	
	@JsonIgnoreProperties
	@OneToMany(mappedBy = "course")
	private List<Student> students;
	
}
