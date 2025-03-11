package com.library.Library;

import com.library.Incharge.*;
import com.library.Staff.*;
import com.library.Book.*;

public class Library {
	private String name;
	private Book book;
	private Incharge incharge;
	private Staff staff;

	public Library (String name, Book book, Incharge incharge, Staff staff) {
		this.name = name;
		this.book = book;
		this.incharge = incharge;
		this.staff = staff;
	}
	
	public Library (Library other) {
		this.name = other.name;
		this.book = other.book;
		this.incharge = other.incharge;
		this.staff = other.staff;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) { 
			return false; 
		}

		if (!(obj instanceof Library)) { 
			return false; 
		}

		Library other = (Library) obj;

		return this.name.equals(other.name) && this.book.equals(other.book) && this.incharge.equals(other.incharge) && this.staff.equals(other.staff);
	}

	public void showLibraryDetails() {
		System.out.printf("Library: %s%n\n", this.name);
		this.book.showBookDetails();
		System.out.println();
		this.incharge.showInchargeDetails();
		System.out.println();
		this.staff.showStaffDetails();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}