package CG_Contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;

	@PostMapping("/contactcreate")
	private String saveContact(@RequestBody Contact c) {
		contactService.saveContact(c);
		return "The Contact which has been added is as follows...." + c.toString();
	}

	@GetMapping("/contactget/{id}")
	private Contact getContact(@PathVariable int id) {
		return contactService.getContactById(id);

	}

	@GetMapping("/productallget")
	private List<Contact> getAllProducts() {
		return contactService.findAll();
	}

	@DeleteMapping("/productdelete/{id}")
	private void deleteProduct(@PathVariable int id) {

		contactService.delete(id);

	}

	@GetMapping("/showCotactsendwithgmail")
	public List<Contact> findCitiesNameEndsWith(@RequestParam String mi) {

		List<Contact> c = (List<Contact>) contactService.findByNameEndWithMID(mi);

		return c;
	}

}
