package com.newtours.pages;
// Importamos la clase que define las etiquetas que hacen referencia a los pasos del test
import net.thucydides.core.annotations.Step;

public class NewToursLoginSteps {
	// Definimos nuestro usuario y le asignamos un valor
	private final String USUARIO = "user1";
	// Definimos nuestra contraseña y le asignamos un valor
	private final String PASSWORD = "pass1";
	// Definimos la clase que representa la pagina a la a que haremos la prueba
	Homepage page;
	
	/**
	 * Método que define el primer paso el cual es abrir la pagina 
	 */
	@Step
	public void openApplication() {
		page.open();
	}
	
	/**
	 * Método que define el segundo paso el cual consiste en ingresar el usuario y la contraseña
	 * en sus respectivos campos
	 */
	@Step("Escribiendo datos")
	public void writeData() {
		page.writeData(USUARIO, PASSWORD);
	}
	
	/**
	 * Método que consiste en clickear el boton de loguearse y mandar la informacion
	 */
	@Step("Enviando datos")
	public void sendData() {
		page.sendData();
	}
}
