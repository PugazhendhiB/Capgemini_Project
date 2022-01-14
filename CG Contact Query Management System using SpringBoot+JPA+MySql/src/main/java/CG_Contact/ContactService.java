package CG_Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;

	public List<Contact> findAll() {
		List<Contact> contacts = new ArrayList<Contact>();
		contactRepository.findAll().forEach(x -> contacts.add(x));
		return contacts;
	}

	public Contact getContactById(int id) {
		return contactRepository.findById(id).get();
	}

	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
	}

	public Contact updateContact(int id, Contact contact) {
		Contact updatedContact = contactRepository.findById(id).orElse(null);
		updatedContact.setName(contact.getName());
		updatedContact.setEmail(contact.getEmail());
		updatedContact.setCountry(contact.getCountry());
		return contactRepository.save(updatedContact);
	}

	public void delete(int id) {
		Optional<Contact> product = contactRepository.findById(id);

		if (product.isPresent())
		{
			contactRepository.deleteById(id);

		}
	}

	public List<Contact> findByNameEndWithMID(String mailid) {
		System.out.println("!!!!!@Query is WORKING!!!!!");

		var contacts = (List<Contact>) contactRepository.findByNameEndwithMailId(mailid);
		return contacts;
	}

}
