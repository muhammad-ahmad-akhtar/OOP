package com.library.LibraryApp;

import com.library.Library.*;
import com.library.Book.*;
import com.library.Incharge.*;
import com.library.Staff.*;
import com.library.Date.*;
import com.library.Address.*;
import com.library.Person.*;

public class LibraryApp {
	
	public static void main(String[] args) {
		Date date = new Date(9, 3, 2025);
		Address address = new Address("Lahore", "Raiwand Road");
		Person person = new Person("Ahmad", address);
		Book book = new Book("Java How to Program", "1234556755", date, person);
		Incharge incharge = new Incharge("Librarian", person);
		Staff staff = new Staff("IT Guy", person);
		Library cui = new Library("Comsats Lahore", book, incharge, staff);
		cui.showLibraryDetails();
	}

}