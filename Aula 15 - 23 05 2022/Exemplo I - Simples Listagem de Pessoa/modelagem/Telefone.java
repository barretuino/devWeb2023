package br.barretuino.modelagem;

public class Telefone {
	//Atributos
	private TipoTelefone tipo;
	private int numero;
	
	//Métodos
	public TipoTelefone getTipo() {
		return tipo;
	}
	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}	
}