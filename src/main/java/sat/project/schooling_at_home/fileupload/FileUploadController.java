package sat.project.schooling_at_home.fileupload;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
//@RequestMapping(path = "/teacherdashboard")
public class FileUploadController {
	
	@Autowired
	DBFileStorageService  	dbFileStorageService;
	
	@PostMapping(path="/upload")
	public void uploadFile(@RequestParam("file") MultipartFile file,@RequestParam("department") String department) {
	
		try {
			dbFileStorageService.storeFile(file,department);
			System.out.println("tst");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@GetMapping(path = "/getFilesByDepartment")
	public Iterable<DBFile> getAllStudentsByDepartment(@RequestParam(name="department")String departmentname){
		
		return dbFileStorageService.getFile(departmentname);
	}
	
	 @GetMapping("/downloadFile/{fileId}")
	    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) {
	        // Load file from database
	        Optional<DBFile> dbFile = dbFileStorageService.getFileById(fileId);
DBFile file= dbFile.get();
	        return ResponseEntity.ok()
	                .contentType(MediaType.parseMediaType(file.getFileType()))
	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFileName() + "\"")
	                .body(new ByteArrayResource(file.getFile()));
	    }

}
