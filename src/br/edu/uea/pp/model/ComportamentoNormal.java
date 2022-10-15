package br.edu.uea.pp.model;

import br.edu.uea.pp.model.entities.Item;

public interface ComportamentoNormal {
	
	void andar();
	void guardarItem(Item item);
	void usarItem(Item item);
}
