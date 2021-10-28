package junit5Test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TaggingTest {
	
	@Test
	@Tag("Smoketest")
	public void test1()
	{
		System.out.println("Smoke test 1");
	}
	@Test
	@Tag("Smoketest")
	public void test2()
	{
		System.out.println("Smoke test 2");
	}
	@Test
	@Tag("Sanitytest")
	public void test3()
	{
		System.out.println("Sanity test 1");
	}
	@Test
	@Tag("Sanitytest")
	public void test4()
	{
		System.out.println("Sanity test 2");
	}
	@Test
	@Tag("Unittest")
	public void test5()
	{
		System.out.println("Unit test 1");
	}
	@Test
	@Tag("Unittest")
	public void test6()
	{
		System.out.println("Unit test 2");
	}

}
