package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {

	public Cavaleiro(String nome) {
		super(nome);
	}

	@Override
	public void atacar() {
		System.out.println(this.getNome() + "está atacando");
	}


	@Override
	public void defender() {
		System.out.println(this.getNome()+ " se defendeu!");
	}


	@Override
	public void saltar() {
		System.out.println(this.getNome()+ " saltou!");
	}
	
	@Override
	public void andar() {
		System.out.println(this.getNome()+ " deu alguns passos");
	}


	@Override
	public void guardarItem() {
		// mudar método
		System.out.println(this.getNome()+ " guardou uma espada!");
	}


	@Override
	public void usarItem() {
		System.out.println(this.getNome() + " usou a espada!");
	}


}
