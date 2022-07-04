package interactive;

import static org.junit.Assert.*;

//tentei fazer o mais rápido possivel e tentei entender. O desafio WEB e Mobile me consumiram muito tempo, como também suas aulas

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import core.Pokemon;

public class PlayerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test //VerifyPlayer
	public void test() {
		Player jotaro = new Player("Jotaro");
		assertEquals("Jotaro", jotaro.getName());
		assertEquals(0, jotaro.getMoney());
		assertEquals(false, jotaro.isInBattle());
		assertSame(new Bag(), jotaro.getBag());
//		assertEquals(bag, player.getName());
//		assertEquals(new Pokemon[], player.getParty());
	
	}
	}
