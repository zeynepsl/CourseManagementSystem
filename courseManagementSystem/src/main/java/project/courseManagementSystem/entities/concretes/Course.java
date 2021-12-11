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
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor

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
	
	//****baeldung.com
	//here is owning side -> Course:
	//@JoinTable: in order to specify the owning side)
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
	
	@JsonIgnore
	@OneToMany(mappedBy = "course")
	private List<Student> students;
	
	/*@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="READER_SUBSCRIPTIONS", joinColumns={@JoinColumn(referencedColumnName="ID")}
                                        , inverseJoinColumns={@JoinColumn(referencedColumnName="ID")})  
    private Set<SubscriptionEntity> subscriptions;*/
	
	public void setInstructor(Instructor instructor) {
		enrolledInstructors.add(instructor);
	}
}
