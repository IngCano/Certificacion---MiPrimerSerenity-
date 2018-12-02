package com.newtours.runners;
//Importamos la etiqueta que nos especifica que clase debe ejecutar el runner
import org.junit.runner.RunWith;
//Importamos la etiqueta que nos especifica las opciones del runner, en este caso cucumber
import cucumber.api.CucumberOptions;
//Importamos la clase que se ejecutara con el @runWith
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		//Especificamos que feature queremos que se ejecute
		features="features/loginSerenity.feature",
		//Especificamos cuál o cuáles stepDefinitions se utilizaran para la ejecucion
		glue="com.newtours.stepdefinitions",
		//Especificamos los tipos de reporte que queremos obtener tras la ejecución
		plugin= {"html:target/cucumber-html-report",
				"json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json",
				"junit:target/cucumber-results.xml"})
public class NewtoursTestRunner {

}
