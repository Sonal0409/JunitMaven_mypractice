package junit5Test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class TestAddMethod {
	
	@DisplayName("add positive numbers")
	@Test
	public void testadd()
	{
		Calculator calc = new Calculator();
		int sum= calc.add(10, 20);
		System.out.println(sum);
	}

	
	  @DisplayName("add negative numbers")
	
	  @Test public void testadd2()
	  {
		  Calculator calc = new Calculator(); 
		  int sum=calc.add(-10, -20); 
		  System.out.println(sum); 
		  }
	 
	
	@Test
	private void testadd3()
	{
		Calculator calc = new Calculator();
		int sum= calc.add(-10, 20);
		System.out.println(sum);
	}
	
	
	
	
	
	
}
