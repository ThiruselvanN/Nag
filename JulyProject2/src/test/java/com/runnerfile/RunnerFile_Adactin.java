package com.runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\FeatureFile\\Login.feature",

                 glue = "com.stepdefinition"
             //  tags = "@regression_run"
               
                 

		         
		)

public class RunnerFile_Adactin {

}
