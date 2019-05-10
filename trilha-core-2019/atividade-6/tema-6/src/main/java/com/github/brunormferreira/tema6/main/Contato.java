package com.github.brunormferreira.tema6.main;

public class Contato {
	private int id;
	private String name;
	
	// Construtor 
	public Contato(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//Get e Set dos privates
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "\nId: "+this.id+"\nName "+this.name+"\n ";
	} 	
}
