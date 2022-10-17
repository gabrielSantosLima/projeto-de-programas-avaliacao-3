package br.edu.uea.pp;

import br.edu.uea.pp.model.entities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.edu.uea.pp.model.entities.Personagem;
import br.edu.uea.pp.view.Jogo;

public class Principal {
	public static void main(String[] args) {
		
		int rodadas = 4;
		int rodadaAtual = 0;
		Personagem mago = new Mago("Mago", 100);
		((Mago)mago).invisibilidade(); //Questão 3.c

		
		Jogo jogo = new Jogo();
		List<Personagem> personagens = new ArrayList<>();
		personagens.add(new Cavaleiro("Robin", 100)); // Questão 3.a
		personagens.add(new Mago("Ozzy", 100));
		personagens.add(new Dragao("Fenrir", 100));
		personagens.add(new Cavaleiro("Sir Magnus", 100));
		personagens.add(new Mago("Dumbledore", 100));
		personagens.add(new Dragao("Viktor", 100));
		
		List<Item> itens = new ArrayList<>(); // Adiciona lista de itens aos jogadores
		itens.add(new Item("Pedra filosofal", 100));
		itens.add(new Item("Chama negra", 30));
		itens.add(new Item("Olho de Cthulhu", 90));
		
		while(rodadaAtual != rodadas && personagens.size() != 1) {
			System.out.println("\n========= RODADA "+ (rodadaAtual + 1) +" =========");
			jogo.ControlarAcoesDosPersonagens(personagens, itens); // Questão 3.b
			personagens = personagens.stream()
					.filter(personagem -> personagem.getVida() > 0)
					.collect(Collectors.toList()); // Verifica personagens que estão com vida maior que 0.
			rodadaAtual++;
		}
		
	}
}
