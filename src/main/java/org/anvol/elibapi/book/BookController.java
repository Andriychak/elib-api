package org.anvol.elibapi.book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.anvol.elibapi.author.Author;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    public List<Book> getAllBooks() {
	Author author = new Author();
	author.setName("Author name");
	Set<Author> authorSet = new HashSet<Author>();

	authorSet.add(author);

	return Arrays.asList(new Book("Кобзар", "Вірші", authorSet));
    }

}
