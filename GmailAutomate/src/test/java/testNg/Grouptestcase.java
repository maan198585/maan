package testNg;

import org.testng.annotations.Test;

public class Grouptestcase {
	@Test(groups= {"functionaltesting","smoketesting"})
	public void testcase1() {
		System.out.println("Testcase1");
		
	}
	@Test(groups= {"regressiontesting","smoketesting"})
	public void testcase2() {
		System.out.println("Testcase2");
}
	@Test(groups= {"regressiontesting","sanitytesting"})
	public void testcase3() {
		System.out.println("Testcase3");
		
	}
}