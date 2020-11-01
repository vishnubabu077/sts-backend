package sat.project.schooling_at_home.department;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "TEACHER_DEPARTMENT" )
@Entity
public class Teacher_Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String department;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
