package org.egg.auto;

import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="classpath:/features", // Carpeta de archivos .feature
    tags = "@candidatePost or @candidatePut or @candidateGet or @candidateDelete", // Tags a tener en cuenta
    glue = "org.egg.tests", // Paquete con definiciones de los pasos de los Tests: Given | When | Then | And | But
    plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
)
public class RunAutomation {
    // Clase vacía usada por Cucumber como punto de entrada
}
public static void writeExtentReport() {
    Reporter.loadXMLConfig(new File("config/report.xml"));
}