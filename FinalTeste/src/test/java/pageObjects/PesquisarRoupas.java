package pageObjects;

import static utils.Utils.*; //usar * para pegar tudo da utils
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class PesquisarRoupas {

	@FindBy(id = "search_query_top")
	private WebElement campoProcurar;

	@FindBy(id = "submit_search")
	private WebElement clicarProcurar;

	@FindBy(id = "id_gender1")
	private WebElement quantidade;
	
	public void campoProcurar(String procurar) {
		campoProcurar.sendKeys(procurar);
	}

	public void acionarClicarProcurar() {
		clicarProcurar.click();
	}

	public void quantidadeDaBusca() {
		System.out.println("Imprimiu isso aqui");
		
}
	
	
	
}