package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MoverSelecionar {
	
		@FindBy(linkText = "Dresses")
		public WebElement abaDress;
		
		@FindBy(linkText = "Summer Dresses")
		public WebElement abaSummerDress;
		
		public void acionarAbaAdmin() {
			abaSummerDress.click();
		}
		
		
		
}
