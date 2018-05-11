package org.anvol.elibapi.author;

import java.util.Set;

import org.anvol.elibapi.book.Book;

public class Author {

    /**
     * Full name of an author
     */
    private String name;

    /**
     * 
     */
    private Set<Book> books;

    /**
     * default constructor
     */
    public Author() {

    }

    /**
     * @param name
     * @param books
     */
    public Author(String name, Set<Book> books) {
	this.name = name;
	this.books = books;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the bookSet
     */
    public Set<Book> getBooks() {
	return books;
    }

    /**
     * @param books
     *            the bookSet to set
     */
    public void setBooks(Set<Book> books) {
	this.books = books;
    }

}
