package indra.curso.mvc;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
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
	
	@Test
	public void test() {
		
		
		assertController(homeController.login(login));
		
	}


	private void assertController(ModelAndView login) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @return the homeController
	 */
	public HomeController getHomeController() {
		return homeController;
	}


	/**
	 * @param homeController the homeController to set
	 */
	public void setHomeController(HomeController homeController) {
		this.homeController = homeController;
	}


	/**
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}


	/**
	 * @param login the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}
	
	
	
	



	
	


}
