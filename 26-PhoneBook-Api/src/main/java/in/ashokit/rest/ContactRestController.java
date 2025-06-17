package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Contact;
import in.ashokit.service.ContactService;

@RestController
public class ContactRestController {
	@Autowired
	private ContactService contactService;

	@PostMapping("/contact")
	public ResponseEntity<String> createContact(@RequestBody Contact course) {
		String upsert = contactService.upsert(course);
		return new ResponseEntity<String>(upsert, HttpStatus.CREATED);
	}

	@GetMapping("/contact/{cid}")
	public ResponseEntity<Contact> getContact(@PathVariable Integer cid) {
		Contact getbyId = contactService.getbyId(cid);
		return new ResponseEntity<Contact>(getbyId, HttpStatus.OK);
	}

	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getAllContacts() {
		List<Contact> allCourse = contactService.getAllContacts();
		return new ResponseEntity<List<Contact>>(allCourse, HttpStatus.OK);

	}

	@PutMapping("/contact")
	public ResponseEntity<String> updateCourse(@RequestBody Contact contact) {
		String upsert = contactService.upsert(contact);
		return new ResponseEntity<String>(upsert, HttpStatus.OK);
	}

	@DeleteMapping("/contact/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid) {
		String status = contactService.deleteById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
