package gerencia;

//Giselle Souza - CB3020339
//Lucas Gomes - CB3021777

import java.io.IOException;
import java.io.PrintWriter;

//Giselle Souza - CB3020339
//Lucas Gomes - CB3021777

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditarProduto")
public class EditarProduto extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Atualizar Produto</h1>");
		
		Produto p=ProdutoController.findById(id);
		
		out.print("<form action='EditarProduto2' method='post'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='hidden' name='id' value='"+p.getId()+"'/></td></tr>");
		out.print("<tr><td>Nome:</td><td><input type='text' name='nome' value='"+p.getNome()+"'/></td></tr>");
		out.print("<tr><td>Descrição:</td><td><input type='text' name='descricao' value='"+p.getDescricao()+"'/></td></tr>");
		out.print("<tr><td>Unidade compra:</td><td><input type='text' name='unidadeCompra' value='"+p.getUnidadeCompra()+"'/></td></tr>");
		out.print("<tr><td>Quantidade prevista mês:</td><td><input type='text' name='qtdPrevistoMes' value='"+p.getQtdPrevistoMes()+"'/></td></tr>");
		out.print("<tr><td>Preço máx. comprado:</td><td><input type='text' name='precoMaxComprado' value='"+p.getPrecoMaxComprado()+"'/></td></tr>");
		
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Editar e salvar'/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		
		ProdutoController.atualizarProduto(p);
		
		out.close();
	}
}