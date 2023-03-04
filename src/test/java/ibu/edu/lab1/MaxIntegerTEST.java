package ibu.edu.lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ibu.edu.lab1.MaxInteger;

class MaxIntegerTEST {
	
	static int[] numbers;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		numbers = MaxInteger.readNumbers("C:\\Users\\Benjamin Peljto\\Desktop\\text.txt");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		numbers = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(999,MaxInteger.findMax(numbers));
	}
	
	@Test
	void testMaxIntegerNegative() {
		assertNotEquals(756,MaxInteger.findMax(numbers));
	}

}
