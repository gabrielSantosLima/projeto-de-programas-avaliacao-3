package br.edu.uea.pp.model;

import br.edu.uea.pp.model.entities.Item;
import br.edu.uea.pp.model.entities.Personagem;

public interface ComportamentoHeroico {
	
	void atacar(Item item, Personagem inimigo);
	void defender();
	void saltar();

}
