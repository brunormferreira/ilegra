package com.github.brunormferreira.desafiofinal.main;

public class Item {
	private int itemId;
	private int quantify;
	private float price;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantify() {
		return quantify;
	}
	public void setQuantify(int quantify) {
		this.quantify = quantify;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
    public String toString() {
		return "\nItem Id: "+this.itemId+"\nItem Quantify: "+this.quantify+"\nItem Price: "+this.price; 
	}
}
