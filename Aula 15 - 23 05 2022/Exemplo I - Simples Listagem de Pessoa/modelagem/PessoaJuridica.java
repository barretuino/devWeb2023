package br.barretuino.modelagem;

import java.util.Date;

public class PessoaJuridica extends Pessoa {
	//Atributos
	private String razaoSocial;
	private String nomeFantasia;
	private String site;
	private long cnpj;
	private long inscricaoEstadual;
	private long inscricaoMunicipal;
	private Date dataFundacao;
	private Date dataEncerramento;
	
	//Métodos
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public long getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(long inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public long getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(long inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public Date getDataEncerramento() {
		return dataEncerramento;
	}
	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
}