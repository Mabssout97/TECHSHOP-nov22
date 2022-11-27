package com.smarttechqa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"Features/LoginToTechShop.feature","Features/NegativeLogToTec.feature"},
glue = {"com.smarttechqa.stepdef","com.smarttechqa.hook"}, 
plugin = {"pretty","json:target/cucumber.json"},
dryRun = true,
monochrome = true
//tags = "@smoke"
)








public class RunnerClassTec extends AbstractTestNGCucumberTests{

}
