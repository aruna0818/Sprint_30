package com.TestRun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.jvmreports.JvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target","json:target/repots.json"},features= {"src/test/resources"},glue= {"com.stepdefinition"},dryRun=false)

public class StepTestrun {
	
	
}
