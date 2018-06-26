package Entitys;

import java.awt.Graphics;

import grafichs.Assets;

public class Players extends Creature{
	
	String classe, raca, spec; //Especialização
	protected static String ataques[] = new String[4];
	
	public Players(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		
	}

	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) x, (int) y, null);
		
	}
	

}
