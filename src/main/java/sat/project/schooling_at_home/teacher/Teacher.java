package sat.project.schooling_at_home.teacher;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import sat.project.schooling_at_home.department.Teacher_Department;
import sat.project.schooling_at_home.designaion.Teacher_Designation;

@Entity

public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String first_name;

	private String last_name;
	@ManyToOne
	@JoinColumn(name = "designation")
	private Teacher_Designation designation;

	@ManyToOne
	@JoinColumn(name = "department")
	private Teacher_Department department;
	
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Teacher_Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Teacher_Designation designation) {
		this.designation = designation;
	}

	public Teacher_Department getDepartment() {
		return department;
	}

	public void setDepartment(Teacher_Department department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
