package br.edu.uea.pp.view;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import br.edu.uea.pp.model.Desenhavel;
import br.edu.uea.pp.model.entities.Personagem;

public class Canvas extends java.awt.Canvas{
	private List<Personagem> desenhaveis;
	
	public Canvas() {
		this.desenhaveis = new ArrayList<>();
	}
	
	public List<Personagem> getDesenhaveis() {
		return desenhaveis;
	}
	
	public void setDesenhaveis(List<Personagem> desenhaveis) {
		this.desenhaveis = desenhaveis;
	}
	
	@Override
	public void paint(Graphics g) {
		for(Desenhavel desenhavel: this.getDesenhaveis()) {
			desenhavel.draw(g);
		}
	}
}
