package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
					//doPost --> SOBRESCREVE O M�TODO SERVICE E ACEITA APENAS REQUISI��ES POST;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa.");
		
		String nomeEmpresa = request.getParameter("nome"); //RECEBE O VALOR PASSADO NO PAR�METRO DA URL
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco(); //simulando banco de dados
		banco.adiciona(empresa); //adiciona empresa � Arraylist da classe Banco
		
		//chamar JSP
		//CONFIGURA A ROTA DE RESPOSTA AO NAVEGADOR, despacha a requisi��o para o JSP
		//SERVLET RECEBE A REQUISI��O E DESPACHA PARA O JSP
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCadastrada.jsp");
		request.setAttribute("empresa", empresa.getNome()); //recebe 2 par�metros -> um nome ("apelido") e um objeto;
		rd.forward(request, response);
		
	}

}
