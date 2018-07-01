package Entitys;

import java.awt.Graphics;

public abstract class Entities {

	protected float x,y;
	
	public Entities(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
}
