package com.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features ="F:\\Training\\PeopleNTech\\BITM Online 8\\TestAUtomation\\src\\main\\java\\com\\Cucumber\\LoginTest.feature",
        glue = {"com.Cucumber"},
        plugin = {
        "pretty","html:CucumberReports/LoginBDD.html"
        },
        monochrome = true
)
@RunWith(Cucumber.class)

public class Runner {
}
