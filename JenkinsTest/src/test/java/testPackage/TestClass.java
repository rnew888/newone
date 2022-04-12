package testPackage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void test()
	{
		System.out.println("added a final");
		Assert.assertEquals(false, false);
	}

}
