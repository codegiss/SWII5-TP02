package gerencia;

//Giselle Souza - CB3020339
//Lucas Gomes - CB3021777

//import gerencia.ProdutoController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdicionarProduto")
public class AdicionarProduto extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String nome=request.getParameter("nome");
		String descricao=request.getParameter("descricao");
		int unidadeCompra=Integer.parseInt(request.getParameter("unidadeCompra"));
		int qtdPrevistoMes=Integer.parseInt(request.getParameter("qtdPrevistoMes"));
		double precoMaxComprado=Double.parseDouble(request.getParameter("precoMaxComprado"));
		
		Produto p=new Produto();
		int proximoId = ProdutoController.ultimoId() + 1;
		p.setId(proximoId);
		p.setNome(nome);
		p.setDescricao(descricao);
		p.setUnidadeCompra(unidadeCompra);
		p.setQtdPrevistoMes(qtdPrevistoMes);
		p.setPrecoMaxComprado(precoMaxComprado);
		
		boolean status=ProdutoController.adicionarProduto(p);
		if(status){
			out.print("<p>Produto adicionado com sucesso!</p>");
			request.getRequestDispatcher("index.html").include(request, response);
	
		} else {
		out.println("Não foi possível adicionar produto.");
		}
		
		out.close();
	}
}