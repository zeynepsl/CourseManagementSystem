package project.courseManagementSystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.courseManagementSystem.entities.concretes.Point;

public interface PointDao extends JpaRepository<Point, Integer>{
	Point findById(int id);
	List<Point> findBySuccessGrade(String successGrade);
}
