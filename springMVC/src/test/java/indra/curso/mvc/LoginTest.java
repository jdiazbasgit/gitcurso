package indra.curso.mvc;

import static org.junit.Assert.*;
import org.junit.Test;

import indra.curso.mvc.beans.Login;

public class LoginTest {

	private HomeController homeController;
	private Login login;
	private String texto;

	@Test
	public void test() {
		homeController = new HomeController();
		login = new Login();
		getLogin().setUsuario("pepe");
		getLogin().setClave("1234");
		setTexto(getHomeController().login(getLogin()).getModel().get("texto").toString());
		assertNotNull("",getTexto());
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

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
