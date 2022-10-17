package br.edu.uea.pp;

import br.edu.uea.pp.model.entities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.edu.uea.pp.model.entities.Personagem;
import br.edu.uea.pp.view.Jogo;

public class Principal {
	public static void main(String[] args) {
		
		int rodadas = 7;
		int rodadaAtual = 0;
		Personagem mago = new Mago("Mago", 100);
		((Mago)mago).invisibilidade(); //Questão 3.c

		
		Jogo jogo = new Jogo();
		List<Personagem> personagens = new ArrayList<>();
		personagens.add(new Cavaleiro("Sir Robin", 100)); // Questão 3.a
		personagens.add(new Mago("Octus", 100));
		personagens.add(new Dragao("Fenrir", 100));
		personagens.add(new Cavaleiro("Sir Magnus", 100));
		personagens.add(new Mago("Rubert", 100));
		personagens.add(new Dragao("Dracarys", 100));
		
		List<Item> itens = new ArrayList<>(); // Adiciona lista de itens aos jogadores
		itens.add(new Item("Pedra filosofal", 100));
		itens.add(new Item("Chama negra", 30));
		itens.add(new Item("Olho de Cthulhu", 90));
		
		while(rodadaAtual != rodadas && personagens.size() != 1) {
			System.out.println("\n========= RODADA "+ (rodadaAtual + 1) +" =========");
			jogo.ControlarAcoesDosPersonagens(personagens, itens); // Questão 3.b
			personagens = personagens.stream()
					.filter(personagem -> personagem.getVida() > 1)
					.collect(Collectors.toList()); // Verifica personagens que estão com vida maior que 0.
			rodadaAtual++;
		}
		
		showWinner(personagens);
		
		
	}
	
	public static void showWinner(List<Personagem> personagens) {

		System.out.println("\n===== FIM DA PARTIDA =======\n");
		if(personagens.size() > 1)
		{
			personagens.forEach(personagem ->{
				System.out.println(" " + personagem.getNome()+ " ");
			});
			
			System.out.println(" são declarados vencedores da batalha!");
		}
		else
		{
			System.out.println(personagens.get(0).getNome()+ ", menos ferido que seus inimigos, é declarado o vencedor da batalha!");
		}
		
	}
}
