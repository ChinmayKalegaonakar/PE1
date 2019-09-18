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
			int n; int[] intarray = new int[100];int count=0;
			String input;
		switch(choice) {
		case 1: n = sc.nextInt();
				Q1 question1 = new Q1();
				System.out.print(question1.question_1(n));break;
		case 2: n = sc.nextInt();
				Q2 question2 = new Q2();
				System.out.print(question2.question_2(n));break;
		case 3: input = sc.nextLine();
				Q3 question3 = new Q3();
				String[] ans = question3.question_3(input);
				for(String s:ans) {System.out.print(s);};break;
		case 4: n = sc.nextInt();Q4 question4 = new Q4();
				int[] array = question4.question_4(n);
				System.out.println(array.toString()+" ");
				for(Integer i:array) {System.out.print(i+" ");};break;
		case 5:while(sc.hasNextInt())
					intarray[count++]=sc.nextInt();
				Q5 question5 = new Q5();
				System.out.print(""+question5.question_5(intarray));break;
		case 6: input = sc.nextLine(); Q6 question6 = new Q6();
				System.out.print(question6.question_6(input));break;
		case 7: n = sc.nextInt();
				Q7 question7 = new Q7();System.out.print(question7.question_7(n));break;
		case 8: Q8 question8 = new Q8();while(true) {
				n = sc.nextInt();
				System.out.print(question8.question_8(n));
				if(question8.question_8(n).equalsIgnoreCase("Number guessed matches the original number")) {break;}
				}break;
		case 9: input = sc.nextLine();Q9 question9 = new Q9();
				System.out.print(" output "+question9.question_9(input));break;
		case 10:input = sc.nextLine();n = sc.nextInt();
				Q10 question10 = new Q10();System.out.print(question10.question_10(n,input));break;
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

	
	
	
	
	
	
	
	
	
	
	public void quit() {
		System.exit(0);
	}
	
}


