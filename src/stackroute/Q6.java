package stackroute;

import java.util.Scanner;

public class Q6 {
	public String question_6(String input) {
		
		
		int n = input.charAt(0);
		if(n>=48 && n<=57) {
			return "Digit";
		}else if(n>=65 && n <=90) {
			return "Capital Letter";
		}else if(n>=97 && n<=122) {
			return "Small Letter";
		}else {
			return "Special Character";
		}
	}
}
