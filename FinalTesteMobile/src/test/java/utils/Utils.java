package utils;
import io.appium.java_client.TouchAction;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.core.api.Scenario;
import javafx.scene.shape.MoveTo;

public class Utils {
	
	
	public static AppiumDriver<WebElement> driver;

	public static void  acessarKeep() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "notizen.basic.notes.notas.note.notepad");
		desiredCapabilities.setCapability("appActivity", "notizen.basic.notes.notas.note.notepad.main.SplashActivity");
		
		driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
}

	//Switch para esquerda e direita
	public static void scroll(int inicioX, int inicioY, int fimX, int fimY) {
		TouchAction touch = new TouchAction(driver);
		
		touch.press(PointOption.point(inicioX, inicioY))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
		.moveTo(PointOption.point(fimX, fimY))
		.release()
		.perform();
		
	}
	public static void swipeDireita() {
		Dimension size = driver.manage().window().getSize();
	
		int inicioX = (int) (size.width * 0.05);
		int fimX = (int) (size.width * 0.95);
		
		int inicioY = size.height / 3;
		
		scroll(inicioX, inicioY, fimX, inicioY);
	}
	
	public static void capturarScreenShot (Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	
}
}
