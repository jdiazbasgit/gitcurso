package indra.curso.mvc;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	public void carga() {
		login = new Login();
		login.setClave("titaso");
		login.setUsuario("tito");
	}
	
	
	@Test
	public void test_home() {
		
		assertNotNull(homeController.home());
	}
	
	@Test
	public void test_login() {
		carga();
		assertNotNull(homeController.login(login));
	}
	
	@Test
	public void test_dimeAlgo() {
		assertNotNull(homeController.dimeAlgo("tito", "gonzalez"));
	}

	
}
