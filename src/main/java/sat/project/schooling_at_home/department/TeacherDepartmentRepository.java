package sat.project.schooling_at_home.department;

import org.springframework.data.repository.CrudRepository;

public interface TeacherDepartmentRepository extends CrudRepository<Teacher_Department, Integer>  {
	
	public Teacher_Department findByDepartment(String depName);

}
