package sat.project.schooling_at_home.student;

import sat.project.schooling_at_home.Courses.Courses;
import sat.project.schooling_at_home.department.Teacher_Department;
import sat.project.schooling_at_home.designaion.Teacher_Designation;

public class StudentModel {
	private Integer id;

	private String name;

	private String dob;
	
	private String address;
	
	private String gender;
	

	private Teacher_Department department;
	
	private Courses course;
	
	private String fname;
	
	private Long fnumber;
	
	private String mname;
	
	private Long mnumber;
	
	private String bloodgroup;
	
	private String email;
	
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Teacher_Department getDepartment() {
		return department;
	}
	public void setDepartment(Teacher_Department department) {
		this.department = department;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Long getFnumber() {
		return fnumber;
	}
	public void setFnumber(Long fnumber) {
		this.fnumber = fnumber;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Long getMnumber() {
		return mnumber;
	}
	public void setMnum(Long mnumber) {
		this.mnumber = mnumber;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	



}
