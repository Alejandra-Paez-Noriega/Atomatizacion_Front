package org.egg.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.AfterAll;

import io.cucumber.java.BeforeAll;

public class InitTests {
    private static WebDriver driver; // Driver estático global

    // Getter del driver
    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeAll // Before para que se ejecute antes de cada prueba, BeforeAll para que se ejecute al inicio de todas
    public static void openDriver(){
        if(driver ==null){
            driver = new FirefoxDriver(); // Abre el Driver
        }
    }

    @AfterAll // Before para que se ejecute antes de cada prueba, AfterAll para que se ejecute al final de todas
    public static void closeDriver() throws InterruptedException{
        //Thread.sleep(500); // Espera para alcanzar a ver el resultado antes de que cierre el navegador
        if (driver != null){
            driver.quit(); // Cierra el driver
            driver = null; // Limpia la referencia para la siguiente prueba
        }
    }

}
