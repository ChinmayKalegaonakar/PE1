package stackroute;

import java.util.Scanner;

public class Q9 {
	public String question_9(String input) {
		
		  if(input == null || input.isEmpty()){
			  return "empty string";
	        }      
	        String reverse = "";
	        for(int i = input.length() -1; i>=0; i--){
	            reverse = reverse + input.charAt(i);
	        }
	    return reverse;
		
	}
}
