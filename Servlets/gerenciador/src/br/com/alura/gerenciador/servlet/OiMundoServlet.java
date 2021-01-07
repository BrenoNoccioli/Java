package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/oi") //configurando o "nome" de requisi��o do servlet
public class OiMundoServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		//RECEBE POR PAR�METRO DOIS OBJETOS QUE SERVEM PARA req e res DO HTTP;
		//PARA ISSO � PRECISO ESTABELECER UM "APELIDO" DE CHAMADA/REQUISI��O E QUAL O OBJETO DE RESPOSTA;
		
		PrintWriter out = resp.getWriter(); //IMPRIME NO FLUXO DE RESPOSTA PARA O NAVEGADOR;
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo! Este � meu primeiro servlet!");
		out.println("</body>");
		out.println("</html>");

		System.out.println("OiMundoServlet chamado");
	}
}
