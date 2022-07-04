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
import pageObjects.InteragirMenuOrganizar;

public class InteragirMenuOrganizarSteps {

	InteragirMenuOrganizar is = new InteragirMenuOrganizar(driver);
	
//	@Dado("que eu starto GoogleNote") Sem o .hooks ficaria assim para checar que iniciou o aplicativo
//	public void queEuStartoGoogleNote() {
//		assertEquals("BasicNote", driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/txtCategoryName")).getText());
//	}

	@Quando("eu acionar o menu")
	public void euAcionarOMenu() {
	    is.acionarBotaoMenu();
	}

	@Quando("eu clicar no menu Uncategorized notes")
	public void euClicarNoMenuUncategorizedNotes() {
	    is.acionarBotaoUncategorizedNotes();
	}

	@Entao("fica organizado")
	public void ficaOrganizado() {
		assertEquals("Uncategorized notes", driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/txtCategoryName")).getText());
	}

}