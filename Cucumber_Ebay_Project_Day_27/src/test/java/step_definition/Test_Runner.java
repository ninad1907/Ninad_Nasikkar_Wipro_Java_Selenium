package step_definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Ebay_Features",
                 glue={"step_definition"},
                 plugin= {"pretty","html:target/HTML/htmlreport3.html",
		                           "json:target/JSON/jsonreport3",
		                           "junit:target/JUNIT/junitreport3"}
                 )
public class Test_Runner {

}
