package br.edu.uea.pp.model.entities;

import java.awt.Color;
import java.awt.Graphics;

import br.edu.uea.pp.model.ComportamentoFeroz;

public class Dragao extends Personagem implements ComportamentoFeroz{

	public Dragao(String nome, Integer vida) {
		super(nome, vida);
	}

	@Override
	public void atirarFogo() {
	}

	@Override
	public void voar() {
	}

	@Override
	public void morder() {
	}

	@Override
	public void andar() {
	}

	@Override
	public void guardarItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void usarItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recebeDano(Integer dano) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(10, 10, 10, 10);
	}
}
