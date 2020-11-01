package sat.project.schooling_at_home.teacherdashboard;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sat.project.schooling_at_home.Courses.CoursesRepository;
import sat.project.schooling_at_home.student.Student;
import sat.project.schooling_at_home.student.StudentModel;
import sat.project.schooling_at_home.student.StudentRepository;


@Service

public class TeacherDashboardService {

		@Autowired
		StudentRepository studentRepository;
		
		@Autowired
		CoursesRepository coursesRepository;
		
		public Iterable<Student>  getAllStudents()
		{
			 return studentRepository.findAll();
		}
		
		public Iterable<Student>  getAllStudentsByDepartment(String dep)
		{
			 return studentRepository.findAllByDepartmentDepartmentIgnoreCase(dep);
		}
		
		public Student  saveStudents(Student student)
		{
			 return studentRepository.save(student);

	    }
		
		public Student  editStudents(StudentModel student )
		{
			
		Optional<Student> studentFromRepoOptional=studentRepository.findById(student.getId());
		if(studentFromRepoOptional.isPresent()) {
		 Student studentFromRepo = studentFromRepoOptional.get();
		 studentFromRepo.setName(student.getName());
		 studentFromRepo.setDob(student.getDob());
		 studentFromRepo.setAddress(student.getAddress());
		 studentFromRepo.setGender(student.getGender());
		 studentFromRepo.setDepartment(student.getDepartment());
		 studentFromRepo.setCourse(student.getCourse());
		 studentFromRepo.setFname(student.getFname());
		 studentFromRepo.setFnumber(student.getFnumber());
		 studentFromRepo.setMname(student.getMname());
		 studentFromRepo.setMnumber(student.getMnumber());
		 studentFromRepo.setBloodgroup(student.getBloodgroup());
		 studentFromRepo.setEmailid(student.getEmail());
		 return studentRepository.save(studentFromRepo);
		}
		  return null;
		    
}
}
