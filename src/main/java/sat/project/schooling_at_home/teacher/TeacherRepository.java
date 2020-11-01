package sat.project.schooling_at_home.teacher;

import org.springframework.data.repository.CrudRepository;

import sat.project.schooling_at_home.department.Teacher_Department;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

	Teacher_Department save(Teacher_Department teacher_Department);

	}


