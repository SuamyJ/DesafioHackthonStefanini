package pageObjects;

import static utils.Utils.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MudarExcluirNota {

	public MudarExcluirNota(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/layout")
	private MobileElement botaoSelecionarSegurar;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnChangeCategory")
	private MobileElement botaoSelecionarPasta;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/layout")
	private MobileElement botaoSelecionarCategoria;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/layout")
	private MobileElement botaoSelecionarSegurarNovamente;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnDeleteSelectedNotes")
	private MobileElement botaoDeletarNota;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnDelete")
	private MobileElement confirmarBotaoDeletar;

	public void clicarSegurarNota() {
		botaoSelecionarSegurar.click();
	}

	// botei o cliqueLongo logo abaixo texto que vai segurar, porque achei melhor
	// para organizar para mim. Vou fazer isso nos seguintes passos também.

	public void cliqueLongo() {
		Actions acao = new Actions(driver);
		acao.clickAndHold(botaoSelecionarSegurar).perform(); //sem o .perform ele não segura.
	}

	public void clicarBotaoSelecionarPasta() {
		botaoSelecionarPasta.click();
	}

	public void clicarSelecionarCategoria() {
		botaoSelecionarCategoria.click();
	}

	public void clicarSegurarNotaNovamente() {
		botaoSelecionarSegurarNovamente.click();
	}

	public void cliqueLongoNovamente() {
		Actions acao = new Actions(driver);
		acao.clickAndHold(botaoSelecionarSegurarNovamente).perform();
	}

	public void clicarBotaoDelete() {
		botaoDeletarNota.click();
	}

	public void confirmarAcionarBotaoDelete() {
		confirmarBotaoDeletar.click();
	}

}
