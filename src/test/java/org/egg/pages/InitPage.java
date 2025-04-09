package org.egg.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitPage {
    protected WebDriver driver; // Protected para que lo puedan accedar las subclases
    protected Actions action;
    protected WebDriverWait wait; // Para esperar a que los elementos esten disponibles

    // Constructor
    public InitPage (WebDriver driver){
        this.driver = driver; // Asignamos el driver global recibido
        action = new Actions(driver); // Inicializamos las acciones
        PageFactory.initElements(driver, this); // Inicializa los @FindBy
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Inicializa el wait
    }
}
