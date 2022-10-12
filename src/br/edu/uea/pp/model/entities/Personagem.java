package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoNormal;

//Questão 2.b. Classe "Personagem" do tipo abstrato pois não deve ser instanciada.
public abstract class Personagem implements ComportamentoNormal  { 
	
	private String nome;
	
	public Personagem(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}