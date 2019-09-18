package stackroute;

import java.util.Scanner;

public class Q8 {
	public void question_8() {
		try {
		Scanner sc = new Scanner(System.in);
		int r_number = (int)Math.random()*100+1;
		int choice = 0;
		while(choice!=r_number) {
			choice = sc.nextInt();
			if(choice<r_number) {
				System.out.println("Number guessed is less than original number");
			}else if(choice>r_number){
				System.out.println("Number guessed is more than original number");
			}else {
				System.out.println("Number guessed matches the original number");break;
			}
		}
	}catch(Exception e) {
		System.out.print("Input only numbers");
	}
	}
}
