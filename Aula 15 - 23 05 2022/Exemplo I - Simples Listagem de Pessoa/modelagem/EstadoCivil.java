package br.barretuino.modelagem;

public enum EstadoCivil {
	AMASIADO("Amasiado"),
	CASADO("Casado"),
	DIVORCIADO("Divorciado"),
	SOLTEIRO("Solteiro"),
	VIUVO("Viuvo");
	
	private String descricao;
	
	EstadoCivil(String descricao){
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}