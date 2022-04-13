package testPackage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void test()
	{
		System.out.println("first test");
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void testTwo()
	{
		System.out.println("second test");
		Assert.assertEquals(false, true);
	}

}
