package org.anvol.elibapi.author;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.anvol.elibapi.book.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @RequestMapping("/authors")
    public List<Author> getAllAuthors() {
	return Arrays.asList(new Author("Тарас Шевченко", new HashSet<Book>()),
		new Author("Іван Франко", new HashSet<Book>()),
		new Author("Леся Українка", new HashSet<Book>()),
		new Author("Всеволод Нестайко", new HashSet<Book>()),
		new Author("Павло Тичина", new HashSet<Book>()));
    }

}
