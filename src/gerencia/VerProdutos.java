package gerencia;

//Giselle Souza - CB3020339
//Lucas Gomes - CB3021777

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VerProdutos")
public class VerProdutos extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<a href='index.html'>Adicionar produto</a>");
		out.println("<h1>Lista de produtos</h1>");
		
		List<Produto> lista = ProdutoController.getListaProdutos();
		
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Id</th><th>Nome</th><th>Descrição</th><th>Unidade compra</th><th>Quantidade prevista no mês</th><th>Preço máx. comprado</th><th>Editar</th><th>Deletar</th></tr>");
		
		for(Produto p:lista){
			out.print("<tr><td>"+p.getId()+"</td><td>"+p.getNome()+"</td><td>"+p.getDescricao()+"</td><td>"+p.getUnidadeCompra()+"</td><td>"+p.getQtdPrevistoMes()+"</td><td>"+p.getPrecoMaxComprado()+"</td><td><a href='EditarProduto?id="+p.getId()+"'>Editar</a></td><td><a href='DeletarProduto?id="+p.getId()+"'>Deletar</a></td></tr>");
		}
		out.print("</table>");
		
		out.close();
	}
}