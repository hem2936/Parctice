package org.tests;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({day1.class,Day2.class})

public class Runner {
	
	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(day1.class,Day2.class);
		
		int runCount = runClasses.getRunCount();
		System.out.println(runCount);

		
		long runTime = runClasses.getRunTime();
		System.out.println(runTime);
		
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println(ignoreCount);
		
		List<Failure> failures = runClasses.getFailures();
		System.out.println(failures);
		
		for (Failure failure : failures) {
			System.out.println(failure);
			
		}
		
	}

}
