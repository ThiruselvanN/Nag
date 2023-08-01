package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\FeatureFiles\\login.feature",
               glue="com.Step_Definition",
	              tags="@smoketest or @smoke_run or @smoke"
		)


public class Runner_File {

}
