package MavenDEMO.GmailAutomate;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JunitTestcase {
	@Test
	public void testcase1() {
		System.out.println("testcase1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("testcase2");
}
	@Test
	public void testcase3() {
		System.out.println("testcase3");
	}
	@BeforeClass
	public static void setupbeforeclass()throws Exception{
		System.out.println("Beforeclass");
	}
	@AfterClass
	public static void setupafterclass()throws Exception{
		System.out.println("Afterclass");
	}
	@BeforeClass
	public void beforemethod() {
		System.out.println("Before");
	}
	@AfterClass
	public void aftermethod() {
		System.out.println("After");
}
}