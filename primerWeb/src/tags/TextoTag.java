package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class TextoTag extends TagSupport {

	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return SKIP_BODY;
	}
	
	
	@Override
	public int doEndTag() throws JspException {

		RepeticionesBodyTag papa=(RepeticionesBodyTag) getParent();
		try {
			pageContext.getOut().println(papa.getTexto().toUpperCase());
			return EVAL_PAGE;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return SKIP_PAGE;
		}
	
	
	
	}
}
