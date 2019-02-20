package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PrimerServlet
 */
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private int contador;

    /**
     * Default constructor. 
     */
    public PrimerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	/*PrintWriter p=new PrintWriter(response.getOutputStream());
	p.println("HOLA COMO ESTAS");
	p.flush();*/
		
		setContador(getContador()+1);
		
		String nombre=request.getParameter("nombre");
		
		String salida ="<b>has escrito "+nombre.toUpperCase()+" y tiene "+nombre.length()+" letras</b>";
		
		response.getWriter().println(salida);
		response.getWriter().println("<br>");
		
		response.getWriter().println("Eres el visitante numero: "+getContador() );
		
		HttpSession sesion=request.getSession(true);
		
		if(sesion.getAttribute("visitas")==null)
		{
			sesion.setAttribute("visitas", 1);
		}
		else
		{
			int visitas=(Integer) sesion.getAttribute("visitas");
			visitas++;
			sesion.setAttribute("visitas", visitas);
		}
		
		response.getWriter().println("<br>");
		response.getWriter().println("Tu has venido a verme: "+sesion.getAttribute("visitas"));
		
		
		response.getWriter().flush();
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
