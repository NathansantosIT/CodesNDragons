package Entitys;

import java.awt.Graphics;

import backEnd_game.Game;
import graphics.Assets;

public class Players extends Creature{
	
	String classe, raca, spec; //Especialização
	protected static String ataques[] = new String[4];
	
	public Players(Game game, float x, float y) {
		super(game, x, y,Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATURE_HEIGHT);
	}

	@Override
	public void tick() {
		getInput();
		move();
		game.getGameCamera().centerOnEntity(this);

	}
	public void getInput() {
		xMove = 0;
		yMove = 0;
		
		if(game.getKeyManager().up)
			yMove = -speed;
		if(game.getKeyManager().down)
			yMove = speed;
		if(game.getKeyManager().left)
			xMove = -speed;
		if(game.getKeyManager().right)
			xMove = speed;
	}

	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) (x - game.getGameCamera().getxOffset()), (int) (y - game.getGameCamera().getyOffset()), width, height, null);
		
	}
	

}
