package br.edu.uea.pp;

public class Configuration {
	
	private int width;
	private int height;
	private int FPS;
	
	public Configuration() {
		this.width = 1080;
		this.height = 720;
		this.FPS = 60;
	}
	
	public Configuration(int width, int height, int FPS) {
		this.width = width;
		this.height = height;
		this.FPS = FPS;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getFPS() {
		return FPS;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setFPS(int fPS) {
		FPS = fPS;
	}
}
