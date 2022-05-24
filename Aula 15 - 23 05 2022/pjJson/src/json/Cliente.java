package json;

import java.util.List;

public class Cliente {
	private int codigo;
	private String nome;
	private float altura;
	private boolean status;
	private double peso;
	private List<String> endereco;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public List<String> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<String> endereco) {
		this.endereco = endereco;
	}
	
}
