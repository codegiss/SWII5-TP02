package gerencia;

//Giselle Souza - CB3020339
//Lucas Gomes - CB3021777

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeletarProduto")
public class DeletarProduto extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		ProdutoController.deletarProduto(id-1);
		response.sendRedirect("VerProdutos");
	}
}