package br.barretuino.modelagem;

import java.util.Date;
import java.util.List;

public class PessoaFisica extends Pessoa {
	//Atributos
	private long rg;
	private long cpf;
	private String nome;
	private String email;
	private List<PessoaFisica> filiacao;
	private Date dataNascimento;
	private Date dataObtio;
	private EstadoCivil estadoCivil;
	
	//Métodos
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<PessoaFisica> getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(List<PessoaFisica> filiacao) {
		this.filiacao = filiacao;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date getDataObtio() {
		return dataObtio;
	}
	public void setDataObtio(Date dataObtio) {
		this.dataObtio = dataObtio;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}