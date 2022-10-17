package br.edu.uea.pp.model.entities;

import br.edu.uea.pp.model.ComportamentoFeroz;

public class Dragao extends Personagem implements ComportamentoFeroz{
	
	private boolean isFlying = false;

	public Dragao(String nome, Integer vida) {
		super(nome, vida);
	}

	
	public boolean isFlying() {
		return isFlying;
	}

	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}


	@Override
	public void atirarFogo() {
		System.out.println(this.showNome("Dragão")+this.getNome() + " atirou fogo.");
	}

	@Override
	public void voar() {
		System.out.println(this.showNome("Dragão")+this.getNome() + " voôu para longe.");
		this.setFlying(true);
	}

	@Override
	public void morder(Personagem inimigo) {
		System.out.println(this.showNome("Dragão")+this.getNome() + " mordeu =" + inimigo.getNome()+ " com voracidade.");
		inimigo.recebeDano(40);
		this.setFlying(false);
	}

	@Override
	public void andar() {
		System.out.println(this.showNome("Dragão")+this.getNome() + " andou.");
		this.setFlying(false);
	}

	@Override
	public void guardarItem(Item item) {
		System.out.println(this.showNome("Dragão")+this.getNome() + " guardou " + item.getNome()+ ".");
		this.setFlying(false);
	}

	@Override
	public void usarItem(Item item) {
		System.out.println(this.showNome("Dragão")+this.getNome() + " usou " + item.getNome() + ".");
		this.setFlying(false);
	}

	@Override
	public void recebeDano(int dano) {
		if(!this.isFlying()){   
			this.setVida(getVida() - dano);
			if(this.getVida() <= 0)
				System.out.println(this.showNome("Dragão")+this.getNome() + " está prestes a morrer!");
			else
				System.out.println(this.showNome("Dragão")+this.getNome() + " recebeu um dano de -" + dano + "HP.");
			}
		else {
			System.out.println(this.showNome("Dragão")+this.getNome() + " está voando no ar, nenhum dano é recebido.");
		}
		}
}
