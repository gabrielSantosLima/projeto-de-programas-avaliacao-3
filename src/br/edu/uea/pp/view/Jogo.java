package br.edu.uea.pp.view;

import java.util.List;
import br.edu.uea.pp.model.entities.Personagem;

public class Jogo {
	
	// Questão 2
	public void ControlarAcoesDosPersonagens(List<Personagem> personagens) {
		// Executa as ações comuns para cada personagem. Iteração utilizando streaming de listas
		personagens.stream().forEach(personagem -> {
			personagem.andar();
			//personagem.guardarItem();
			//personagem.usarItem();
		});
	}
}
