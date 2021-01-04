package sat.project.schooling_at_home.student;

import org.springframework.data.repository.CrudRepository;

import sat.project.schooling_at_home.department.Teacher_Department;
import sat.project.schooling_at_home.teacher.Teacher;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	Teacher_Department save(Teacher_Department teacher_Department);

	Iterable<Student> findAllByDepartmentDepartmentIgnoreCase(String dep);
	Student findAllByEmailIgnoreCase(String email);

	}