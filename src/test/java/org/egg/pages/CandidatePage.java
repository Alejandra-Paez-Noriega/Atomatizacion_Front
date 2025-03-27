package org.egg.pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CandidatePage extends InitPage{

    public static final String BOTON_CREAR_CANDIDATO = "app-boton-agregar[ng-reflect-titulo=\"Crear Candidato\"]";
    public static final String CAMPO_NOMBRE = "input#nombre";
    public static final String CAMPO_APELLIDO = "input#apellido";
    public static final String CAMPO_CEDULA = "input#card";
    public static final String CAMPO_FECHA_NACIMIENTO = "input#fechaNacimiento";
    public static final String CAMPO_FECHA_REGISTRO = "input#registrationDate";
    public static final String CAMPO_CELULAR = "input#celular";
    public static final String CAMPO_CIUDAD = "input#ciudad";
    public static final String CAMPO_EMAIL = "input#correo";
    public static final String BOTON_GUARDAR = "button.guardar-btn";
    public static final String CAMPO_CEDULA_CREADA = "div.perfil-cedula";

@FindBy (css=BOTON_CREAR_CANDIDATO)
WebElement botonCrearCandidato;

@FindBy (css=CAMPO_NOMBRE)
WebElement campoNombre;

@FindBy (css=CAMPO_APELLIDO)
WebElement campoApellido;

@FindBy (css=CAMPO_CEDULA)
WebElement campoCedula;

@FindBy (css=CAMPO_FECHA_NACIMIENTO)
WebElement campoFechaNacimiento;

@FindBy (css=CAMPO_FECHA_REGISTRO)
WebElement campoFechaRegistro;

@FindBy (css=CAMPO_CELULAR)
WebElement campoCelular;

@FindBy (css=CAMPO_CIUDAD)
WebElement campoCiudad;

@FindBy (css=CAMPO_EMAIL)
WebElement campoEmail;

@FindBy (css=BOTON_GUARDAR)
WebElement botonGuardar;

@FindBy (css=CAMPO_CEDULA_CREADA)
List<WebElement> campoCedulaCreada;


    public CandidatePage(WebDriver driver) {
        super(driver);
    }

    public void navegoACandidatePage(String url) {
     driver.get(url);   

    }

    public void clicBotonCrearCandidato() {
        botonCrearCandidato.click();
    }

    public List<WebElement> obtenerCedula() {

        return campoCedulaCreada;
    }

    public void ingresoNombre(String nombre) {
        campoNombre.sendKeys(nombre);
    }

    public void ingresoApellido(String apellido) {
        campoApellido.sendKeys(apellido);
    }

    public void ingresoCedula(String cedula) {
        campoCedula.sendKeys(cedula);
    }

    public void ingresoFechaNacimiento(String fecha_nacimiento) {
        campoFechaNacimiento.sendKeys(fecha_nacimiento);

    }

    public void ingresoFechaRegistro(String fecha_registro) {
        campoFechaRegistro.sendKeys(fecha_registro);  
    }

    public void ingresoCelular(String celular) {
        campoCelular.sendKeys(celular);
    }

    public void ingresoCiudad(String ciudad) {
        campoCiudad.sendKeys(ciudad);
    }

    public void ingresoEmail(String email) {
        campoEmail.sendKeys(email);
    }

    public void clicBotonGuardar() {
    ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", botonGuardar);
    action.moveToElement(botonGuardar).pause(Duration.ofMillis(500)).click().perform();
    }

    public void recargarPagina() throws InterruptedException {
       // Thread.sleep(1000);
        driver.navigate().refresh();
    }
    
}
