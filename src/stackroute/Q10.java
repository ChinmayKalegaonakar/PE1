package stackroute;

import java.util.Scanner;

public class Q10 {
	public void question_10() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int index = sc.nextInt();
		String suffix = input.substring(input.length()-index, input.length());
		System.out.print(input);
		for(int i=0;i<index;i++) {
			System.out.print(suffix);
		}
	}
}
