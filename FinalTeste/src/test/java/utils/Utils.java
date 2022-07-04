package utils;

import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

	import io.cucumber.core.api.Scenario;

	public class Utils {
		
		public static WebDriver driver;
		//-monochrome serve para deixar todo branco, mais um questão de estética, para que visualize melhor.
		public static void acessarSistema() {
			System.setProperty("webdriver.chrome.driver",  "C:\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get("http://automationpractice.com/index.php");
			
		}
		
		public static <T> T Na(Class<T> classe){
			return PageFactory.initElements(driver, classe);
		}
		
		public static <T> T Em(Class<T> classe){
			return PageFactory.initElements(driver, classe);
		}
//		usei o Na e Em, porque realmente fica mais fácil para ler, tipo NaAccountPage, NaComprarRoupasSteps.
		
		public static void capturarTela(Scenario scenario) {
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);;
			scenario.embed(screenshot, "image/png");
		}
		
		
	}
	
