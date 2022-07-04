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
import pageObjects.BotaoCheck;



public class BotaoCheckSteps {
	
	BotaoCheck BC = new BotaoCheck(driver);



@Quando("eu selecionar a nota")
public void euSelecionarANota() {
    BC.clicarSegurarNota();
}

@Quando("segurar a nota selecionada")
public void segurarANotaSelecionada() {
    BC.clicarBotaoSelecionarClick();
}


@Entao("confirmo que esta desmarcada")
public void confirmoQueEstaDesmarcada() {
	assertEquals("false", driver.findElement(By.id("notizen.basic.notes.notas.note.notepad:id/imgEditCheck")).getAttribute("checked"));
//	 metodo para checar se deu certo System.out.println("Imprimiu isso aqui: "+
//	 driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom")).getAttribute("checked"));
}





}
