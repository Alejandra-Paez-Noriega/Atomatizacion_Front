package org.egg.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.egg.pages.CandidatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CandidateTests {
    private CandidatePage page = new CandidatePage(InitTests.getDriver());
   @Given("Estoy en la pagina candidato {string}")
    public void Estoy_en_la_pagina_candidato(String url) {
        page.navegoACandidatePage(url);
    } 
    @When("Hago clic en el botón de crear candidato")
    public void Hago_clic_en_el_boton_de_crear_candidato() {
        page.clicBotonCrearCandidato();
    }
    
    @And("Relleno los campos del formulario con {string}, {string}, {string}, {string}, {string}, {string}, {string}, y {string}")
    public void relleno_los_campos_del_formulario_con_y(String nombre, String apellido, String cedula, String fecha_nacimiento, String fecha_registro, String celular, String ciudad, String email) throws InterruptedException {
        page.ingresoCedula(cedula);
        page.ingresoNombre(nombre);
        page.ingresoApellido(apellido);
        page.ingresoFechaNacimiento(fecha_nacimiento);
        page.ingresoEmail(email);
        page.ingresoCelular(celular);
        page.ingresoCiudad(ciudad);
        page.ingresoFechaRegistro(fecha_registro);
        page.clicBotonGuardar();
        page.recargarPagina();

    } 
    @Then("veo los datos correctos del candidato con cedula: {string}")
    public void veo_los_datos_correctos_del_candidato(String cedula) {
        assertTrue(page.obtenerCedula().stream()
        .anyMatch(element -> element.getText().contains("Cédula: " + cedula)),
        "No se encontró la cédula: " + cedula);
    }
    
}

