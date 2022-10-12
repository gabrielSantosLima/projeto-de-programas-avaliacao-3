package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {

	public Cavaleiro(String nome) {
		super(nome);
	}

	@Override
	public void atacar() {
	}


	@Override
	public void defender() {
	}


	@Override
	public void saltar() {
	}
	
	@Override
	public void andar() {
	}


	@Override
	public void guardarItem() {
	}


	@Override
	public void usarItem() {
	}
}
