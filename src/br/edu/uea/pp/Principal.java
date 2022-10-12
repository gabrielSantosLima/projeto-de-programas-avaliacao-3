package br.edu.uea.pp;

import java.util.ArrayList;
import java.util.List;

import br.edu.uea.pp.model.entities.Personagem;
import br.edu.uea.pp.view.Jogo;

public class Principal {
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		List<Personagem> personagens = new ArrayList<>(); // TODO Adicionar lista de personagens aqui
		jogo.ControlarAcoesDosPersonagens(personagens); // Questão 3.b
	}
}
