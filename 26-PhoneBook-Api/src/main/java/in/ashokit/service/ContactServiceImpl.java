package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Contact;
import in.ashokit.repo.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public String upsert(Contact contact) {
		contactRepo.save(contact);

		return "Success";
	}

	@Override
	public Contact getbyId(Integer cid) {
		Optional<Contact> byId = contactRepo.findById(cid);
		if (byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		return contactRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if (contactRepo.existsById(cid)) {
			contactRepo.deleteById(cid);
			return "Delete Success";
		} else {
			return "No Record Found";
		}
	}

}
