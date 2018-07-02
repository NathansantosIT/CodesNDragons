package States;

import java.awt.Graphics;

import Entitys.Players;
import Tiles.Tile;
import backEnd_game.Game;
import worlds.World;

public class GameState extends State {
	
	private Players player;
	private World world;
	
	public GameState(Game game) {
		super(game);
		player = new Players(game, 480, 600);
		world = new World("res/worlds/world1.txt");
	}
	
	public void tick() {
		world.tick();
		player.tick();
		
	}
	
	public void render(Graphics g) {
		world.render(g);
		player.render(g);		
	}

}
