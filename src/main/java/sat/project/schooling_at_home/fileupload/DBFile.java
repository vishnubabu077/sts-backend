package sat.project.schooling_at_home.fileupload;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import sat.project.schooling_at_home.department.DepartmentModel;
import sat.project.schooling_at_home.department.Teacher_Department;

@Entity
@Table(name = "FILE_STORAGE")
public class DBFile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String fileName;
    private String fileType;

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public Teacher_Department getDepartment() {
		return department;
	}

	public void setDepartment(Teacher_Department department) {
		this.department = department;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}


    
    @ManyToOne
	@JoinColumn(name = "department")
	private Teacher_Department department;


    @Lob
    private byte[] file;

    public DBFile() {

    }

    public DBFile(String fileName, String fileType, byte[] data,Teacher_Department department) {
        this.fileName = fileName;
       
        this.file = data;
        this.department=department;
    }

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

    // Getters and Setters (Omitted for brevity)
}