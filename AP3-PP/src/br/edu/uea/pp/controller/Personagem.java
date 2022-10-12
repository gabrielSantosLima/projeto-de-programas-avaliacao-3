package br.edu.uea.pp.controller;
import br.edu.uea.pp.model.ComportamentoNormal;

public abstract class Personagem implements ComportamentoNormal  {
	
	protected String nome;
	
	public Personagem(String nome)
	{
		this.nome = nome;
	}
	
	
	protected abstract String getNome();
	
	public abstract void andar();
	
	public abstract void guardarItem(String item);
	
	public abstract void usarItem();

}
