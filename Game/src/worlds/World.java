package worlds;

import java.awt.Graphics;

public class World {
	
	private int width, height;
	private int[][] tiles;
	
	public World(String path) {
		loadWorld(path);
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		
	}
	private void loadWorld(String path) {
		width = 5;
		height = 5;
		tiles = new int[width][height];
	}
}
