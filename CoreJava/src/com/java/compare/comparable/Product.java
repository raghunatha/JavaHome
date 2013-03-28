package com.java.compare.comparable;

public class Product implements Comparable<Product> {
	private String product_Id;
	private String product_Name;
	private Double product_Price;

	public Product(String product_Id, String product_Name, Double product_Price) {
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.product_Price = product_Price;
	}

	public String getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(String product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public Double getProduct_Price() {
		return product_Price;
	}

	public void setProduct_Price(Double product_Price) {
		this.product_Price = product_Price;
	}
	
	 public int compareTo(Product product) { 	 
		 System.out.println("this : " + this.product_Id);
		 System.out.println("coming in : " + product.getProduct_Id());
	        if(this.product_Id.compareTo(product.getProduct_Id()) == 0){
	        	System.out.println("00000000");
	        	return 0;
	 }else if(this.product_Id.compareTo(product.getProduct_Id()) > 0){
		 System.out.println("+++++++");
	        	return 1;
	 }else{
		 System.out.println("-------");
	        	return -1;	      
	    }	
	 }
	 
	 
	 
}