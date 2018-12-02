package com.newtours.stepdefinitions;
// Importamos la clase que contiene los pasos de la prueba
import com.newtours.pages.NewToursLoginSteps;
//Importamos la etiqueta de cucumber @Given
import cucumber.api.java.en.Given;
//Importamos la etiqueta de cucumber @When
import cucumber.api.java.en.When;
//Importamos la etiqueta de cucumber @Then
import cucumber.api.java.en.Then;
//Importamos la etiqueta que define que clase contiene los pasos a ejecutar 
import net.thucydides.core.annotations.Steps;

public class NewtoursLoginStepDefinitions {
	//Definimos los pasos junto con nuestra referencia
	@Steps
	NewToursLoginSteps login;
	/**
	 * Método que abre el navegador y nos traslada a la pagina definida
	 */
	@Given("^The newtours login page$")
	public void the_newtours_login_page() {
	    login.openApplication();
	}
	
	/**
	 * Método que escribe el usuario y contraseña en los campos coincidentes
	 */
	@When("^I fill the user and password$")
	public void i_fill_the_user_and_password() {
		login.writeData();
	}

	/**
	 * Método que clickea sobre el boton de logueo y envia la informacion al servidor
	 */
	@When("^Click the submit button$")
	public void click_the_submit_button() {
		login.sendData();
	}

	/**
	 * Método que verifica si fue capaz de loguearse como usuario o no
	 */
	@Then("^I access to a new page$")
	public void i_access_to_a_new_page() {
		System.out.println("Accedo como usuario");
	}

}
