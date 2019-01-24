package a.b.c;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.Model;

@RunWith(MockitoJUnitRunner.class)
public class PruebaTest {

	@InjectMocks
	private HomeController homeController;
	
	@InjectMocks
	private Model model;
	
	
	public Date date;
	
	@Before
	public void previo() {
MockitoAnnotations.initMocks(this);
		 date= new Date();
	}
	
	@Test
	public void test() {
		
		String salida=homeController.home(Locale.getDefault()	, model);
		
		assertNotNull(salida);
	}

	
}
