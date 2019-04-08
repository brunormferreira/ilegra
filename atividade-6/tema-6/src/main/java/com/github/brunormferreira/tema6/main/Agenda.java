package com.github.brunormferreira.tema6.main;

import java.util.List;
import java.util.ArrayList; 

public class Agenda {
	
	private List<Contato> contatos;
	private GerarId gerarId;
	
	public Agenda () {
		this.contatos = new ArrayList<Contato>();
		this.gerarId = new GerarId();
	}
	
	// adicionando contatos
	public boolean addContact(String name) {
		int id = gerarId.gerar();
		Contato contato = new Contato(id, name);
		contatos.add(contato);
		return true;
		
	}
	
	// removendo contatos pelo Id
	public boolean removeContact(int id) {
		Contato contactToRemove = searchId(id);
		if (contactToRemove == null) {
			return false;
		}
		contatos.remove(contactToRemove);
		return true;
	}

	// listando contatos
	public List<Contato> listContacts() {
		return this.contatos;
	}
	
	// procurando contatos pelo nome
	public List<Contato> searchName(String name) {
		List<Contato> contactsFound = new ArrayList<>();
		for(Contato contato: contatos) {
			if(contato.getName().toLowerCase().contains(name.toLowerCase())) {
				contactsFound.add(contato);
			}
		}
		
		return contactsFound;
	}
	
	// procurando contatos pelo id
	public Contato searchId(int id) {
		for (Contato contato: contatos) {
			if (contato.getId() == id) {
				return contato;
			}
		}
		return null;
	}	

}
