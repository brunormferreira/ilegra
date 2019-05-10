package com.github.brunormferreira.desafiofinal.main;

import java.util.List;

public class Sales {
	private int id = 003;
	private int saleId;
	private String salesmanName;
	private List<Item> itensList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public List<Item> getListaDeItens() {
		return itensList;
	}
	public void setListaDeItens(List<Item> listaDeItens) {
		this.itensList = listaDeItens;
	}
	public String getSalesmanName() {
		return salesmanName;
	}
	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}
	@Override
    public String toString() {
		return "\nId: "+this.id+"\nSale Id: "+this.saleId+"\nSalesman Name: "+this.salesmanName+"\nLista de Itens: "
    +this.itensList;
    }
	

} 