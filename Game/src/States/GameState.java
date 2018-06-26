package States;

import java.awt.Graphics;

import Entitys.Players;
import backEnd_game.Game;

public class GameState extends State {
	
	private Players player;
	
	public GameState(Game game) {
		super(game);
		player = new Players(480, 600);
	}
	
	public void tick() {
		player.tick();
	}
	
	public void render(Graphics g) {
		player.render(g);
	}

}
