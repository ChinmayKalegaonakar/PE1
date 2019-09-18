package stackroute;

import java.util.Scanner;

public class Q3 {
	public String[] question_3(String input) {
		
		int count = 0;
		String s = input.toLowerCase();
		int len = s.length();
		String[] output = new String[len];
		for(int i = 0 ; i<len ; i++) {
			if((int)s.charAt(i)<97 || (int)s.charAt(i)>124) {
				output[count++]=s.charAt(i)+" - Not an alphabet";
			}else if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ) {
				output[count++]=s.charAt(i)+" - Vowel";
			}else {
				output[count++]=s.charAt(i)+" - Consonant";
			}
		}
		return output;
	}

}
