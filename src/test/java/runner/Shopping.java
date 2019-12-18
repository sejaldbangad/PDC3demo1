package runner;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PDC3B-Training.PDC3B\\eclipse-sejal\\Cucumber\\Myfeatures\\Registeration.feature",
glue= {"stepdefinitions"},tags= {"@Sanity"})
public class Shopping {
	
}

