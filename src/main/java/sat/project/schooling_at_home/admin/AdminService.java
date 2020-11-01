package sat.project.schooling_at_home.admin;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sat.project.schooling_at_home.Courses.CourseModel;
import sat.project.schooling_at_home.Courses.Courses;
import sat.project.schooling_at_home.Courses.CoursesRepository;
import sat.project.schooling_at_home.department.DepartmentModel;
import sat.project.schooling_at_home.department.TeacherDepartmentRepository;
import sat.project.schooling_at_home.department.Teacher_Department;
import sat.project.schooling_at_home.designaion.DesignationModel;
import sat.project.schooling_at_home.designaion.TeacherDesignationRepository;
import sat.project.schooling_at_home.designaion.Teacher_Designation;
import sat.project.schooling_at_home.teacher.Teacher;
import sat.project.schooling_at_home.teacher.TeacherModel;
import sat.project.schooling_at_home.teacher.TeacherRepository;

@Service

public class AdminService {
	
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	TeacherDepartmentRepository teacherDepartmentRepository;
	
	@Autowired
	TeacherDesignationRepository teacherDesignationRepository;
	
	@Autowired
	CoursesRepository coursesRepository;


	public Iterable<Teacher>  getAllTeachers()
	{
		 return teacherRepository.findAll();
	}
	public Iterable<Teacher_Department>  getAllTeacher_Department()
	{
		return teacherDepartmentRepository.findAll();
	}
	public Iterable<Teacher_Designation>  getAllTeacher_Designation()
	{
		return teacherDesignationRepository.findAll();
	}
	public Iterable<Courses>  getAllCourses()
	{
		return coursesRepository.findAll();
	}

	public Teacher  saveTeachers(Teacher teacher)
	{
		 return teacherRepository.save(teacher);
	}
	public Teacher_Department  saveDepartments(Teacher_Department Teacher_Department)
	{
		 return teacherDepartmentRepository.save(Teacher_Department);
	}
	public Teacher_Designation  saveDesignations(Teacher_Designation Designation)
	{
		 return teacherDesignationRepository.save(Designation);
	}
	public Courses  saveCourses(Courses Courses)
	{
		 return coursesRepository.save(Courses);
	}
	public Teacher  editTeachers(TeacherModel teacher )
	{
		
	Optional<Teacher> teacherFromRepoOptional=teacherRepository.findById(teacher.getId());
	if(teacherFromRepoOptional.isPresent()) {
	 Teacher teacherFromRepo = teacherFromRepoOptional.get();
	 teacherFromRepo.setFirst_name(teacher.getFirst_name());
	 teacherFromRepo.setLast_name(teacher.getLast_name());
	 teacherFromRepo.setDepartment(teacher.getDepartment());
	 teacherFromRepo.setDesignation(teacher.getDesignation());
	 return teacherRepository.save(teacherFromRepo);
	}
	  return null;
	    
		
	}
	public Teacher_Department  editDepartment(DepartmentModel Teacher_Department  )
	{
		
	Optional<Teacher_Department> departmentFromRepoOptional=teacherDepartmentRepository.findById(Teacher_Department.getId());
	if(departmentFromRepoOptional.isPresent()) {
		Teacher_Department departmentFromRepo = departmentFromRepoOptional.get();
		
	 departmentFromRepo.setDepartment(Teacher_Department.getDepartment());
	 
	 return teacherDepartmentRepository.save(departmentFromRepo);
	}
	  return null;
	    
		
	}
	
	public Teacher_Designation  editDesignation(DesignationModel Designation  )
	{
		
	Optional<Teacher_Designation> designationFromRepoOptional=teacherDesignationRepository.findById(Designation.getId());
	if(designationFromRepoOptional.isPresent()) {
		Teacher_Designation designationFromRepo = designationFromRepoOptional.get();
		
		designationFromRepo.setDesignation(Designation.getDesignation());
	 
	 return teacherDesignationRepository.save(designationFromRepo);
	}
	  return null;
	    
		
	}
	
	public Courses editCourse(CourseModel Courses)
	{
		
	Optional<Courses> courseFromRepoOptional=coursesRepository.findById(Courses.getId());
	if(courseFromRepoOptional.isPresent()) {
		Courses courseFromRepo = courseFromRepoOptional.get();
		
	 courseFromRepo.setCourse(Courses.getCourse());
	 
	 return coursesRepository.save(courseFromRepo);
	}
	  return null;
	
	}
	
}
