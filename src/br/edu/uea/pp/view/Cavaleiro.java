package br.edu.uea.pp.view;

import br.edu.uea.pp.controller.Personagem;
import br.edu.uea.pp.model.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {

	public Cavaleiro(String nome) {
		super(nome);
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void defender() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void andar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void guardarItem(String item) {
		// System.out.println("Cavaleiro " +this.nome + " está guardando " + item);
		
	}


	@Override
	public void usarItem() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void guardarItem() {
		// TODO Auto-generated method stub
		
	}


}
