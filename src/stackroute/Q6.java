package stackroute;

import java.util.Scanner;

public class Q6 {
	public void question_6() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = input.charAt(0);
		if(n>=48 && n<=57) {
			System.out.print("Digit");
		}else if(n>=65 && n <=90) {
			System.out.print("Capital Letter");
		}else if(n>=97 && n<=122) {
			System.out.print("Small Letter");
		}else {
			System.out.print("Special Character");
		}
		System.out.println();
	}
}
