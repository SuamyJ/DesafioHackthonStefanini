package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.MudarExcluirCategoria;

public class MudarExcluirCategoriaSteps {

	MudarExcluirCategoria MEC = new MudarExcluirCategoria(driver);


	@Quando("eu clicar em op??es") //?? porque o java é sensitive
	public void euClicarEmOpEs() {
		MEC.acionarOpcaoCategoria();
	
	}

	@Quando("selecionar em editar")
	public void selecionarEmEditar() {
	    MEC.acionarBotaoEdit();
	}

	@Quando("segurar para mover para cima")
	public void segurarParaMoverParaCima() {
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Guia de Instrucoes\").instance(0))"));
		MEC.acionarBotaoEditRank();
	}

	@Quando("movido para cima")
	public void movidoParaCima() {
	    MEC.acionarBotaoSalvar();
	}

	@Quando("deleto a categoria")
	public void deletoACategoria() {
	    MEC.acionarBotaoDeletarCategoria();
	}

	@Entao("confirmo que deletei a categoria")
	public void confirmoQueDeleteiACategoria() {
		assertTrue(driver.findElement(By.name("Editarnota3")).isDisplayed());
	}
	
}
