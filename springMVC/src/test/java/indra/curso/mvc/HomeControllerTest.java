package indra.curso.mvc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

import indra.curso.mvc.beans.Login;
import indra.curso.mvc.configuracion.Configuracion;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {Configuracion.class})
@WebAppConfiguration
@TestExecutionListeners(inheritListeners = false, listeners =
{DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class})

public class HomeControllerTest {

	@Autowired
	private HomeController homeController;
	
	private Login login;
	
	@Test
	public void test() {
		String res = (String) homeController.dimeAlgo("looper", "looper").getModel().get("texto");
		assertNotEquals("",res);
		assertNotNull(homeController.home());
	}
	
	@Test
	public void testLogin() { 
		login = new Login();
		login.setUsuario("loop");
		login.setClave("loop");
		assertEquals("USUARIO CORRECTO", homeController.login(login).getModel().get("texto"));
	}

	
}
