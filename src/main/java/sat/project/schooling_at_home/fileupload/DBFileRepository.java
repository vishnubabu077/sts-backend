package sat.project.schooling_at_home.fileupload;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {
public Iterable<DBFile> findAllByDepartmentId(Integer department);
}
