package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico{

	private boolean isInvisible = false;
	
	public Mago(String nome, Integer vida) {
		super(nome, vida);
	}
	
	public boolean isInvisible() {
		return isInvisible;
	}

	public void setInvisible(boolean isInvisible) {
		this.isInvisible = isInvisible;
	}

	@Override
	public void invisibilidade() {
		System.out.println(this.showNome("Mago")+this.getNome() + " está invisivel.");
		this.setInvisible(true);
	}

	@Override
	public void ultraRapidez(Personagem inimigo) {
		System.out.println(this.showNome("Mago")+this.getNome() + " corre ultraveloz em direção a "+ inimigo.getNome());
		inimigo.recebeDano(40);
		this.setInvisible(false);
	}

	@Override
	public void andar() {
		System.out.println(this.showNome("Mago")+this.getNome() + " deu alguns passos.");
		this.setInvisible(false);
	}

	@Override
	public void guardarItem(Item item) {
		System.out.println(this.showNome("Mago")+this.getNome()+ " guardou " + item.getNome()+ ".");
		this.setInvisible(false);
	}

	@Override
	public void usarItem(Item item) {
		System.out.println(this.showNome("Mago")+this.getNome()+ " usou " + item.getNome()+ ".");
		this.setInvisible(false);
	}

	@Override
	public void recebeDano(int dano) {
		if(!this.isInvisible)
		{   this.setVida(getVida() - dano);
			if(this.getVida() <= 0)
				System.out.println(this.showNome("Mago")+this.getNome() + " está prestes a morrer!");
			else
				System.out.println(this.showNome("Mago")+this.getNome() + " recebeu um dano de -" + dano + "HP.");
			
		}
		else {
			
			System.out.println(this.showNome("Mago")+this.getNome() + " está invisível, nenhum dano lhe é causado");
		}
	}
}
