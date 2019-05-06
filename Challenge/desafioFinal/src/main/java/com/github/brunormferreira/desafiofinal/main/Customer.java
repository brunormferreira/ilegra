package com.github.brunormferreira.desafiofinal.main;

public class Customer {
	private int id = 002;
	private String CNPJ;
	private String name;
	private String business;
	private String area;
	
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
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String Cnpj) {
		CNPJ = Cnpj;
	}
	@Override
	public String toString() {
		return "\nId: "+this.id+"\nCPF: "+this.CNPJ+"\nName: "+this.name+"\nBusiness: "+this.business+"\nArea: "+this.area;
	} 
	
}
