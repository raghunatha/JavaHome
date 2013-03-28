package com.java.enums;

import com.java.enums.EnumInAClass.NissanModels;

public class test {
	public static void main(String args[]){
		System.out.println(Day.MONDAY);
		
		System.out.println(Months.JANUARY.getValue());
		
		System.out.println(NissanModels.Altima);
		
		EnumInAClass e1 = new EnumInAClass();
		NissanModels n1;
		//n1 = e1.new NissanModels(); --> cannot instantiate the type EnumInAClass.NissanModels
		//System.out.println(e1.NissanModels.A); --> NissanModels cannot be resolved or is not a field
		e1.setModel(NissanModels.Maxima);
		System.out.println(e1.getModel().equals(NissanModels.Maxima));
		
		System.out.println(EnumInAClass.NissanModels.Altima);
		
		System.out.println(ReturningString.A.getText());
	}
}
