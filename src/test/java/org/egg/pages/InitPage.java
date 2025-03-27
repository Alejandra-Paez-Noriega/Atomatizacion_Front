package org.egg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class InitPage {
    protected WebDriver driver; // Protected para que lo puedan accedar las subclases
    protected Actions action;

    // Constructor
    public InitPage (WebDriver driver){
        this.driver = driver; // Asignamos el driver global recibido
        action = new Actions(driver); // Inicializamos las acciones
        PageFactory.initElements(driver, this); // Inicializa los @FindBy
    }
}
