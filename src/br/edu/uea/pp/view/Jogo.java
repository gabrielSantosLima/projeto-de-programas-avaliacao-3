package br.edu.uea.pp.view;

import java.util.List;

import br.edu.uea.pp.model.entities.Cavaleiro;
import br.edu.uea.pp.model.entities.Dragao;
import br.edu.uea.pp.model.entities.Item;
import br.edu.uea.pp.model.entities.Mago;
import br.edu.uea.pp.model.entities.Personagem;

public class Jogo {
	private Item sortearItem(List<Item> itens) {
		int indexMaximo = itens.size();
		int indexItem = sortearNumero(indexMaximo);
		return itens.get(indexItem);
	}
	
	private Personagem sortearPersonagem(List<Personagem> personagem) {
		int indexMaximo = personagem.size();
		int indexPersonagem = sortearNumero(indexMaximo);
		return personagem.get(indexPersonagem);
	}
	
	private int sortearNumero(int numeroMaximo) {
		return (int) Math.floor(Math.random()*numeroMaximo);
	}
	
	// Questão 2
	public void ControlarAcoesDosPersonagens(List<Personagem> personagens, List<Item> itens) {
		// Executa as ações comuns para cada personagem. Iteração utilizando streaming de listas.
		personagens.stream().forEach(personagem -> {
			Item item = sortearItem(itens); // Escolhe um item que será usado pelo personagem da vez.
			personagem.andar();
			personagem.guardarItem(item);
			personagem.usarItem(item);
			
			if(personagem instanceof Dragao) {
				int acao = sortearNumero(3);
				Dragao dragao = (Dragao) personagem;
				
				if(acao == 0) dragao.atirarFogo(); // Escolhe ações aleatórias para um dragão.
				else if(acao == 1) dragao.morder();
				else dragao.voar();
				
			}else if(personagem instanceof Mago) {
				int acao = sortearNumero(2);
				Mago mago = (Mago) personagem;
				
				if(acao == 0) mago.invisibilidade(); // Escolhe ações aleatórias para um mago.
				else mago.ultraRapidez();
				
			}else if(personagem instanceof Cavaleiro) {
				int acao = sortearNumero(3);
				Cavaleiro cavaleiro = (Cavaleiro) personagem;
				
				if(acao == 0) { // Escolhe ações aleatórias para um cavaleiro.
					Personagem atacado = sortearPersonagem(personagens);
					cavaleiro.atacar(item, atacado);
				}
				else if(acao == 1) cavaleiro.defender();
				else cavaleiro.saltar();
			}
			System.out.println(personagem.toString()); // Exibe vida do personagem.
		});
	}
}
