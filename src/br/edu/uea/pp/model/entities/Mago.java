package br.edu.uea.pp.model.entities;
import br.edu.uea.pp.model.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico{

	public Mago(String nome) {
		super(nome);
	}

	@Override
	public void invisibilidade() {
	}

	@Override
	public void ultraRapidez() {
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
