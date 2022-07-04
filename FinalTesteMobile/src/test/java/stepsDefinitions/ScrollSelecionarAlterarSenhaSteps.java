package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ScrollSelecionarAlterarSenha;

public class ScrollSelecionarAlterarSenhaSteps {

	ScrollSelecionarAlterarSenha SSA = new ScrollSelecionarAlterarSenha(driver);

//	@Dado("que eu starto GoogleNote") ficaria assim sem usar o .hooks para verificar se iiniciou o aplicativo
//	public void queEuStartoGoogleNote() {
//		assertEquals("BasicNote",
//				driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/txtCategoryName")).getText());
//	}

	@Quando("girar para cima")
	public void girarParaCima() {
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Guia de Instrucoes\").instance(0))"));
		SSA.clicarGuidaDeInstrucoes();
	
	}

	@Quando("clicarei em aletar nota")
	public void clicareiEmAletarNota() {
	    SSA.acionarBotaoEdit();
	}

	@Quando("digitarei {string}")
	public void digitarei(String title) {
	    SSA.inserirJojo(title);
	}

	@Quando("clicarei em confirmar edit")
	public void clicareiEmConfirmarEdit() {
	    SSA.acionarBotaoClose();
	}

	@Quando("clicarei em colocar senha")
	public void clicareiEmColocarSenha(String title) {
	    SSA.inserirSenha(title);
	}

	@Quando("clicarei em confirmar senha")
	public void clicareiEmConfirmarSenha() {
	    SSA.acionarBotaoGenerate();
	}

	@Quando("recolocarei senha")
	public void recolocareiSenha(String title) {
	    SSA.inserirConfirmarSenha(title);
	}

	@Quando("confirmarei a senha")
	public void confirmareiASenha() {
	    SSA.acionarBotaoConfirmarSenha();
	}

	@Entao("alterarei a nota e colocarei senha")
	public void alterareiANotaEColocareiSenha() {
	   SSA.acionarBotaoRemoverSenha();
	}

	@Entao("excluirei a nota")
	public void excluireiANota() {
		assertEquals("Remove",
				driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/txtRemove")).getText());
	}

}
