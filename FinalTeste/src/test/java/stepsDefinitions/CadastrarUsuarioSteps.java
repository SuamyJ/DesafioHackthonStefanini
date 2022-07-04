package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {

//	AccountPage AP = new AccountPage(); (padrão page objects)
//PageFactory – ele suplementa a arquitetura da pageObject que tem a função de mapeamento de elemento mais simples; 2 leitura melhor do código; melhor abstração da página do sistema
	@Dado("que estou na pagina principal {string}")
	public void queEstouNaPaginaPrincipal(String pageTitle) {
		assertEquals(driver.getTitle(), pageTitle);
	}

	@Quando("eu acionar a aba SignIn")
	public void euAcionarAAbaSignIn() {
		Na(CadastrarUsuario.class).acionarBotaoSign();
		//Na(AccountPage.class)acionarBotaoSign();
	}

	@Quando("informar o campo email {string}")
	public void informarOCampoEmail(String email) {
		Na(CadastrarUsuario.class).informarCampoEmail(email);
	////AP.informarCampoEmail(email); (padrão page objects)
	}

	@Quando("acionar o botao CreateAnAccount")
	public void acionarOBotaoCreateAnAccount() {
		Na(CadastrarUsuario.class).acionarbotaoCreateAnAccount();
	}

	@Quando("selecionar o campo {string}")
	public void selecionarOCampo(String title) {
		Na(CadastrarUsuario.class).informarCampoTitle(title);
	}

	@Quando("informar no campo Firstname {string}")
	public void informarNoCampoFirstname(String firstName) {
		Na(CadastrarUsuario.class).informarCampoFirstName(firstName);
	}

	@Quando("informar no campo Last {string}")
	public void informarNoCampoLast(String lastName) {
		Na(CadastrarUsuario.class).informarCampoLastName(lastName);
	}

	@Quando("informar no campo  password {string}")
	public void informarNoCampoPassword(String Password) {
		Na(CadastrarUsuario.class).informarCampoPassword(Password);
	}

	@Quando("informar no campo adress {string}")
	public void informarNoCampoAdress(String Endereco) {
		Na(CadastrarUsuario.class).informarCampoEndereco(Endereco);
	}

	@Quando("informar no campo State {string}")
	public void informarNoCampoState(String Estado) {
		Na(CadastrarUsuario.class).informarCampoEstado(Estado);
	}

	@Quando("informar no campo city {string}")
	public void informarNoCampoCity(String Cidade) {
		Na(CadastrarUsuario.class).informarCampoCidade(Cidade);
	}

	@Quando("informar no campo Zip\\/PostalCode {string}")
	public void informarNoCampoZipPostalCode(String CodigoPostal) {
		Na(CadastrarUsuario.class).informarCampoCodigoPostal(CodigoPostal);
	}

	@Quando("informar no campo MobilePhone {string}")
	public void informarNoCampoMobilePhone(String Telefone) {
		Na(CadastrarUsuario.class).informarCampoTelefone(Telefone);
	}

	@Quando("acionar o botao Register")
	public void acionarOBotaoRegister() {
		Na(CadastrarUsuario.class).acionarCampoRegister();
	}

	@Entao("o sistema cadastra o usuario exibindo a mensagem {string}")
	public void oSistemaCadastraOUsuario(String Welcome) {
		assertTrue(driver.findElement(By.name("welcome")).isDisplayed());
		assertEquals(driver.findElement(By.name("welcome")).getText(), Welcome);
		// assertEquals para dizer que foi cadastrado com sucesso
		
	}

}
