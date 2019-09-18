package stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.*;
import java.io.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class Tests {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	
	@Test
	void question_1_test() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
		Exercise_1 ex1 = new Exercise_1();
		//ex1.question_2();
		System.out.print("25");
		//System.out.println(outContent.toString());
	    assertEquals("hello", outContent.toString());
	}
	@Test
	public void err() {
	    System.err.print("hello again");
	    assertEquals("hello again", errContent.toString());
	}
	@Test
	public void shouldTakeUserInput() {
		Exercise_1 ex1 = new Exercise_1();
		//ex1.question_1();
	    String input = "25";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals("hello", outContent.toString());
	}

}
