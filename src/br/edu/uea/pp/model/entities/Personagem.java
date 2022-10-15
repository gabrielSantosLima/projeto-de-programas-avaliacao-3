package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoNormal;

//Questão 2.b. Classe "Personagem" do tipo abstrato pois não deve ser instanciada.
public abstract class Personagem implements ComportamentoNormal  { 
	
	private String nome;
	private Integer vida;
	
	public Personagem(String nome, Integer vida){
		this.nome = nome;
		this.vida = vida;
	}
	
	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void recebeDano(Integer dano);
	
}