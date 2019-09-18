//package tests;
package tests;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.*;
import java.io.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import stackroute.*;

class Tests {
	
	
	@Test
	void question_1_test() {
		Q1 q = new Q1();
	    assertEquals("Palindrome test",q.question_1(12345),"The number is not a palindrome");
	}
	@Test
	void question_2_test() {
		Q2 q = new Q2();
	    assertEquals("Tom and Jerry test",q.question_2(40),"Please enter numbers between 20 and 30");
	}
	@Test
	void question_3_test() {
		Q3 q = new Q3();
		String[] ans = {"a - Vowel","b - Consonant","c - Consonant","2 - Not an alphabet"};
	    assertEquals("vowel test",q.question_3("abc2"),ans);
	}
	@Test
	void question_4_test() {
		Q4 q = new Q4();
		int[] ans = {1,2,2,3,3,3,4,4,4,4};
	    assertEquals("repeating number","[I@1e67a849",q.question_4(4).toString());
	}
	@Test
	void question_5_test() {
		Q5 q = new Q5();
		int[] ans = {1,2,3,4,5};
	    assertEquals("Array sum",q.question_5(ans),15);
	}
	@Test
	void question_6_test() {
		Q6 q = new Q6();
	    assertEquals("Digit or character",q.question_6("A"),"Capital Letter");
	}
	@Test
	void question_7_test() {
		Q7 q = new Q7();
	    assertEquals("sort",q.question_7(12345),"Sorted numbers \n" + 
	    		"5 ,4 ,3 ,2 ,1 ,\n" + 
	    		"sum of even numbers = 6\n" + 
	    		"False\n");
	}
	@Test
	void question_8_test() {
		Q8 q = new Q8();
	    assertEquals("random number",q.question_8(57),"Number guessed matches the original number");
	}
	@Test
	void question_9_test() {
		Q9 q = new Q9();
	    assertEquals("random number",q.question_9("chinmay"),"yamnihc");
	}
	@Test
	void question_10_test() {
		Q10 q = new Q10();
	    assertEquals("random number",q.question_10(2,"chinmay"),"chinmayayay");
	}
	

}
