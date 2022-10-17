package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoFeroz;

public class Dragao extends Personagem implements ComportamentoFeroz{

	public Dragao(String nome, Integer vida) {
		super(nome, vida);
	}

	@Override
	public void atirarFogo() {
		System.out.println("[Dragão] "+this.getNome() + " atirou fogo.");
	}

	@Override
	public void voar() {
		System.out.println("[Dragão] "+this.getNome() + " voôu para longe.");
	}

	@Override
	public void morder() {
		System.out.println("[Dragão] "+this.getNome() + " mordeu com voracidade.");
	}

	@Override
	public void andar() {
		System.out.println("[Dragão] "+this.getNome() + " andou.");
	}

	@Override
	public void guardarItem(Item item) {
		System.out.println("[Dragão] "+this.getNome() + " guardou " + item.getNome()+ ".");
	}

	@Override
	public void usarItem(Item item) {
		System.out.println("[Dragão] "+this.getNome() + " usou " + item.getNome() + ".");
	}

	@Override
	public void recebeDano(int dano) {
		System.out.println("[Dragão] "+this.getNome() + " recebeu um dano de -" + dano + "HP.");
	}
}
