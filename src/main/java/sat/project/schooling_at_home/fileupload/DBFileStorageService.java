package sat.project.schooling_at_home.fileupload;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import sat.project.schooling_at_home.department.TeacherDepartmentRepository;
import sat.project.schooling_at_home.department.Teacher_Department;

@Service
public class DBFileStorageService {

    @Autowired
    private DBFileRepository dbFileRepository;
    
    @Autowired
    private TeacherDepartmentRepository teacher_Department_repo;

    public DBFile storeFile(MultipartFile file, String department) throws IOException {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

   
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
              //  throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }
            Teacher_Department departmentFromDb = teacher_Department_repo.findByDepartment(department);

            DBFile dbFile = new DBFile(fileName, file.getContentType(), file.getBytes(),departmentFromDb);

            return dbFileRepository.save(dbFile);
        
    }

    public Iterable<DBFile> getFile(String department) 
    {
    	
    	Teacher_Department departmentFromDb = teacher_Department_repo.findByDepartment(department);

        return dbFileRepository.findAllByDepartmentId(departmentFromDb.getId());
                //.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }
    

    public Optional<DBFile> getFileById(String id) 
    {
    	
    	//Teacher_Department departmentFromDb = teacher_Department_repo.findByDepartment(department);

        return dbFileRepository.findById(id);
                //.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }
}
