package com.github.brunormferreira.tema6.main;

import java.util.Scanner;
import java.util.List;

public class Main {

	private static Agenda agenda = new Agenda();
	private static Scanner dataEntry = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		String menuChoice = "";
		while (!menuChoice.equals("0")) {
			printChoices();
			menuChoice = dataEntry.next();
			switch (menuChoice) {
			case "1":
				addContact();
				break;

			case "2":
				removeContacts();
				break;

			case "3":
				listContacts();
				break;
				
			case "4":
				searchName();
				break;
				
			case "5":
				searchId();
				break;
				
			case "0":
				System.exit(0);
			}
		}
	}

	private static void printChoices() {
		System.out.println("Select your choice!" + 
		                   "\n1 - Add contacts." +
		                   "\n2 - Remove contacts." + 
		                   "\n3 - List contacts." +
		                   "\n4 - Search contact by name." + 
		                   "\n5 - Search contact by id." + 
		                   "\n0 - Exit.");
	}

	private static void addContact() {
		System.out.println("Enter the name of the contact to be added:");
		String name = dataEntry.next();
		agenda.addContact(name);
	}

	private static void removeContacts() {
		System.out.println("Enter the Id of the contact to be removed:");
		try {
			int idContact = dataEntry.nextInt();
			boolean removed = agenda.removeContact(idContact);
			if (removed) {
				    System.out.println("The contact has been removed.");
			} else {
				    System.out.println("The contact doesn't exist.");
			}
	} catch(Exception e) {
				System.out.println("Id informed is not valid.");
		}	
			
	}
	
	private static void listContacts() {
		List<Contato> contacts = agenda.listContacts();
		if (contacts.isEmpty()) {
			System.out.println("No contacts added yet.");
			return;
		}
		for(Contato contact: contacts) {
			System.out.println(contact.toString());
		}
	}
	
	private static void searchName() {
		System.out.println("Enter the contacts name:");
		String name = dataEntry.next();
		List<Contato> contactsFound = agenda.searchName(name);
		if (contactsFound.isEmpty()) {
			System.out.println("\nNo contacts found.");
			
		} else {	
			for(Contato contact: contactsFound) {
				System.out.println(contact.toString());
			}
		}
		
	}
	
	private static void searchId() {
		System.out.println("Enther the contacts id:");
		try {
			int idContato = dataEntry.nextInt();
			Contato contato = agenda.searchId(idContato);	
			if (contato == null) {
				System.out.println("Contacts not found.");
			} else {
				System.out.println(contato.toString());
			}
		} catch(Exception e) {
			    System.out.println("Id is not valid.");
		
		}
	}

}
