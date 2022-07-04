package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.MudarExcluirNota;


public class MudarExcluirNotaSteps {
	
	MudarExcluirNota MEN = new MudarExcluirNota(driver);

	@Quando("eu segurar a nota")
	public void euSegurarANota() {
	    MEN.clicarSegurarNota();
	}

	@Quando("selecionar para mudar de pasta")
	public void selecionarParaMudarDePasta() {
	    MEN.clicarBotaoSelecionarPasta();
	}

	@Quando("selecionar outra pasta")
	public void selecionarOutraPasta() {
	   MEN.clicarSelecionarCategoria();
	}

	@Quando("confirmo que mudei de pasta")
	public void confirmoQueMudeiDePasta() {
	    assertEquals("Sucess", driver.findElement(By.id("com.google.android.keep:id/snackbar_text")).getText());
	}

	@Quando("seleciono a nota")
	public void selecionoANota() {
	    MEN.clicarSegurarNotaNovamente();
	}

	@Quando("seleciono para excluir")
	public void selecionoParaExcluir() {
	    MEN.clicarBotaoDelete();
	}

	@Entao("confirmo selecionando o botao delete")
	public void confirmoSelecionandoOBotaoDelete() {
		assertEquals("Sucess", driver.findElement(By.id("com.google.android.keep:id/snackbar_text")).getText());
	}
	}
	
