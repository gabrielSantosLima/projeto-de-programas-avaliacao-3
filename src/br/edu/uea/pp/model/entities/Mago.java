package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico{

	public Mago(String nome) {
		super(nome);
	}

	public void invisibilidade() {
		System.out.println(this.getNome() + " está invisivel");
	}

	public void ultraRapidez() {
	}

	public void andar() {
	}

	public void guardarItem() {
	}

	public void usarItem() {
	}
}
