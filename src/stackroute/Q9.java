package stackroute;

import java.util.Scanner;

public class Q9 {
	public void question_9() {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		  if(input == null || input.isEmpty()){
			  System.out.println("empty string");
	        }      
	        String reverse = "";
	        for(int i = input.length() -1; i>=0; i--){
	            reverse = reverse + input.charAt(i);
	        }
	    System.out.print("Output "+reverse);
		
	}
}
