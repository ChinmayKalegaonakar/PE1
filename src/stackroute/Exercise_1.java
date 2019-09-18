package stackroute;

import java.util.*;

public class Exercise_1 {
	
	public static void main(String args[]) {
		try {
		Exercise_1 e1 = new Exercise_1();
		int choice = 11;
		Scanner sc =new Scanner(System.in);
		e1.menu_draw();
		while(true) {
			
			choice = sc.nextInt();
			e1.selector(choice);
		}
		}catch(Exception e) {
			System.out.print("error in input");
			System.out.print(e.getMessage());
		}
		
	}
	
			
	public void menu_draw() {
		System.out.print("========================================================\n");
		System.out.print("= 1 QUESTION                   =========================\n");
		System.out.print("= 2 QUESTION                   =========================\n");
		System.out.print("= 3 QUESTION                   =========================\n");
		System.out.print("= 4 QUESTION                   =========================\n");
		System.out.print("= 5 QUESTION                   =========================\n");
		System.out.print("= 6 QUESTION                   =========================\n");
		System.out.print("= 7 QUESTION                   =========================\n");
		System.out.print("= 8 QUESTION                   =========================\n");
		System.out.print("= 9 QUESTION                   =========================\n");
		System.out.print("= 10 QUESTION                  =========================\n");
		System.out.print("= Anything else to EXIT        =========================\n");
		System.out.print("========================================================\n");
	}
	public void selector(int choice) {
		try {
			Scanner sc = new Scanner(System.in);
			int n;
		switch(choice) {
		case 1: n = sc.nextInt();
				System.out.print(question_1(n));break;
		case 2: n = sc.nextInt();
				System.out.print(question_2(n));break;
		case 3: question_3();break;
		case 4: question_4();break;
		case 5: System.out.print(""+question_5());break;
		case 6: question_6();break;
		case 7: question_7();break;
		case 8: question_8();break;
		case 9: question_9();break;
		case 10:question_10();break;
		default: System.out.print("Exiting");quit();break;
		}
		}catch(NullPointerException e) {
			System.out.print("Cause of exception == " );
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException s) {
			System.out.print("Please give index within the length " );
		}catch(Exception e) {
			System.out.print("error in input");
		}
	}
	public String question_1(int n) {
		
		int r,rev=0,temp,sum=0;
		temp=n;    
		while(n>0){    
			r=n%10;
			if(r%2==0)
				sum += r;
			rev=(rev*10)+r;    
			n=n/10;    
		}    
		  if(temp==rev) {
			  if(sum>25)
				  return "The number is a palindrome and is greater than 25";
			  else
				  return "The number is a palindrome but not greater than 25";
		  }else {
			  return "The number is not a palindrome";
		  }
	}
	public String question_2(int n) {
		
		if(n>=20 && n<=30) {
			if(n%2==1)
				return "Tom";
			else
				return "Jerry";
		}else {
			return "Please enter numbers between 20 and 30";
		}
	}
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
	public int question_5() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
			sum += sc.nextInt();
		return sum;
	}
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
	public void question_8() {
		try {
		Scanner sc = new Scanner(System.in);
		int r_number = 57;
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
	public void question_9() {
	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		  if(input == null || input.isEmpty()){
			  System.out.println("empty string");
	        }      
	        String reverse = "";
	        for(int i = input.length() -1; i>=0; i--){
	            reverse = reverse + input.charAt(i);
	        }
	    System.out.print("Output "+reverse);
		
	}
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
	public void quit() {
		System.exit(0);
	}
	
}


