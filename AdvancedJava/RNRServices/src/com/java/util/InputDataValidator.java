package com.java.util;

import org.apache.commons.lang3.StringUtils;

public class InputDataValidator {
	
	//Business rules specific validations And common server side validations are done here
	private static boolean validateEmptyInput(final String inputData){		
		boolean isValidInput = false;
		if(StringUtils.isNotBlank(inputData) && StringUtils.isNotEmpty(inputData)){
			isValidInput = true;
		}		
		return isValidInput;
	}
	
	private static boolean validateInputLength(final String inputData, final int length){		
		boolean isValidLength = false;
		if(StringUtils.length(inputData) >= length){
			isValidLength = true;
		}		
		return isValidLength;
	}
	
	public static String validate(String inputData, final int length ){		
		String message = Constants.MESSAGE_SUCCESS;
				
		if(validateEmptyInput(inputData)){			
			if(validateInputLength(inputData, length)){
				return message;
			}else{
				message = "length should be atleast " + length + " characters.";
				return message;
			}
		}else{
			message = "should not be empty.";
			return message;
		}
		
	}

}
