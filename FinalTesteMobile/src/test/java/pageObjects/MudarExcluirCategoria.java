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

public class MudarExcluirCategoria {

	public MudarExcluirCategoria(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnCategory")
	private MobileElement botaoOpcaoCategoriar;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnEdit")
	private MobileElement botaoEdit;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnEditRank")
	private MobileElement botaoEditRank;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnDelete")
	private MobileElement botaoDeletarCategoria;
	
	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnEdit")
	private MobileElement botaoSalvar;
	

	public void acionarOpcaoCategoria() {
		botaoOpcaoCategoriar.click();
	}

	public void acionarBotaoEdit() {
		botaoEdit.click();
	}
	
	public void acionarBotaoEditRank() {
		botaoEditRank.click();
	
	}

	public void cliqueLongo() {
		Actions acao = new Actions(driver);
		acao.clickAndHold(botaoOpcaoCategoriar).perform(); // sem o .perform ele não segura.
	}

	public void acionarBotaoDeletarCategoria() {
		botaoDeletarCategoria.click();
	}
	
	public void acionarBotaoSalvar() {
		botaoSalvar.click();
	}

	
	
	
	
}
