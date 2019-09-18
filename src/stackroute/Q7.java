package stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q7 {
	public String question_7(int input) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> ll = new ArrayList<Integer>();
		int r,rev=0,temp,sum=0;
		temp=input;    
		while(temp>0){    
			r=temp%10;
			if(r%2==0)
				sum += r;  
			temp=temp/10;
			ll.add(r);
		}  
		Collections.sort(ll,Collections.reverseOrder());
		sb.append("Sorted numbers \n");
		
		for(Integer i: ll) {
			sb.append(i+" ,");
		}
		sb.append("\n");
		sb.append("sum of even numbers = "+ sum +"\n");
		sb.append(sum>15?"True":"False"+"\n");
		return sb.toString();
		
	}
}
