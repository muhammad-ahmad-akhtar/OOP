package com.library.Book;

import com.library.Person.*;
import com.library.Date.*;

public class Book{
	private String title;
	private String issn;
	private Date publicationDate;
	private Person author;

	public Book (String title, String issn, Date publicationDate, Person author) {
		this.title = title;
		this.issn = issn;
		this.publicationDate = publicationDate;
		this.author = author;
	}

	public Book(Book other) {
		this.title = other.title;
		this.issn = other.issn;
		this.publicationDate = other.publicationDate;
		this.author = other.author; 
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) { 
			return false; 
		}

		if (!(obj instanceof Book)) { 
			return false; 
		}

		Book other = (Book) obj;

		return this.title.equals(other.title) && this.issn.equals(other.issn) && this.issn.equals(other.issn) && this.publicationDate.equals(other.publicationDate) && this.author.equals(other.author);
	}

	public void showBookDetails() {
		System.out.printf("Book: %s%nISSN:%s%n", this.title, this.issn);
		this.author.showPersonDetails();
		this.publicationDate.showDate();
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getTitle() {
		return this.title;
	}

	public String getIssn() {
		return this.issn;
	}

}