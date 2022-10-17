package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {
	
	public Cavaleiro(String nome, Integer vida) {
		super(nome, vida);
	}

	@Override
	public void atacar(Item item, Personagem inimigo) {
		System.out.println("[Cavaleiro] "+this.getNome() + " está atacando " + inimigo.getNome() + " com " + item.getNome()+ ".");
		inimigo.recebeDano(item.getDano());
	}


	@Override
	public void defender() {
		System.out.println("[Cavaleiro] "+this.getNome()+ " se defendeu!");
	}


	@Override
	public void saltar() {
		System.out.println("[Cavaleiro] "+this.getNome()+ " saltou!");
	}
	
	@Override
	public void andar() {
		System.out.println("[Cavaleiro] "+this.getNome()+ " deu alguns passos.");
	}


	@Override
	public void guardarItem(Item item) {
		System.out.println("[Cavaleiro] "+this.getNome()+ " guardou " + item.getNome()+ ".");
	}


	@Override
	public void usarItem(Item item) {
		System.out.println("[Cavaleiro] "+this.getNome() + " usou " + item.getNome()+ ".");
	}

	@Override
	public void recebeDano(int dano) {
		System.out.println("[Cavaleiro] "+this.getNome() + " recebeu um dano de -" + dano + "HP.");
	}


}
