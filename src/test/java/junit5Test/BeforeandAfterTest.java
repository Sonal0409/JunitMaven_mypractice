package junit5Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeandAfterTest {
	
	Calculator calc;
	
	@BeforeAll
	 public void startDB()
	{
		System.out.println("this code will start DB");
		
	}
	
	@AfterAll
	 public void stopDB()
	{
		System.out.println("this code will stop DB");
		
	}
	
	@BeforeEach
	public void init()
	{
		calc = new Calculator();
		System.out.println("this code will execute before every test method");
		
	}
	

	@DisplayName("add positive numbers")
	@Test
	public void testadd()
	{
		int sum= calc.add(10, 20);
		System.out.println(sum);
	}

	
	  @DisplayName("add negative numbers")
	
	  @Test public void testadd2()
	  {
	
		  int sum=calc.add(-10, -20); 
		  System.out.println(sum); 
		  }
	  
	@AfterEach
	public void tearDown()
	{
		System.out.println("this code will execute after every test method");
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
