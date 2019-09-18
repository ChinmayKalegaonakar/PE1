package stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q7 {
	public void question_7() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
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
		System.out.println("Sorted numbers ");
		for(Integer i: ll) {
			System.out.print(i+" ,");
		}
		System.out.println();
		System.out.println("sum of even numbers = "+ sum );
		System.out.print(sum>15?"True":"False");
		System.out.println();
		
	}
}
