package com.epam.tatiana_khokholko.jenkinsforstudents.jenkinsforstudents;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsCI {

	@Test
	public void passedTest() {
		Assert.assertTrue(true);
	}

	@Test (dependsOnMethods = "passedTest")
	public void failedTest() {
		System.out.println("This test failed by default.");
		Assert.assertTrue(false);
	}

	@Test (dependsOnMethods = "failedTest", alwaysRun = true)
	public void helloTest() {
		System.out.println("Hello CI.");
	}
}