package gerencia;

//Giselle Souza - CB3020339
//Lucas Gomes - CB3021777

public class Produto {
	private int id, unidadeCompra;
	private String nome, descricao;
	private double qtdPrevistoMes, precoMaxComprado;
	
	public int getId() {
		return id;
	}
	
	public void setId(int _id) {
		id = _id;
	}
	
	public int getUnidadeCompra() {
		return unidadeCompra;
	}
	
	public void setUnidadeCompra(int _unidadeCompra) {
		unidadeCompra = _unidadeCompra;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String _nome) {
		nome = _nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String _descricao) {
		descricao = _descricao;
	}
	
	public double getQtdPrevistoMes() {
		return qtdPrevistoMes;
	}
	
	public void setQtdPrevistoMes(double _qtdPrevistoMes) {
		qtdPrevistoMes = _qtdPrevistoMes;
	}
	
	public double getPrecoMaxComprado() {
		return precoMaxComprado;
	}
	
	public void setPrecoMaxComprado(double _precoMaxComprado) {
		precoMaxComprado = _precoMaxComprado;
	}
}