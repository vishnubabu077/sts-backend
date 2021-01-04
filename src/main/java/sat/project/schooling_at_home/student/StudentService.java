package sat.project.schooling_at_home.student;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import sat.project.schooling_at_home.security.UserDetailsImpl;

@Service


public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student getStudent() {
		UserDetailsImpl principal = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Student student =studentRepository.findAllByEmailIgnoreCase(principal.getEmail());
		
		
		
		return student;
	}

}
