package Entitys;

import java.awt.Graphics;

import backEnd_game.Game;
import backEnd_game.Handler;

public abstract class Entities {

	protected Handler handler;
	protected float x,y;
	protected int width, height;
	
	public Entities(Handler handler, float x, float y,int width, int height) {
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
}
