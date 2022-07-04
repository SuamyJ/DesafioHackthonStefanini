package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import pageObjects.PesquisarRoupas;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PesquisarRoupasSteps {

	PesquisarRoupas PR = new PesquisarRoupas(); //fiz diferente dos outros para demonstrar como ficaria. No mobile vão ser todos desse jeito porque achei melhor.
	
	
	
	@Quando("estiver pagina principal {string}")
	public void estiverPaginaPrincipal(String procurar) {
		PR.campoProcurar(procurar);
	}

	@Quando("informo a palavra {string}")
	public void informoAPalavra() {
		PR.acionarClicarProcurar();
	}

	@Entao("o sistema diz quantas pecas de roupa existem")
	public void oSistemaDizQuantasPecasDeRoupaExistem() {
	    PR.quantidadeDaBusca();
	}
	
	@Entao("confirmo a quantidade")
	public void confirmoAQuantidade() {
		assertEquals("results have been found", driver.findElement(By.xpath("//class[@heading-counter]")).getText());
	}
}
