package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(
	features= "src/test/ressources/features",
	//tags= "@recherche",
	glue= 
		{ 
			"stepDefinitions",
			"utils"
		},
	plugin=
		{
			"pretty",
			"html:reports/cucumber_report.html",
			"json:reports/cucumber_report.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
	monochrome= true,
	snippets=SnippetType.CAMELCASE
	)

public class TestRunner {
	
	
}
