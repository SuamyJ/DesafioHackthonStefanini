package stepsDefinitions;


//Extends serve para receber os valores da pagina mencionada ex.: exteds BasePage
import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CriarNota;

//CTRL + 1 serve para trazer a feature que não foi executada pelo runner.

public class CriarNotaSteps {

	CriarNota CN = new CriarNota (driver);
	
	
	@Quando("eu acionar o menu para criar nota")
	public void euAcionarOMenuParaCriarNota() {
	    CN.acionarBotaoAddNote();
	}

	@Quando("eu clicar na opcao note")
	public void euClicarNaOpcaoNote() {
	    CN.acionarBotaoCriarNote();
	}

	@Quando("digitar title {string}")
	public void digitarTitle(String title) {
	    CN.acionarBotaoEditTitle(title);
	}

	@Quando("digitar no content {string}")
	public void digitarNoContent(String title) {
	    CN.acionarEditContent(title);
	}

	@Quando("clicar em salvar")
	public void clicarEmSalvar() {
	   CN.acionarBotaoSalvar();
	}

	@Entao("fica criado a nota")
	public void ficaCriadoANota() {
		assertEquals("Jotaro", driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/txtTitle")).getText());
		//isSelected – Mostrar quando estiver selecionada]
	}

}
