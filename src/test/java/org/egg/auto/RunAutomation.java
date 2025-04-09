package org.egg.auto;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "classpath:/features",
    tags = "@candidatePost or @candidatePut or @candidateGet or @candidateDelete",
    glue = "org.egg.tests",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/html-report.html",
        "json:target/cucumber-reports/Cucumber.json",
        "timeline:target/test-output-thread/",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }
)
public class RunAutomation {
    // Clase vacía, solo se utiliza para ejecutar las pruebas de Cucumber
}
