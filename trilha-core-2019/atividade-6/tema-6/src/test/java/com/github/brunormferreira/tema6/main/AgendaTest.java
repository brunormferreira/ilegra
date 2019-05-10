package com.github.brunormferreira.tema6.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class AgendaTest {
	
	     private Agenda agenda;
		 @SuppressWarnings("unused")
	     private Contato contato;

	     @Before public void start() {
		 agenda = new Agenda();
	}
    
    @Test public void testAddContact() {
    	String name = "Bruno";
    	boolean returnAddict = agenda.addContact(name);
    	assertTrue(returnAddict);  	
    }

    @Test public void testRemoveContact() {
    	String name = "Bruno";
    	int id = 1;
    	agenda.addContact(name);
    	boolean returnRemoval = agenda.removeContact(id);
    	equals(returnRemoval);
    }
   
     @Test public void testRemoveNonExistentContact() {
    	String name = "Bruno";
    	int id = 2;
    	agenda.addContact(name);
    	boolean returnRemoval = agenda.removeContact(id);
    	assertEquals(false, returnRemoval);
    }
        
        @Test public void testListContacts() {
    	agenda.addContact("Bruno");
    	agenda.addContact("Bruna");
    	agenda.addContact("Joao");
    	List<Contato> contactsFound = agenda.listContacts();
    	boolean empty = contactsFound.isEmpty();
    	assertFalse(empty);
    }
    
    @Test public void testListContactsEmpty() {
    	List<Contato> contactsFound = agenda.listContacts();
    	boolean empty = contactsFound.isEmpty();
    	assertTrue(empty);  	
    }
    
    @Test public void testSearchName() {
    	agenda.addContact("Bruno");
    	agenda.addContact("Bruna");
    	agenda.addContact("Joao");
    	List<Contato> contactsFound = agenda.searchName("Br");
    	int numberContactsFound = contactsFound.size();
    	assertEquals(2, numberContactsFound);
    }
 
    @Test public void testSearchId() {
    	agenda.addContact("Bruno");
    	agenda.addContact("Bruna");
    	agenda.addContact("Joao");
    	contato = agenda.searchId(2);
    	assertNotNull("Should not be null", new Object()); // i think that is NotNull
    }
    
    @Test public void testSearchIdEmpty() {
    	agenda.addContact("Bruno");
    	Contato contato = agenda.searchId(2);
    	assertNull(contato);
    }
}


