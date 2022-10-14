package br.edu.uea.pp;

import br.edu.uea.pp.model.entities.*;
import java.util.ArrayList;
import java.util.List;

import br.edu.uea.pp.model.entities.Personagem;
import br.edu.uea.pp.view.Jogo;

public class Principal {
	public static void main(String[] args) {
		
		Personagem p= new Mago("Mago");
		((Mago)p).invisibilidade(); //Questão 3.c

		
		Jogo jogo = new Jogo();
		List<Personagem> personagens = new ArrayList<>();
		personagens.add(new Cavaleiro("Robin")); // Questão 3.a
		personagens.add(new Cavaleiro("Sir Magnus"));
		personagens.add(new Mago("Ozzy"));
		personagens.add(new Mago("Dumbledore"));
		personagens.add(new Dragao("Fenrir"));
		personagens.add(new Dragao("Viktor"));
		jogo.ControlarAcoesDosPersonagens(personagens); // Questão 3.b

	}
}
