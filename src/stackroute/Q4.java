package stackroute;

import java.util.Scanner;

public class Q4 {
	public void question_4() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n ;
		for(int i = 0; i < n ;i++) {
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print((i+1)+" ");
			}
		}
		System.out.println();
	}
}
