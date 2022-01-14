package CG_Contact;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

	@Query("select c from Contact c where c.email like %?1")
	List<Contact> findByNameEndwithMailId(String mailid);

}
