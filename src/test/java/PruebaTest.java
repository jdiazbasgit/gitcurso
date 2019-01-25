import static org.junit.Assert.assertNotNull;

import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.Model;

import a.b.c.HomeController;

@RunWith(MockitoJUnitRunner.class)
public class PruebaTest {
	
	@InjectMocks
	private HomeController homeController;
	
	@InjectMocks
	private Model model;
	
	@Test
	public void test()
	{
		assertNotNull(homeController.home(Locale.getDefault(), model));
		
		
	}

}
