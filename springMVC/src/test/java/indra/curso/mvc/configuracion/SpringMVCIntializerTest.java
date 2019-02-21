package indra.curso.mvc.configuracion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SpringMVCIntializerTest {

	@Test
	public void test_getRootConfigClasses() {
		assertEquals(Configuracion.class, (new SpringMVCIntializer().getRootConfigClasses()[0]));
	}
	
	@Test
	public void test_getServletConfigClasses() {
		assertNull(new SpringMVCIntializer().getServletConfigClasses());
	}

	@Test
	public void test_getServletMappings() {
		assertEquals("/", new SpringMVCIntializer().getServletMappings()[0]);
	}
	
}
