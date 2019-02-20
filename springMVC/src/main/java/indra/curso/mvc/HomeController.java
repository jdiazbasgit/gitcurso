package indra.curso.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import indra.curso.mvc.beans.Login;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView= new ModelAndView("login");
		
		modelAndView.addObject(new Login());
		return modelAndView;
	}
	
	@RequestMapping("login.html")
	public ModelAndView login(Login login)
	{
		ModelAndView modelAndView= new ModelAndView();
		
		String texto="USUARIO ERRONELO";
		if(login.getUsuario().equals("pepe") &&  login.getClave().equals("1234"))
		texto="USUARIO CORRECTO";
		
		modelAndView.addObject("texto",texto);
		return modelAndView;
	}
	
	
	@RequestMapping("guapo/{nombre}")
	public ModelAndView dimeAlgo(@PathVariable("nombre") String nombre,
			@RequestParam("apellido") String apellido) {
		
		ModelAndView modelAndView= new ModelAndView("miPagina");
		modelAndView.addObject("texto", "has escrito "+nombre.toUpperCase()
		+ "-"+apellido.toUpperCase()+" y tiene "+nombre.length()+" letras");
		
		return modelAndView ;
	}
	
}









