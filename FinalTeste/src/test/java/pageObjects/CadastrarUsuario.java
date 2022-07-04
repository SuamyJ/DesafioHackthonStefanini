package pageObjects;

import static utils.Utils.*; //usar * para pegar tudo da utils
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CadastrarUsuario {

//	Exemplo de Padrão PageObjects
//	
//	public void clicarSign() {
//		
//
//		driver.findElement(By.linkText("Log in to your customer account")).click();
//		
//}
//	
//	public void informarEmail(String Email) {
//		
//		driver.findElement(By.name("email_create")).sendKeys("jojojojo@gmail.com");
//	}
//	
//	public void acionarCreateAnAccount() {
//		
//		driver.findElement(By.name("SubmitCreate")).click();
//		
//		
//	}
//CTRL + SHIFT + F para identar o código, deixando mais bonito.

	@FindBy(linkText = "Log in to your customer account")
	private WebElement botaoSign;

	@FindBy(name = "email_create")
	private WebElement campoEmail;

	@FindBy(id = "SubmitCreate")
	private WebElement createAnAccount;

	@FindBy(id = "id_gender1")
	private WebElement campoTitle;

	@FindBy(id = "customer_firstname")
	private WebElement campoFirstName;

	@FindBy(id = "customer_lastname")
	private WebElement campoLastName;

	@FindBy(id = "passwd")
	private WebElement campoPassword;

	@FindBy(id = "address1")
	private WebElement campoEndereco;

	@FindBy(id = "city")
	private WebElement campoCidade;

	@FindBy(id = "id_state")
	private WebElement campoEstado;

	@FindBy(id = "postcode")
	private WebElement campoCodigoPostal;

	@FindBy(id = "phone")
	private WebElement campoTelefone;

	@FindBy(id = "submitAccount")
	private WebElement campoRegister;
	
	@FindBy(xpath = "//*[@id='center_column']/p/text())")
	private WebElement mensagem;
	//xpath – se tiver um elemento na tela que vc não consegue achar por ID ou css, usa-se o xpath. Existe plug-ins para pegar e xpath do login do google é absoluto, traz exatamente o lugar. Entretante é ruim porque se for adicionado algo anterior, vai bugar. Pra isso é melhor montar o xpath. Para saber mais é através do site: https://www.w3schools.com/xml/xpath_intro.asp
	public void acionarBotaoSign() {
		botaoSign.click();
	}

	public void informarCampoEmail(String email) {
		campoEmail.sendKeys(email);
	}

	public void acionarbotaoCreateAnAccount() {
		createAnAccount.click();
	}

	public void informarCampoTitle(String title) {
		campoTitle.sendKeys(title);
	}

	public void informarCampoFirstName(String firstName) {
		campoFirstName.sendKeys(firstName);
	}

	public void informarCampoLastName(String lastName) {
		campoLastName.sendKeys(lastName);
	}

	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);

	}

	public void informarCampoEndereco(String Endereco) {
		campoEndereco.sendKeys(Endereco);
	}

	public void informarCampoCidade(String Cidade) {
		campoCidade.sendKeys(Cidade);
	}

	public void informarCampoEstado(String Estado) {
		Select realSelect = new Select(campoEstado);
		realSelect.selectByVisibleText(Estado);
		// essa acao encontrei no site
		// https://stackoverflow.com/questions/9604336/selenium-webdriver-select-element

	}

	public void informarCampoCodigoPostal(String CodigoPostal) {
		campoCodigoPostal.sendKeys(CodigoPostal);}
		
	
	public void informarCampoTelefone(String Telefone) {
		campoTelefone.sendKeys(Telefone);
	}

	public void acionarCampoRegister() {
		campoRegister.click();
	}
	public WebElement GetElementMensagem() {
		return mensagem;
}
	
	public void realizarLogin(String email, String senha) {
		informarCampoEmail(email);
		informarCampoPassword(senha);
		acionarBotaoSign();
	
	}
}
