package org.egg.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.egg.pages.CandidatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CandidateTests {
    private CandidatePage page = new CandidatePage(InitTests.getDriver());

    // Background
    @Given("Estoy en la pagina candidato {string}")
    public void Estoy_en_la_pagina_candidato(String url) {
        page.navegoACandidatePage(url);
    }

    // POST
    @When("Hago clic en el botón de crear candidato")
    public void Hago_clic_en_el_boton_de_crear_candidato() {
        page.clicBotonCrearCandidato();
    }

    @And("Relleno los campos del formulario con {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} y {string}")
    public void relleno_los_campos_del_formulario_con_y(String nombre, String apellido, String cedula,
            String fecha_nacimiento, String celular, String ciudad, String email, String aspiracion_salarial,
            String seniority, String skills, String fuente, String experiencia_trabajo, String años_experiencia,
            String level, String perfil, String origen)
            throws InterruptedException {
        page.ingresoCedula(cedula);
        page.ingresoNombre(nombre);
        page.ingresoApellido(apellido);
        page.ingresoFechaNacimiento(fecha_nacimiento);
        page.ingresoEmail(email);
        page.ingresoCelular(celular);
        page.ingresoCiudad(ciudad);
        page.ingresoAspiracionSalarial(aspiracion_salarial);
        page.ingresoSeniority(seniority);
        page.ingresoSkills(skills);
        page.ingresoFuente(fuente);
        page.ingresoExperienciaTrabajo(experiencia_trabajo);
        page.ingresoAñosExperiencia(años_experiencia);
        page.ingresoLevel(level);
        page.seleccionOrigen(origen);
        page.seleccionPerfil(perfil);
    }

    @And("Hago clic en el botón de guardar")
    public void hago_clic_en_el_boton_de_guardar_cambios() throws InterruptedException {
        page.clicBotonGuardar();
    }

    @Then("Veo los datos correctos del candidato con nombre: {string} y apellido: {string}")
    public void veo_los_datos_correctos_del_candidato(String nombre, String apellido) throws InterruptedException {
        page.recargarPagina();
        page.buscoCandidato(nombre, apellido);
        assertEquals(nombre + " " + apellido, page.obtenerNombreCompleto(),
                "El nombre completo del candidato no coincide.");
    }

    // GET
    @When("Ingreso nombre: {string} y apellido: {string} en el campo de búsqueda")
    public void ingreso_nombre_y_apellido_en_el_campo_de_busqueda(String nombre, String apellido)
            throws InterruptedException {
        page.buscoCandidato(nombre, apellido);
    }

    // PUT
    @And("Hago clic en el botón de editar candidato")
    public void hago_clic_en_el_boton_de_editar_candidato() {
        page.clicBotonEditarCandidato();
    }

    @And("Modifico el campo de correo electrónico con {string}")
    public void modifico_el_campo_de_correo_electronico_con(String nuevo_email) {
        page.ingresoEmail(nuevo_email);
    }

    @Then("Veo los datos correctos del candidato con nombre: {string}, apellido: {string} y correo: {string}")
    public void veo_los_datos_correctos_del_candidato(String nombre, String apellido, String correo)
            throws InterruptedException {
        page.recargarPagina();
        page.buscoCandidato(nombre, apellido);
        assertEquals(correo, page.obtenerEmail(), "El correo electrónico del candidato no coincide.");
    }

    // DELETE
    @And("Hago clic en el botón de eliminar candidato")
    public void hago_clic_en_el_boton_de_eliminar_candidato() {
        page.clicBotonEliminarCandidato();
    }

    @And("Confirmo la eliminación")
    public void confirmo_la_eliminacion() {
        page.confirmarEliminacion();
    }

    @Then("No encuentro al candidato con nombre: {string} y apellido: {string}")
    public void no_encuentro_al_candidato_con_nombre_y_apellido(String nombre, String apellido) throws InterruptedException {
    page.recargarPagina();
    page.buscoCandidato(nombre, apellido);
    assertNotEquals(nombre + " " + apellido, page.obtenerNombreCompleto(),
                "El candidato aun exixte.");
    
}
    
    }
