package br.edu.uea.pp;

import br.edu.uea.pp.model.entities.*;
import java.util.ArrayList;
import java.util.List;

import br.edu.uea.pp.model.entities.Personagem;
import br.edu.uea.pp.view.Jogo;

public class Principal {
	public static void main(String[] args) {
		
		Personagem p= new Mago("Mago", 100);
		((Mago)p).invisibilidade(); //Questão 3.c

		
		Jogo jogo = new Jogo(new Configuration());
		List<Personagem> personagens = new ArrayList<>();
		personagens.add(new Cavaleiro("Robin", 100)); // Questão 3.a
		personagens.add(new Cavaleiro("Sir Magnus", 100));
		personagens.add(new Mago("Ozzy", 100));
		personagens.add(new Mago("Dumbledore", 100));
		personagens.add(new Dragao("Fenrir", 100));
		personagens.add(new Dragao("Viktor", 100));
		jogo.ControlarAcoesDosPersonagens(personagens); // Questão 3.b
		
		jogo.run(personagens);
	}
}
