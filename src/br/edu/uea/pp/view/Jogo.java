package br.edu.uea.pp.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import br.edu.uea.pp.Configuration;
import br.edu.uea.pp.model.entities.Personagem;

public class Jogo {
	private Frame frame;
	private Canvas canvas;
	private Configuration config;
	private boolean isRunning;
	private int FPS;
	
	public Jogo(Configuration config) {
		this.config = config;
		this.FPS = config.getFPS();
		this.isRunning = false;
	}
	
	private void init() {
		this.frame = new Frame("EmperiusRPG", this.config);
		this.canvas = new Canvas();
		this.frame.add(canvas);
		this.frame.setVisible(true);
	}
	
	private void finish() {
		this.isRunning = true;
	}
	
	private void sleep(int secs) {
		try {
			Thread.sleep(secs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// Questão 2
	public void ControlarAcoesDosPersonagens(List<Personagem> personagens) {
		// Executa as ações comuns para cada personagem. Iteração utilizando streaming de listas
		personagens.stream().forEach(personagem -> {
			personagem.andar();
			//personagem.guardarItem();
			//personagem.usarItem();
		});
	}
	
	private void readInput(List<Personagem> personagens) {
		this.canvas.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE) finish();
				else if(e.getKeyCode() == KeyEvent.VK_UP) {}
			}
			@Override
			public void keyReleased(KeyEvent e) {}
		});
	}
	
	private void draw(List<Personagem> personagens) {
		this.canvas.setDesenhaveis(personagens);
		this.canvas.repaint();
		this.canvas.revalidate();
	}
	
	public void run(List<Personagem> personagens) {
		this.init();
		this.readInput(personagens);
		while(!this.isRunning) {
			draw(personagens);
			sleep(1000/this.FPS);
		}
		this.frame.dispose();
		System.exit(0);
	}
}
