package States;

import java.awt.Graphics;

import grafichs.Assets;

public class GameState extends State {
	
	public GameState() {
		
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(Assets.dirt,0,0,null);
	}

}
