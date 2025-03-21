package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.service.StudentService;
import in.ashokit.table.Student;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String loadIndexPages(Model model) {

		M1(model);
		return "index";

	}

	private void M1(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses", service.getCourse());
		model.addAttribute("prefTimings", service.getTiming());
	}

	@PostMapping("/save")
	public String handlesubmitButton(Student s, Model model) {
		boolean isSave = service.saveStudent(s);
		if (isSave) {
			model.addAttribute("msg", "Data Saved...");
		}
		M1(model);
		return "index";
	}
}
