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

public class InteragirMenuOrganizar {

	public InteragirMenuOrganizar(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

//	@AndroidFindBy (id = "notizen.basic.notes.notas.note.notepad:id/btnBookmark")
//	private MobileElement botaoMenu;

	// Caso não tenha id, content desc = usa o acessibility. Caso não tenha id.

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnBookmark")
	private MobileElement botaoMenu;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout//android.widget.RelativeLayout")
	private List<MobileElement> menus;
	
	//XPATH NO ANDROID – CLASS @ATRIBUTE ‘VALOR’ android.widget.EditText[@text-'Title')]

	@AndroidFindBy(id = "notizen.basic.notes.notas.note.notepad:id/btnUncategorizedNotes")
	private MobileElement botaoUncategorizedNotes;

	public void acionarBotaoMenu() {
		botaoMenu.click();
	}

	public void clicarSettings() {
		// para fazer pelo menus System.out.println("imprimiu isso aqui: " +
		// menus.size());
		menus.get(2).click();

	}

	public void acionarBotaoUncategorizedNotes() {
		botaoUncategorizedNotes.click();
	}

}
