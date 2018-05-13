package org.anvol.elibapi.book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.anvol.elibapi.author.Author;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @RequestMapping("/books")
    public List<Book> getAllBooks() {

	return Arrays.asList(new Book("Кобзар", "Вірші", new HashSet<Author>()),
		new Book("Незвичайні пригоди в лісовій школі", "Роман",
			new HashSet<Author>()),
		new Book("Лісова пісня", "Поема", new HashSet<Author>()),
		new Book("Украдене щастя", "Повість", new HashSet<Author>()),
		new Book("Незнайомка з країни Сонячних Зайчиків", "Роман",
			new HashSet<Author>()),
		new Book("Лис Микита", "Поема", new HashSet<Author>()),
		new Book("Бояриня", "Поема", new HashSet<Author>()),
		new Book("Тореадори з Васюківки", "Роман",
			new HashSet<Author>()),
		new Book("В країні Місячних Зайчиків", "Роман",
			new HashSet<Author>()));
    }

}
