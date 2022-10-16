package br.edu.uea.pp.view;

import javax.swing.JFrame;

import br.edu.uea.pp.Configuration;

public class Frame extends JFrame{

	public Frame(String title, Configuration config) {
		super(title);
		this.setSize(config.getWidth(), config.getHeight());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
	}
}
