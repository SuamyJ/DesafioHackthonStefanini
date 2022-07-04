package pageObjects;

import static utils.Utils.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CriarNota {

	public CriarNota(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAddNote")
	private MobileElement botaoAddNote;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/txtNote")
	private MobileElement botaoCriarNote;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editTitle")
	private MobileElement botaoEditTitle;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/editContent")
	private MobileElement botaoEditContent;

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnAdd")
	private MobileElement botaoSalvar;

	public void acionarBotaoAddNote() {
		botaoAddNote.click();
	}

	public void acionarBotaoCriarNote() {
		botaoCriarNote.click();
	}

	public void acionarBotaoEditTitle(String title) {
		botaoEditTitle.sendKeys(title);
	}

	public void acionarEditContent(String title) {
		botaoEditContent.sendKeys(title);
	}
	public void acionarBotaoSalvar() {
		botaoSalvar.click();
	}

}
