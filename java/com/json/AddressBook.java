package com.json;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	public static void main(String[] args) {

		System.out.println("**Welcome to Address Book**");

		/* Arraylist is used to store data/contacts */

		List<contacts> contacts = new ArrayList<>();
		NewAddressBook ab = new NewAddressBook();
		Contacts newContact = new Contacts("Rani", "Dhumma", "xyz", "Solapur", "Maharashtra", 410004,
				994445555, "@gmail.com");

		contacts.add(newContact);

		ab.addContact(contacts);
		System.out.println(contacts);

	}
}
