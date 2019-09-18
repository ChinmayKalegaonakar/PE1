package stackroute;

import java.util.Scanner;

public class Q8 {
	public String question_8(int choice) {
		try {
		int r_number = 57;
			if(choice<r_number) {
				return "Number guessed is less than original number";
			}else if(choice>r_number){
				return "Number guessed is more than original number";
			}else {
				return "Number guessed matches the original number";
			}
		
	}catch(Exception e) {
		System.out.print("Input only numbers");
	}
		return null;
	}
}
