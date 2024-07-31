package gerencia;

//Giselle Souza - CB3020339
//Lucas Gomes - CB3021777

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditarProduto2")
public class EditarProduto2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		
		String nome=request.getParameter("nome");
		String descricao=request.getParameter("descricao");
		double unidadeCompra=Double.parseDouble(request.getParameter("unidadeCompra"));
		double qtdPrevistoMes=Double.parseDouble(request.getParameter("qtdPrevistoMes"));
		double precoMaxComprado=Double.parseDouble(request.getParameter("precoMaxComprado"));
		
		int _unidadeCompra = (int) unidadeCompra;
		int _qtdPrevistoMes = (int) qtdPrevistoMes;
		
		Produto p=new Produto();
		//int proximoId = ProdutoController.ultimoId() + 1;
		p.setId(id);
		p.setNome(nome);
		p.setDescricao(descricao);
		p.setUnidadeCompra(_unidadeCompra);
		p.setQtdPrevistoMes(_qtdPrevistoMes);
		p.setPrecoMaxComprado(precoMaxComprado);

		ProdutoController.atualizarProduto(p);
		
		response.sendRedirect("VerProdutos");

		out.close();
	}
}