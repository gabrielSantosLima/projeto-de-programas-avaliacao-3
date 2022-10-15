package br.edu.uea.pp.model.entities;

public class Item {
	
	private String nome;
	private Integer dano;
	
	public Item(String nome, Integer dano) {
		this.nome = nome;
		this.dano = dano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDano() {
		return dano;
	}

	public void setDano(Integer dano) {
		this.dano = dano;
	}
	
	

}
