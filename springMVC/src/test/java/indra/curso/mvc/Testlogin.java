package indra.curso.mvc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import indra.curso.mvc.beans.Login;

public class Testlogin {
	@Autowired
	private HomeController homeController;
	private Login login;

	@Test
	public void test() {
		homeController = new HomeController();
		login = new Login();
		login.setClave("1234");
		login.setUsuario("pepe");
	}

	public HomeController getHomeController() {
		return homeController;
	}

	public void setHomeController(HomeController homeController) {
		this.homeController = homeController;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	
	
}
