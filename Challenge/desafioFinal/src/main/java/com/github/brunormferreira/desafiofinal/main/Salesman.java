package com.github.brunormferreira.desafiofinal.main;

public class Salesman {
	private int id = 001;
	private String CPF;
	private String name;
	private float salary;
	
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String Cpf) {
		CPF = Cpf;
	}
	@Override
	public String toString() {
		return "\nId: "+this.id+"\nCPF: "+this.CPF+"\nName: "+this.name+"\nSalary: "+this.salary;
	} 	
}


