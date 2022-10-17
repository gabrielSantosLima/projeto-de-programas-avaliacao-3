package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {
	
	private boolean hasArmor = false;
	public Cavaleiro(String nome, Integer vida) {
		super(nome, vida);
	}
	
	

	public boolean hasArmor() {
		return hasArmor;
	}


	public void setHasArmor(boolean hasArmor) {
		this.hasArmor = hasArmor;
	}



	@Override
	public void atacar(Item item, Personagem inimigo) {
		System.out.println(this.showNome("Cavaleiro")+this.getNome() + " está atacando " + inimigo.getNome() + " com " + item.getNome()+ ".");
		inimigo.recebeDano(item.getDano());
		this.setHasArmor(false);
	}


	@Override
	public void defender() {
		System.out.println(this.showNome("Cavaleiro")+this.getNome()+ " esta segurando o escudo.");
		this.setHasArmor(true);
	}


	@Override
	public void saltar() {
		System.out.println(this.showNome("Cavaleiro")+this.getNome()+ " saltou!");
		this.setHasArmor(false);
	}
	
	@Override
	public void andar() {
		System.out.println(this.showNome("Cavaleiro")+this.getNome()+ " deu alguns passos.");
		this.setHasArmor(false);
	}


	@Override
	public void guardarItem(Item item) {
		System.out.println(this.showNome("Cavaleiro")+this.getNome()+ " guardou " + item.getNome()+ ".");
		this.setHasArmor(false);
	}


	@Override
	public void usarItem(Item item) {
		System.out.println(this.showNome("Cavaleiro")+this.getNome() + " usou " + item.getNome()+ ".");
		this.setHasArmor(false);
	}

	@Override
	public void recebeDano(int dano) {
		if(!this.hasArmor()){   
			this.setVida(getVida() - dano);
			if(this.getVida() <= 0)
				System.out.println(this.showNome("Cavaleiro")+this.getNome() + " está prestes a morrer!");
			else
				System.out.println(this.showNome("Cavaleiro")+this.getNome() + " recebeu um dano de -" + dano + "HP.");
			}
		else {
			System.out.println(this.showNome("Cavaleiro")+this.getNome() + " se defendeu com o escudo!");
		}
		}
	}


