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
				Q1 question1 = new Q1();
				System.out.print(question1.question_1(n));break;
		case 2: n = sc.nextInt();
				Q2 question2 = new Q2();
				System.out.print(question2.question_2(n));break;
		case 3: Q3 question3 = new Q3();question3.question_3();break;
		case 4: Q4 question4 = new Q4();question4.question_4();break;
		case 5: Q5 question5 = new Q5();System.out.print(""+question5.question_5());break;
		case 6: Q6 question6 = new Q6();question6.question_6();break;
		case 7: Q7 question7 = new Q7();question7.question_7();break;
		case 8: Q8 question8 = new Q8();question8.question_8();break;
		case 9: Q9 question9 = new Q9();question9.question_9();break;
		case 10:Q10 question10 = new Q10();question10.question_10();break;
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


