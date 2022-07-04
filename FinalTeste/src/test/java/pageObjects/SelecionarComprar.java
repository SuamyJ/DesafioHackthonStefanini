
package pageObjects;

import static utils.Utils.*; //Senão for static, tem que stanciar objeto utils. Static é melhor porque é só importar


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//Extends serve para receber os valores da pagina mencionada ex.: exteds BasePage
public class SelecionarComprar extends MoverSelecionar {

	// MoverSelecionar
	public void acionarAbaCasualDress() {
		abaDress.click();
	}

	// ELEMENTOS
	@FindBy(name = "Summer Dresses")
	public WebElement botaoSummerDress;

	public void acionarBotao() {
		botaoSummerDress.click();

	}

	public void acessarMenuCasualDress() {
		Actions acao = new Actions(driver);
		acao.moveToElement(abaDress).build().perform(); //sem isso ele passa sem avisar que passou
		acao.moveToElement(abaSummerDress).click().build().perform();
		//ContextClick é para clicar com o botão direito
	}

	@FindBy(linkText = "Add to cart")
	public WebElement botaoAddToCart;

	@FindBy(linkText = "Close window")
	public WebElement botaoFechar;

	@FindBy(linkText = "Add to cart")
	public WebElement OutrobotaoAddToCart;

	@FindBy(linkText = "Proceed to checkout")
	public WebElement botaoProceedToCheckOut;

	@FindBy(linkText = "Your shopping cart contains:")
	public WebElement quantidadeDeVestidos;

	@FindBy(linkText = "icon-minus")
	public WebElement botaoDeselicionarVestido;

	@FindBy(linkText = "Proceed to checkout")
	public WebElement botaoProceedCheckOut;

	@FindBy(id = "cgv")
	public WebElement selecionarCheckTerms;

	@FindBy(linkText = "(Read the Terms of Service)")
	public WebElement botaoLerTermos;

	@FindBy(linkText = "Close")
	public WebElement botaoFecharTermos;

	@FindBy(linkText = "Proceed to checkout")
	public WebElement botaoNovamenteProceedCheckOut;

	@FindBy(linkText = "Total")
	public WebElement checarACompra;

	public void acionarAddToCart() {
		botaoAddToCart.click();
	}

	public void acionarbotaoFechar() {
		botaoFechar.click();
	}

	public void acionarBotaoAddToCart2() {
		OutrobotaoAddToCart.click();
	}

	public void acionarBotaoProceedToCheckOut() {
		botaoProceedToCheckOut.click();
	}

	public void contarVestidos() {
		System.out.println("Imprimiu isso aqui");;
	}

	public void acionarBotaoTirarVestido() {
		botaoDeselicionarVestido.click();
	}
	public void acionarBotaoCheckOut2() {
		botaoProceedCheckOut.click();
	}
	public void acionarBotaoCheckTerms() {
		selecionarCheckTerms.click();
	}
	public void acionarBotaoLerTermos() {
		botaoLerTermos.click();
	}
	public void acionarBotaoFecharTermos() {
		botaoFecharTermos.click();
	}
	public void acionarBotaoCheckOut() {
		botaoNovamenteProceedCheckOut.click();
	}
	public void verChecarCompra() {
		checarACompra.click();
	}
}
