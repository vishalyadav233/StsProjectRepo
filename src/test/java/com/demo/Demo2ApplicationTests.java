package com.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
 
@SpringBootTest
class Demo2ApplicationTests {

	// Junit helps us to make the testing of the Application of the backened if there is the no 
	// frontned present into the application of the application or the frontned present 
	
	
	@Test // this is all the annoations of the j unit framework
	void Test1() {
		System.out.println("from the test 1");
	
	}
	@Test
	void test2 () {
		System.out.println("from test 2 ");
	}
	@BeforeEach
	void beforeEach() {// All database connection code shulod be present into the 
		// Before each test method in order or the run before each test.
		System.out.println("before each test ");
		}
	
	@AfterEach
	void afterEach() {
		System.out.println("After each test in the jUnit ");
	}
	@BeforeAll // this is the Before All method is the Static method in the jUnit 
	static void beforeAll() {
		System.out.println("from the Before All ");
	}
		
		
		
		@AfterAll
	     void afterAllTest() {
			System.out.println("from the All Test");
		}
		
		
		

}
