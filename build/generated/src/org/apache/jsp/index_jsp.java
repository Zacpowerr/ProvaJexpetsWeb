package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" \n");
      out.write("<html>\n");
      out.write("\t<head> \n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t        <link href = \"style.css\" rel = \"stylesheet\"/>\n");
      out.write("\t        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t        <title>Formulario</title>\n");
      out.write("\t</head>\n");
      out.write("\t<body> \n");
      out.write("\t\t<form method=\"post\" action=\"UsuarioControl?cmd=salvar\">\n");
      out.write("\t\t\t<div id= \"lado_1\">\n");
      out.write("\t\t\t<label> Nome:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Nome\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Telefone:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Telefone\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("                      \n");
      out.write("\t\t\t<label> Cpf:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Cpf\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Email:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Email\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Login:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Login\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Senha:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Senha\" type=\"password\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Superior:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Superior\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Cargo:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Cargo\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"lado_2\">\n");
      out.write("\t\t\t<label> Rua:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Rua\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Numero:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Numero\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Complemento:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Complemento\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Cep:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Cep\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Bairro:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Bairro\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Cidade:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Cidade\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t<label> Estado:</label>\n");
      out.write("\t\t\t<input class = \"inputbox\" name=\"Estado\" type=\"text\" required=\"true\"/>\n");
      out.write("\t\t        <br /><br />\n");
      out.write("\t\t\t</div>\n");
      out.write("                     <input id = \"botao\"value=\"Salvar\" type=\"submit\"/>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t\n");
      out.write("\t</body>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
