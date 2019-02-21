package indra.curso.mvc;

import static org.junit.Assert.*;

import org.junit.Test;

import indra.curso.mvc.beans.Login;

public class TestLogin {
	
	private Login login;
	
	@Test
	public void test() {
		assertNotNull(login.getClave());
		assertNotNull(login.getUsuario());
	}

}
