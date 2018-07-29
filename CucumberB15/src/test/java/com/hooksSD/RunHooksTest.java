package com.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,
					dryRun=false,               // no need to write feature file with own, auotomatically it will, 
												//it will check all step def code with feature file is present or not
							 features = {"src/test/resources/com/hooksFF/"},
								glue = {"com/hooksSD/"},
				
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report5.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
					}
			
			)
	
	public class RunHooksTest {	
	

}
