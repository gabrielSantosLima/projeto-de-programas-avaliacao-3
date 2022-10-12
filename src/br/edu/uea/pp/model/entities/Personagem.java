package br.edu.uea.pp.model.entities;
import br.edu.uea.pp.model.ComportamentoNormal;

public abstract class Personagem implements ComportamentoNormal  {
	
	protected String nome;
	
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