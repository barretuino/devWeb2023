package br.barretuino.modelagem;

public class Endereco {
	//Atributos
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep;
	private String caixaPostal;
	private Estado estado;
	private String pais;
	
	//Métodos
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCaixaPostal() {
		return caixaPostal;
	}
	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@Override
	public String toString() {
		return getLogradouro() + ";"
				+ getNumero()  + ";"
				+ getBairro() + ";"
				+ getCep() + ";"
				+ getCaixaPostal() + ";"
				+ getCidade() + ";"
				+ getEstado().name() + ";"
				+ getPais();		
	}
}