package stackroute;

import java.util.Scanner;

public class Q3 {
	public void question_3() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String s = input.toLowerCase();
		int len = s.length();
		for(int i = 0 ; i<len ; i++) {
			if((int)s.charAt(i)<97 || (int)s.charAt(i)>124) {
				System.out.println(s.charAt(i)+" - Not an alphabet");
			}else if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ) {
				System.out.println(s.charAt(i)+" - Vowel");
			}else {
				System.out.println(s.charAt(i)+" - Consonant");
			}
		}
		System.out.println();
	}

}
