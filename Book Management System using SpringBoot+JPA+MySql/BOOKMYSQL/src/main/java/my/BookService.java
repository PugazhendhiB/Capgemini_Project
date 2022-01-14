/*
 * @Author Pugazh 
 * JPA Services are avaliable here
 */
package my;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired // for Dependency Injection by spring
	BookRepository bookRepository;

	public void saveOrUpdate(Book book) {
		bookRepository.save(book);

	}

	public void update(Book book, int bookId) {
		bookRepository.save(book);
	}

	public void delete(int id) {
		bookRepository.deleteById(id);
	}

	public List<Book> getAllBooks() {
		List<Book> x = new ArrayList<>();
		bookRepository.findAll().forEach(y -> x.add(y));
		return x;

	}

	public Book getBookById(int id) {
		return bookRepository.findById(id).get();

	}

}
