package com.demoqa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",// path from content root
        glue = "com/demoqa/step_definitions",// path from source root
        dryRun = true,
        tags = "@wip",
        publish = true //generating a report with public link
)

public class CukesRunner {

}
