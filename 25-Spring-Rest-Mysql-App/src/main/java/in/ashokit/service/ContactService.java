package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Contact;

public interface ContactService {
	public String upsert(Contact contact);

	public Contact getbyId(Integer cid);

	public List<Contact> getAllContacts();

	public String deleteById(Integer cid);

}
