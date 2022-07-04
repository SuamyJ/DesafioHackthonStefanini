package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.CadastrarUsuario;

import static utils.Utils.*;

public class Hooks {

	// executa antes de qualquer teste – posso colocar ( ) para só executar antes da
	// tag
	@Before(value = "@NotCadastrarUsuario)") // executar todos menos o @cadastro
	public void setUp() {
		acessarSistema();
		Na(CadastrarUsuario.class).realizarLogin("JosephJoestar@gmail.com", "123456");

	}

	@Before(value = "@CadastrarUsuario")
	public void funcionalidadeLogin() {
		acessarSistema();
	}

//@after – executa depois do before. O @order no after, serve para a mesma coisa que no order, entretanto não começa com 0,1,2,3, mas ao contrário, 3,2,1,0.
	@After()
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		driver.quit();
	}
}
