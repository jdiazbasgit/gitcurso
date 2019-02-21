package indra.curso.mvc.beans;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoginTest {
	
	private Login login;
	
	public void carga() {
		login = new Login();
		login.setClave("titaso");
		login.setUsuario("tito");
	}

	
	@Test
	public void test_getUsuario() {
		carga();
		assertEquals("tito", login.getUsuario());
	}

	/*@Test
	public void test_setUsuario() {
		assertEquals(login.getUsuario(), login.setUsuario("tito"));
	}*/

	@Test
	public void test_getClave() {
		carga();
		assertEquals("titaso", login.getClave());
	}

	/*@Test
	public void test_setClave() {
		assertEquals("titaso", login.setUsuario("titaso"));
	}*/

}
