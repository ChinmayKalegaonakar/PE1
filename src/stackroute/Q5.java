package stackroute;

import java.util.Scanner;

public class Q5 {
	public int question_5() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
			sum += sc.nextInt();
		return sum;
	}
}
