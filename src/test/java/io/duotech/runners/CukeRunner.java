package io.duotech.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions (
		
		plugin = {
				"html:target/built-in-html-report",
				"json:target/Cucumber.json "
		
		},
					
		tags = "@api",//"@login and @db", // "@smoke and @test"
		features = "src/test/resources/io/duotech/features",
		glue = "io/duotech/step_definitions"
//		,strict = true
//		,dryRun = true
		,monochrome =true
		,stepNotifications = true
//		,snippets = SnippetType.CAMELCASE
		)
public class CukeRunner {

}
