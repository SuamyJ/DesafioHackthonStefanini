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

public class BotaoCheck {

	public BotaoCheck(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/layout")
	private MobileElement botaoSelecionarSegurar;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnChangeCategory")
	private MobileElement botaoSelecionarPasta;

	

	public void clicarSegurarNota() {
		botaoSelecionarSegurar.click();
	}

	// botei o cliqueLongo logo abaixo texto que vai segurar, porque achei melhor
	// para organizar para mim. Vou fazer isso nos seguintes passos também.

	public void cliqueLongo() {
		Actions acao = new Actions(driver);
		acao.clickAndHold(botaoSelecionarSegurar).perform(); // usar o .perform para segurar, sem isso não pega
	}

	public void clicarBotaoSelecionarClick() {
		botaoSelecionarPasta.click();
	}


}
