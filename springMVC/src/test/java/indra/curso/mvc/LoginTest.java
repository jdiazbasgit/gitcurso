package indra.curso.mvc;

import static org.junit.Assert.*;
import org.junit.Test;

import indra.curso.mvc.beans.Login;

public class LoginTest {

	private HomeController homeController;
	private Login login;

	@Test
	public void test() {
		homeController = new HomeController();
		login = new Login();
		login.setUsuario("pepe");
		login.setClave("1234");
		assertNotNull(homeController.login(login));
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
