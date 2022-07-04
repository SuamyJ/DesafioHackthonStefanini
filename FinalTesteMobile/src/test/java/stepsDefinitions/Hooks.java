package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
//import teste.Calculadora;

public class Hooks {
	
	@Before
	public void setUp() throws Exception { 
		acessarKeep();
		
	}
//	
//	@Before (order = 1, value = "@cenario2")
//	public void acessarCalculadora2() throws Exception { 
//		//calculadora.acessarCalculadora();
//		
//	}
//	
	@After ()
	public void fecharCalculadora(Scenario scenario) throws Exception {
		capturarScreenShot(scenario);
	driver.quit();
//	}
////	
//	@After (order = 0, value = "@cenario2")
//	public void fecharCalculadora2() throws Exception {
//		//calculadora.fecharTest();
//	
//}
}
}