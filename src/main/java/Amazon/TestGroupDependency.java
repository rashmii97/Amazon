package AmazonPractice;

import org.testng.annotations.Test;

public class TestGroupDependency {
	
    @Test(groups = "Smoke")
	public void test1() {
    	System.out.println("Smoke");
	}
    @Test(groups = "Regression", alwaysRun = true) 
	public void test2() {
		System.out.println(5/0);
	}
    @Test(groups = "Smoke") 
	public void test3() {
		System.out.println("Smoke");
	}
    @Test(dependsOnGroups = "Regression")
	public void test0() {
		System.out.println("Main test");
	}
}
