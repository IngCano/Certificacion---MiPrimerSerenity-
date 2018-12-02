package com.newtours.pages;
// Importamos la clase que nos permite definir y utilizar un navegador
import org.openqa.selenium.WebDriver;
// Importamos la clase que nos permite manejar elementos web
import org.openqa.selenium.WebElement;
// Importamos la clase que nos permite definir el localizador del elemento web
import net.serenitybdd.core.annotations.findby.FindBy;
// Importamos la clase que nos permite definir una pagina web que tiene una url y elementos web
import net.serenitybdd.core.pages.PageObject;
// Importamos la etiqueta que nos permite definir la direccion url de la pagina web
import net.thucydides.core.annotations.DefaultUrl;

// Definimos nuestra clase que en este caso sera la pagina de inicio junto con su url
@DefaultUrl("http://newtours.demoaut.com")
public class Homepage extends PageObject{
	// Declaramos la referencia al navegador
	WebDriver navegador;
	// Declaramos el elemento web que define el campo de usuario y le decimos que lo localize por un xpath
	@FindBy(xpath="//input[@name='userName']")
	WebElement txtUserName;
	// Declaramos el elemento web que define el campo de la contraseña y le decimos que lo localize por un xpath
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	// Declaramos el elemento web que define el boton para loguearse y le decimos que lo localize por un xpath
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnSignIn;
	
	/**
	 * Método que escribe el usuario y la contraseña asignados respectivamente en cada campo
	 * @param usuario a asignar al campo de usuario
	 * @param contrasena a asignar al campo de la contraseña
	 */
	public void writeData(String usuario, String contrasena) {
		txtUserName.sendKeys(usuario);
		txtPassword.sendKeys(contrasena);
	}
	
	/**
	 * Método que envia la informacion dando click sobre el boton de logueo 
	 */
	public void sendData() {
		btnSignIn.click();
	}
	
}
