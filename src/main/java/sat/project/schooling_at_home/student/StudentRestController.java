package sat.project.schooling_at_home.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/studentdashboard")
public class StudentRestController {
	
	@Autowired
	StudentService studentService;
	

	
	@GetMapping(path = "/studentProfile")
	public Student  getStudentProfile(){
		return studentService.getStudent();
	}
}
