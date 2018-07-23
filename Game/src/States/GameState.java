package States;

import java.awt.Graphics;

import Entitys.Players;
import backEnd_game.Handler;
import worlds.World;

public class GameState extends State {
	
	private Players player;
	private World world;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		player = new Players(handler, 480, 600);
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
