package br.barretuino.modelagem;

public enum TipoTelefone {	
	CELULAR("Celular"),
	RECADO("Recado"),
	RESIDENCIAL("Residencial"),
	TRABALHO("Trabalho");
	
	private String descricao;
	
	TipoTelefone(String descricao){
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}