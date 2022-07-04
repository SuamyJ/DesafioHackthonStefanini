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

public class ScrollSelecionarAlterarSenha {

	public ScrollSelecionarAlterarSenha(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Guida de Instrucoes]")
	private MobileElement guiaDeInstrucoes;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnEdit")
	private MobileElement botaoEdit;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editContent")
	private MobileElement escreverJojo;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnEdit")
	private MobileElement botaoConfirmarEdit;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnLock")
	private MobileElement botaoLock;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editPassword")
	private MobileElement escreverSenha;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtBtn")
	private MobileElement botaoGenerate;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editPassword")
	private MobileElement confirmarSenha;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btn")
	private MobileElement botaoConfirmarSenha;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnLock")
	private MobileElement botaoRemoverSenha;

	public void clicarGuidaDeInstrucoes() {
		guiaDeInstrucoes.click();

	}

	public void acionarBotaoEdit() {
		botaoEdit.click();
	}

	public void inserirJojo(String title) {
		escreverJojo.sendKeys(title);

	}

	public void acionarBotaoClose() {
		botaoConfirmarEdit.click();
	}

	public void acionarBotaoLock() {
		botaoLock.click();
	}

	public void inserirSenha(String title) {
		escreverSenha.sendKeys(title);// no mobile, o sendkeys já tem a opcao .clear dentro dela.
	}

	public void acionarBotaoGenerate() {
		botaoGenerate.click();

	}

	public void inserirConfirmarSenha(String title) {
		confirmarSenha.sendKeys(title);
	}

	public void acionarBotaoConfirmarSenha() {
		botaoConfirmarSenha.click();
	}

	public void acionarBotaoRemoverSenha() {
		botaoRemoverSenha.click();
	}

}
