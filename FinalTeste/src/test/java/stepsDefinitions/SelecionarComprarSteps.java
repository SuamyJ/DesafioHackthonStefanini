package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuario;
import pageObjects.SelecionarComprar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class SelecionarComprarSteps {

	//Exceptions – quando for usar o throw.
	@Dado("estiver feito o login")
	public void estiverFeitoOLogin() {
		Em(SelecionarComprar.class).acessarMenuCasualDress();
	}

	@Quando("selecionar um outro vestido {string}")
	public void selecionarUmOutroVestido()	{
		assertEquals("SUMMER DRESSES", driver.findElement(By.linkText("Summer Dresses ")).getText());
//Gettext – é pra receber o texto
	}

	@Quando("clicar em {string}")
	public void clicarEmSummerDress() {
		Em(SelecionarComprar.class).acionarAddToCart();
	}

	@Quando("clicar na opcao {string}")
	public void clicarNaOpcao(String string) {
		Em(SelecionarComprar.class).acionarbotaoFechar();
	}

	@Quando("selecionar um outro vestido {string}")
	public void selecionarUmOutroVestido(String string) {
		Em(SelecionarComprar.class).acionarBotaoAddToCart2();
	}

	@Quando("clicar de novo em {string}")
	public void clicarDeNovoEm(String string) {
		Em(SelecionarComprar.class).acionarBotaoProceedToCheckOut();
	}

	@Quando("o carrinho mostrar a quantidade de itens no carro")
	public void oCarrinhoMostrarAQuantidadeDeItensNoCarro() {
		assertEquals("There are", driver.findElement(By.xpath("//class[@heading-counter]")).getText());
	}

	@Quando("deseleciono um outro vestido {string}")
	public void deselecionoUmOutroVestido(String string) {
		Em(SelecionarComprar.class).acionarBotaoTirarVestido();
	}

	@Quando("proceed {string}")
	public void proceed(String string) {
		Em(SelecionarComprar.class).acionarBotaoCheckOut2();
	}

	@Quando("clico em {string}")
	public void clicoEm(String string) {
		Em(SelecionarComprar.class).acionarBotaoCheckTerms();
	}

	@Quando("clico para ler {string}")
	public void clicoParaLer(String string) {
		Em(SelecionarComprar.class).acionarBotaoLerTermos();
	}

	@Quando("clico em fechar o botao")
	public void clicoEmFecharOBotao() {
		Em(SelecionarComprar.class).acionarBotaoCheckOut();
	}

	@Quando("clico no botao proceed CheckOut")
	public void clicoNoBotaoProceedCheckOut() {
		assertEquals("Total", driver.findElement(By.linkText("Total")).getText());
	}
}
