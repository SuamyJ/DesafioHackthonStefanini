package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin =  {"pretty", "html:target/cucumber-report"},//Puglin = {“pretty”} serve para mostrar o erro detalhado
		features = "src/test/resources/features",
		glue = "stepsDefinitions", //Glue – serve para indicar onde tem os steps
		tags = "@selecionarV",//tags – serve para vc executar uma tag que vc colocou na funcionalidade, tipo, executar 
		snippets = SnippetType.CAMELCASE, //- Snippets serve para escrever os nomes sem os “_”, separando por letra maiúscula, deixando menor, visto que o cucumber é bem extenso
		monochrome = true,
		dryRun = false //serve para não executar os testes, gerar o que estiver faltando. Lembrando em deixar em false, deixar em true quando for para gerar os steps
		
		)


public class RunnerTest {

	
	
	
}
