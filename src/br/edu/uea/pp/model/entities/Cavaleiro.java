package br.edu.uea.pp.model.entities;

import java.util.ArrayList;
import java.util.List;

import br.edu.uea.pp.model.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {
	
	List<Item> itens = new ArrayList<>();

	public Cavaleiro(String nome, Integer vida) {
		super(nome, vida);
		this.itens.add(new Item("Espada", 5));
		this.itens.add(new Item("Bomba", 8));
	}

	@Override
	public void atacar(Item item, Personagem inimigo) {
		System.out.println(this.getNome() + "está atacando " + inimigo.getNome() + " com " + item.getNome());
	}


	@Override
	public void defender() {
		System.out.println(this.getNome()+ " se defendeu!");
	}


	@Override
	public void saltar() {
		System.out.println(this.getNome()+ " saltou!");
	}
	
	@Override
	public void andar() {
		System.out.println(this.getNome()+ " deu alguns passos");
	}


	@Override
	public void guardarItem(Item item) {
		// mudar método
		System.out.println(this.getNome()+ " guardou " + item.getNome());
	}


	@Override
	public void usarItem(Item item) {
		System.out.println(this.getNome() + " usou " + item.getNome());
	}

	@Override
	public void recebeDano(Integer dano) {
		// TODO Auto-generated method stub
		
	}


}
