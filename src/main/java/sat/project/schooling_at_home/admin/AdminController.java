package sat.project.schooling_at_home.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sat.project.schooling_at_home.Courses.CourseModel;
import sat.project.schooling_at_home.Courses.Courses;
import sat.project.schooling_at_home.department.DepartmentModel;
import sat.project.schooling_at_home.department.Teacher_Department;
import sat.project.schooling_at_home.designaion.DesignationModel;
import sat.project.schooling_at_home.designaion.Teacher_Designation;
import sat.project.schooling_at_home.teacher.Teacher;
import sat.project.schooling_at_home.teacher.TeacherModel;
import sat.project.schooling_at_home.teacher.TeacherRepository;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private AdminService adminService;

	@GetMapping(path = "/allTeachers")
	public @ResponseBody Iterable<Teacher> getAllTeacher() {
		// This returns a JSON or XML with the users
		return adminService.getAllTeachers();
	}
	@PostMapping(path="/addTeacher") // Map ONLY POST Requests
	  public @ResponseBody ResponseEntity<String>  addNewTeacher ( @RequestBody TeacherModel teacher)   {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Teacher teacherEntity = new Teacher();
	    teacherEntity.setFirst_name(teacher.getFirst_name());
	    teacherEntity.setLast_name(teacher.getLast_name());
	    teacherEntity.setDepartment(teacher.getDepartment());
	    teacherEntity.setDesignation(teacher.getDesignation());
	    
	    adminService.saveTeachers(teacherEntity);
	   
	    return new ResponseEntity<String>(HttpStatus.OK);
	  }

	@PutMapping(path="/editTeacher") // Map ONLY POST Requests
	  public @ResponseBody ResponseEntity<String>  editTeacher ( @RequestBody TeacherModel teacher)   {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    
	    adminService.editTeachers(teacher);
	   
	    return new ResponseEntity<String>(HttpStatus.OK);
	  }

	@GetMapping(path = "/departments")
	public @ResponseBody Iterable<Teacher_Department> getAllTeacherDepartment() {
		// This returns a JSON or XML with the users
		return adminService.getAllTeacher_Department();
		
		  }
	@PostMapping(path="/addDepartments") // Map ONLY POST Requests
	  public @ResponseBody ResponseEntity<String>  addNewDepartment ( @RequestBody DepartmentModel Teacher_Department)   {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

		Teacher_Department departmentEntity = new Teacher_Department();

		departmentEntity.setDepartment(Teacher_Department.getDepartment());
		
	    
	    adminService.saveDepartments(departmentEntity);
	   
	    return new ResponseEntity<String>(HttpStatus.OK);
	}
	@PutMapping(path="/editDepartment") // Map ONLY POST Requests
	  public @ResponseBody ResponseEntity<String>  editDepartment ( @RequestBody DepartmentModel Teacher_Department)   {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    
	    adminService.editDepartment(Teacher_Department);
	   
	    return new ResponseEntity<String>(HttpStatus.OK);
	  }

	
	@GetMapping(path = "/designation")
	public @ResponseBody Iterable<Teacher_Designation> getAllTeacherDesignation() {
		// This returns a JSON or XML with the users
		return adminService.getAllTeacher_Designation();
	}
	@PostMapping(path="/addDesignations") // Map ONLY POST Requests
	  public @ResponseBody ResponseEntity<String>  addNewDesignation ( @RequestBody DesignationModel Designation)   {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

		Teacher_Designation designationEntity = new Teacher_Designation();

		designationEntity.setDesignation(Designation.getDesignation());
		
	    
	    adminService.saveDesignations(designationEntity);
	   
	    return new ResponseEntity<String>(HttpStatus.OK);
	}
	@PutMapping(path="/editDesignation") // Map ONLY POST Requests
	  public @ResponseBody ResponseEntity<String>  editDesignation ( @RequestBody DesignationModel Designation)   {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    
	    adminService.editDesignation(Designation);
	   
	    return new ResponseEntity<String>(HttpStatus.OK);
	  }
	@GetMapping(path = "/courses")
	public @ResponseBody Iterable<Courses> getAllCourses() {
		// This returns a JSON or XML with the users
		return adminService.getAllCourses();
		
		  }
	@PostMapping(path="/addCourses") // Map ONLY POST Requests
	  public @ResponseBody ResponseEntity<String>  addNewCourse ( @RequestBody CourseModel Courses)   {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

		Courses courseEntity = new Courses();

		courseEntity.setCourse(Courses.getCourse());
		
	    
	    adminService.saveCourses(courseEntity);
	   
	    return new ResponseEntity<String>(HttpStatus.OK);
	}
	@PutMapping(path="/editCourse") // Map ONLY POST Requests
	  public @ResponseBody ResponseEntity<String>  editCourse ( @RequestBody CourseModel Courses)   {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    
	    adminService.editCourse(Courses);
	   
	    return new ResponseEntity<String>(HttpStatus.OK);
	  }

	


}