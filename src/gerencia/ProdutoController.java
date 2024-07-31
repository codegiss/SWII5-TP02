package gerencia;

//Giselle Souza - CB3020339
//Lucas Gomes - CB3021777

import java.util.ArrayList;
import java.util.Comparator;

public class ProdutoController {
	private static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	private static int lastId = 0;
	
	public static ArrayList<Produto> getListaProdutos() {
		listaProdutos.sort(Comparator.comparingInt(Produto::getId));
		return listaProdutos;
	}
	
	public static int ultimoId() {
		return lastId++;
	}
	
	public static Produto findById(int id) {
		for(Produto p:listaProdutos) {
			if(p.getId() == id)
				return p;
		}
		return new Produto();
	}
	
	public static boolean adicionarProduto(Produto produto) {
		return listaProdutos.add(produto);
	}
	
	public static void deletarProduto(int idProduto) {
		listaProdutos.remove(idProduto);
	}
	
	public static void atualizarProduto(Produto p) {
		for(Produto produto:listaProdutos) {
			if(produto.getId() == p.getId()) {
				listaProdutos.remove(produto);
				listaProdutos.add(p);
			}
		}
	}
}
