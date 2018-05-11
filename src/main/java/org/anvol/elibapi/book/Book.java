package org.anvol.elibapi.book;

import java.util.Set;

import org.anvol.elibapi.author.Author;

public class Book {

    /**
     * Title of a book.
     */
    private String title;

    /**
     * Short description of a book.
     */
    private String type;

    /**
     * Set of authors of a book.
     */
    private Set<Author> authorSet;

    /**
     * default constructor
     */
    public Book() {

    }

    /**
     * @param title
     * @param type
     * @param authorSet
     */
    public Book(String title, String type, Set<Author> authorSet) {
	this.title = title;
	this.type = type;
	this.authorSet = authorSet;
    }

    /**
     * @return the title
     */
    public String getTitle() {
	return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(String title) {
	this.title = title;
    }

    /**
     * @return the type
     */
    public String getType() {
	return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setBookDescription(String type) {
	this.type = type;
    }

    /**
     * @return the authorSet
     */
    public Set<Author> getAuthorSet() {
	return authorSet;
    }

    /**
     * @param authorSet
     *            the authorSet to set
     */
    public void setAuthorSet(Set<Author> authorSet) {
	this.authorSet = authorSet;
    }

}
