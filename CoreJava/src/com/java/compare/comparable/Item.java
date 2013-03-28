package com.java.compare.comparable;

public class Item{
	private String item_Id;
	private String item_Name;
	private Double item_Price;

	public Item(String item_Id, String item_Name, Double item_Price) {
		this.item_Id = item_Id;
		this.item_Name = item_Name;
		this.item_Price = item_Price;
	}

	public String getItem_Id() {
		return item_Id;
	}

	public void setItem_Id(String item_Id) {
		this.item_Id = item_Id;
	}

	public String getItem_Name() {
		return item_Name;
	}

	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}

	public Double getItem_Price() {
		return item_Price;
	}

	public void setItem_Price(Double item_Price) {
		this.item_Price = item_Price;
	}

	public Item(){
		
	}
	
	public int compareTo(Item item) {
		System.out.println("this : " + this.item_Id);
		System.out.println("coming in : " + item.getItem_Id());
		if (this.item_Id.compareTo(item.getItem_Id()) == 0) {
			System.out.println("00000000");
			return 0;
		} else if (this.item_Id.compareTo(item.getItem_Id()) > 0) {
			System.out.println("+++++++");
			return 1;
		} else {
			System.out.println("-------");
			return -1;
		}
	}

}