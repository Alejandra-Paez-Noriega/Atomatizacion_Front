package org.egg.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CandidatePage extends InitPage {
    // Crear Candidato
    public static final String BOTON_CREAR_CANDIDATO = ".crear-btn";
    public static final String CAMPO_NOMBRE = "#nombre";
    public static final String CAMPO_APELLIDO = "#apellido";
    public static final String CAMPO_CEDULA = "#card";
    public static final String CAMPO_FECHA_NACIMIENTO = "#fechaNacimiento";
    public static final String CAMPO_CELULAR = "#celular";
    public static final String CAMPO_CIUDAD = "#ciudad";
    public static final String CAMPO_EMAIL = "#correo";
    public static final String CAMPO_ASIGNACION_SALARIAL = "#salaryAspiration";
    public static final String CAMPO_SENIORITY = "#seniority";
    public static final String CAMPO_SKILLS = "#skills";
    public static final String CAMPO_FUENTE = "#source";
    public static final String CAMPO_EXPERIENCIA_TRABAJO = "#workExperience";
    public static final String CAMPO_AÑOS_EXPERIENCIA = "#yearsExperience";
    public static final String CAMPO_LEVEL = "#level";
    public static final String CAMPO_ORIGEN = "select[name=\"origin\"]";
    public static final String CAMPO_PERFIL = "select[name=\"jobProfile\"]";
    public static final String BOTON_GUARDAR = ".guardar-btn";
  

    // Buscar Candidato
    public static final String CAMPO_BUSCAR_CANDIDATO = "input[placeholder=\"Buscar candidato\"]";
    public static final String TARJETA_CANDIDATO = "app-card-candidato";
    public static final String BOTON_EDITAR_CANDIDATO = ".editar-btn";
    public static final String CAMPO_EMAIL_CREADO = ".perfil-correo";
    public static final String CAMPO_NOMBRE_CREADO = ".perfil-nombre";
    public static final String BOTON_ELIMINAR_CANDIDATO = ".eliminar-btn";
    public static final String BOTON_CONFIRMAR_ELIMINAR = "//button[normalize-space()='Eliminar']";

    @FindBy(css = TARJETA_CANDIDATO)
    List<WebElement> tarjetasCandidatos;

    @FindBy(css = BOTON_CREAR_CANDIDATO)
    WebElement botonCrearCandidato;

    @FindBy(css = CAMPO_NOMBRE)
    WebElement campoNombre;

    @FindBy(css = CAMPO_APELLIDO)
    WebElement campoApellido;

    @FindBy(css = CAMPO_CEDULA)
    WebElement campoCedula;

    @FindBy(css = CAMPO_FECHA_NACIMIENTO)
    WebElement campoFechaNacimiento;

    @FindBy(css = CAMPO_CELULAR)
    WebElement campoCelular;

    @FindBy(css = CAMPO_CIUDAD)
    WebElement campoCiudad;

    @FindBy(css = CAMPO_EMAIL)
    WebElement campoEmail;

    @FindBy(css = CAMPO_ASIGNACION_SALARIAL)
    WebElement campoAsignacionSalarial;

    @FindBy(css = CAMPO_SENIORITY)
    WebElement campoSeniority;

    @FindBy(css = CAMPO_SKILLS)
    WebElement campoSkills;

    @FindBy(css = CAMPO_FUENTE)
    WebElement campoFuente;

    @FindBy(css = CAMPO_EXPERIENCIA_TRABAJO)
    WebElement campoExperienciaTrabajo;

    @FindBy(css = CAMPO_AÑOS_EXPERIENCIA)
    WebElement campoAñosExperiencia;

    @FindBy(css = CAMPO_LEVEL)
    WebElement campoLevel;

    @FindBy(css = CAMPO_ORIGEN)
    WebElement campoOrigen;

    @FindBy(css = CAMPO_PERFIL)
    WebElement campoPerfil;

    @FindBy(css = BOTON_GUARDAR)
    WebElement botonGuardar;

    @FindBy(css = CAMPO_NOMBRE_CREADO)
    List<WebElement> campoNombreCreado;

    @FindBy(css = CAMPO_BUSCAR_CANDIDATO)
    WebElement campoBuscarCandidato;

    @FindBy(css = BOTON_EDITAR_CANDIDATO)
    WebElement botonEditarCandidato;

    @FindBy(css = CAMPO_EMAIL_CREADO)
    List<WebElement> campoEmailCreado;

    @FindBy(css = BOTON_ELIMINAR_CANDIDATO)
    WebElement botonEliminarCandidato;

    @FindBy(xpath = BOTON_CONFIRMAR_ELIMINAR)
    WebElement botonConfirmarEliminarCandidato;

    public CandidatePage(WebDriver driver) {
        super(driver);
    }

    public void navegoACandidatePage(String url) {
        driver.manage().window().maximize(); // Maximiza la ventana del navegador
        driver.get(url);

    }

    public void clicBotonCrearCandidato() {
        botonCrearCandidato.click();
    }

    public void ingresoNombre(String nombre) {
        campoNombre.sendKeys(nombre);
    }

    public void ingresoApellido(String apellido) {
        campoApellido.sendKeys(apellido);
    }

    public void ingresoCedula(String cedula) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CAMPO_CEDULA)));
        campoCedula.click();
        campoCedula.sendKeys(cedula);
    }

    public void ingresoFechaNacimiento(String fecha_nacimiento) {
        campoFechaNacimiento.sendKeys(fecha_nacimiento);

    }

    public void ingresoCelular(String celular) {
        campoCelular.sendKeys(celular);
    }

    public void ingresoCiudad(String ciudad) {
        campoCiudad.sendKeys(ciudad);
    }

    public void ingresoEmail(String email) {
        campoEmail.clear();
        campoEmail.sendKeys(email);
    }

    public void recargarPagina() throws InterruptedException {
        driver.navigate().refresh();
    }

    public void clicBotonEditarCandidato() {
        botonEditarCandidato.click();
    }

    public void ingresoAspiracionSalarial(String aspiracion_salarial) {
        campoAsignacionSalarial.sendKeys(aspiracion_salarial);
    }

    public void ingresoSeniority(String seniority) {
        campoSeniority.sendKeys(seniority);
    }

    public void ingresoSkills(String skills) {
        campoSkills.sendKeys(skills);
    }

    public void ingresoFuente(String fuente) {
        campoFuente.sendKeys(fuente);
    }

    public void ingresoExperienciaTrabajo(String experiencia_trabajo) {
        campoExperienciaTrabajo.sendKeys(experiencia_trabajo);
    }

    public void ingresoAñosExperiencia(String años_experiencia) {
        campoAñosExperiencia.sendKeys(años_experiencia);
    }

    public void ingresoLevel(String level) {
        campoLevel.sendKeys(level);
    }

    public void seleccionOrigen(String origen) {
        new Select(campoOrigen).selectByVisibleText(origen);
    }

    public void seleccionPerfil(String perfil) {
        new Select(campoPerfil).selectByVisibleText(perfil);

    }

    public void clicBotonGuardar() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", botonGuardar);
        botonGuardar.click();
        Thread.sleep(500);
    }

    public void buscoCandidato(String nombre, String apellido) throws InterruptedException {
        campoBuscarCandidato.sendKeys(nombre + " " + apellido);
        Thread.sleep(500);
    }

    public String obtenerNombreCompleto(String nombreCompletoEsperado) {
        for (WebElement elemento : campoNombreCreado) {
            String nombreEncontrado = elemento.getText().trim();
            if (nombreEncontrado.equalsIgnoreCase(nombreCompletoEsperado)) {
                return nombreEncontrado;
            }
        }
        return null;
    }

    public String obtenerEmail() {
        String textoCompleto = campoEmailCreado.get(0).getText();
        return textoCompleto.replace("E-mail: ", "").trim();
    }

    public void confirmarEliminacion() {
        wait.until(ExpectedConditions.elementToBeClickable(botonConfirmarEliminarCandidato));
        botonConfirmarEliminarCandidato.click();
    }

    public boolean existeCandidato(String nombreCompletoEsperado) {
        // Esperamos hasta que al menos se actualicen las tarjetas del DOM (si hay alguna)
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(TARJETA_CANDIDATO)));
    
        // Filtramos directamente usando streams
        return driver.findElements(By.cssSelector(TARJETA_CANDIDATO)).stream()
            .map(tarjeta -> tarjeta.findElement(By.cssSelector(CAMPO_NOMBRE_CREADO)).getText().trim())
            .anyMatch(nombre -> nombre.equalsIgnoreCase(nombreCompletoEsperado));
    }
    
    public void clicBotonEliminarCandidato(String nombreCompletoEsperado) {
        // Esperar a que haya al menos una tarjeta visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(TARJETA_CANDIDATO)));
    
        // Obtener las tarjetas visibles después de aplicar el filtro
        List<WebElement> tarjetasCandidatos = driver.findElements(By.cssSelector(TARJETA_CANDIDATO));
    
        for (WebElement tarjeta : tarjetasCandidatos) {
            WebElement nombreElemento = tarjeta.findElement(By.cssSelector(CAMPO_NOMBRE_CREADO));
            String nombreEncontrado = nombreElemento.getText().trim();
    
            if (nombreEncontrado.equalsIgnoreCase(nombreCompletoEsperado)) {
                WebElement botonEliminar = tarjeta.findElement(By.cssSelector(BOTON_ELIMINAR_CANDIDATO));
    
                // Esperar a que el botón sea clickeable
                wait.until(ExpectedConditions.elementToBeClickable(botonEliminar));
                
                botonEliminar.click();
                return;
            }
        }
        throw new NoSuchElementException("No se encontró un candidato con el nombre: " + nombreCompletoEsperado);
    }
}
