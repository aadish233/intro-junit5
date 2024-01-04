package guru.springframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
	private Greeting greeting;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before All - Only called once");
	}
	
	@BeforeEach
	void setup() {
		System.out.println("In before each...");
		greeting = new Greeting();
	}

	@Test
	void testHelloWorld() {
		System.out.println(greeting.helloWorld());
	}

	@Test
	void testHelloWorldString() {
		System.out.println(greeting.helloWorld("Aadish"));
	}
	
	@AfterEach
	void tearUp() {
		System.out.println("Inside After Each...");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("After All - Only called once");
	}

}
