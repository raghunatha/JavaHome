package com.java.exceptionHandling4;

public class ShoppingCart {
	
	public void purchase() throws ProspectException{
		
		try{
			System.out.println(5/0);
		}catch (Exception e) {

			//System.out.println("Hello");
         throw new ProspectException("There is a Problem. Please try later");
		}
		
	}

}
