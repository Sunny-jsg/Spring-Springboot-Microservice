package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.StudentEntity;
@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}
