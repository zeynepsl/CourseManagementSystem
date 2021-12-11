package project.courseManagementSystem.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import project.courseManagementSystem.core.entities.User;

@Entity
@Data
@Table(name = "instructors")
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Instructor extends User{
	
	@Column(name = "department_name")
	private String departmentName;

	@JsonIgnore
	@ManyToMany(mappedBy = "enrolledInstructors")
	private List<Course> courses;
	
}
