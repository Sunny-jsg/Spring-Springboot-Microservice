package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import in.ashokit.entity.StudentEntity;
import in.ashokit.repository.StudentRepo;
import in.ashokit.table.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;

	public boolean saveStudent(Student student) {
		System.out.println(student);
		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties(student, entity);
		entity.setTimings(Arrays.toString(student.getTimings()));
		System.out.println(entity);
		repo.save(entity);
		return true;
	}

	public List<String> getCourse() {
		return Arrays.asList("Java", "Phython", "AWS", "DevOps");
	}

	public List<String> getTiming() {
		return Arrays.asList("Morning", "AfterNoon", "Evening");
	}

}
