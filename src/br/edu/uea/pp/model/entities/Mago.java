package br.edu.uea.pp.model.entities;

import java.awt.Color;
import java.awt.Graphics;

import br.edu.uea.pp.model.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico{

	public Mago(String nome, Integer vida) {
		super(nome, vida);
	}

	public void invisibilidade() {
		System.out.println(this.getNome() + " está invisivel");
	}

	public void ultraRapidez() {
	}

	public void andar() {
	}

	public void guardarItem() {
	}

	public void usarItem() {
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
		g.setColor(Color.BLUE);
		g.fillRect(10, 30, 10, 10);
	}
}
