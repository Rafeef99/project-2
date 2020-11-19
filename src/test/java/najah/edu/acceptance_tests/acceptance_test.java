package najah.edu.acceptance_tests;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="use_cases",
plugin = {"html:target/cucumber/wikipedia.html"},

monochrome=true,

snippets =  SnippetType.CAMELCASE ,

glue = {"najah.edu.acceptance_tests"},

strict=true
		
		)


public class acceptance_test {
	@Test
	public void test() {
		fail("Not yet implemented");
	}
}