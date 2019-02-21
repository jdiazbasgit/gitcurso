package indra.curso.mvc.configuracion;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class ConfiguracionTest {

	@Test
	public void test_getInternalResourceViewResolver() {
		Configuracion conf = new Configuracion();
		assertEquals(new InternalResourceViewResolver().getClass(), conf.getInternalResourceViewResolver().getClass());
	}

}
