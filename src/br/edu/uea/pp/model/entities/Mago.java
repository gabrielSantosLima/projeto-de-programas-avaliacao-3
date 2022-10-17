package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico{

	public Mago(String nome, Integer vida) {
		super(nome, vida);
	}

	@Override
	public void invisibilidade() {
		System.out.println("[Mago] "+this.getNome() + " está invisivel.");
	}

	@Override
	public void ultraRapidez() {
		System.out.println("[Mago] "+this.getNome() + " está ultra veloz.");
	}

	@Override
	public void andar() {
		System.out.println("[Mago] "+this.getNome() + " deu alguns passos.");
	}

	@Override
	public void guardarItem(Item item) {
		System.out.println("[Mago] "+this.getNome()+ " guardou " + item.getNome()+ ".");
	}

	@Override
	public void usarItem(Item item) {
		System.out.println("[Mago] "+this.getNome()+ " usou " + item.getNome()+ ".");
	}

	@Override
	public void recebeDano(int dano) {
		System.out.println("[Mago] "+this.getNome() + " recebeu um dano de -" + dano + "HP.");
	}
}
