package org.egg.auto;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="classpath:/features", // Carpeta de archivos .feature
    tags = "@candidateTest", // Tags a tener en cuenta
    glue = "org.egg.tests", // Paquete con definiciones de los pasos de los Tests: Given | When | Then | And | But
    plugin = {"pretty", "html:target/cucumber-report.html"} // Configuración de Reportes
)
public class RunAutomation {
    // Clase vacía usada por Cucumber como punto de entrada
}