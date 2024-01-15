package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		/* 1. features = "C:\\Users\\info\\eclipse-workspace\\CRM_Maven\\src\\main\\java\\com\\feature\\LoginCRM.feature"*/
	
		features = "C:\\Users\\info\\eclipse-workspace\\CRM_CucumberBDD_Maven\\src\\main\\java\\com\\feature\\ContactsCRM.feature",
		glue = {"com.stepdefinitions"},
		plugin = {"pretty","html:test-output"},
		monochrome=true, // to display console in  readable output
		dryRun = false
		//To check/mapping between feature file and stepdefinition file is proper or not i.e if there is any missing methods in stepdefinition 
	
		/*
		 * 
		 * 
		 * dryRun=true:

When you set dryRun=true, Cucumber will scan your feature files and check whether each step in the scenarios has a matching step definition.
It will print a list of undefined or pending step definitions without actually executing the associated code.
It's useful when you want to quickly check your feature files for any missing or undefined steps.
		 * 
		 * 
		 * 
		 * 
		 * dryRun=false:

When you set dryRun=false (or omit the option, as false is the default), Cucumber will execute your feature files and step definitions as usual.
It will run the actual tests, and if there are undefined steps, Cucumber will throw an error indicating which steps are missing or have no matching step definition.
		 */
		
		

		
		
		)



public class Runner {

	
	
}
