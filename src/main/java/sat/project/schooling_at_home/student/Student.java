package sat.project.schooling_at_home.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import sat.project.schooling_at_home.Courses.Courses;
import sat.project.schooling_at_home.department.Teacher_Department;

@Entity
public class Student {
	

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;

		private String name;

		private String dob;
		
		private String address;
		
		private String gender;
		
		
		@ManyToOne
		@JoinColumn(name = "department")
		private Teacher_Department department;
		
		@ManyToOne
		@JoinColumn(name = "course")
		private Courses course;

		private String fname;
		
		private Long fnumber;
		
		private String mname;
		
		private Long mnumber;
		
		public Long getFnumber() {
			return fnumber;
		}
		public void setFnumber(Long fnumber) {
			this.fnumber = fnumber;
		}
		public Long getMnumber() {
			return mnumber;
		}
		public void setMnumber(Long mnumber) {
			this.mnumber = mnumber;
		}
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
		
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
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
		public void setEmailid(String email) {
			this.email = email;
		}

		
//		public Integer getId() {
//			return id;
//		}
//
//		public void setId(Integer id) {
//			this.id = id;
//		}
//
//		public String getFirst_n() {
//			return first_name;
//		}
//
//		public void setFirst_name(String first_name) {
//			this.first_name = first_name;
//		}
//
//		public String getLast_name() {
//			return last_name;
//		}
//
//		public void setLast_name(String last_name) {
//			this.last_name = last_name;
//		}
//
//		public Teacher_Designation getDesignation() {
//			return designation;
//		}
//
//		public void setDesignation(Teacher_Designation designation) {
//			this.designation = designation;
//		}
//
//		public Teacher_Department getDepartment() {
//			return department;
//		}
//
//		public void setDepartment(Teacher_Department department) {
//			this.department = department;
//		}
//
//	}


}
