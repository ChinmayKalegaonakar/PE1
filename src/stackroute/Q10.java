package stackroute;

import java.util.Scanner;

public class Q10 {
	public String question_10(int index,String input) {
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		String suffix = input.substring(input.length()-index, input.length());
		for(int i=0;i<index;i++) {
			sb.append(suffix);
		}
		return sb.toString();
	}
}
