package worlds;

import java.awt.Graphics;

import Tiles.Tile;
import backEnd_game.Handler;
import utils.Utils;

public class World {
	
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	private Handler handler;
	
	public World(Handler handler, String path) {
		this.handler = handler;
		loadWorld(path);
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		int xStart =(int) Math.max(0 , handler.getGameCamera().getxOffset()/Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, handler.getGameCamera().getxOffset() + handler.getWidth()/Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset()/Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height, handler.getGameCamera().getyOffset() + handler.getHeight()/Tile.TILEHEIGHT + 1);
		for(int y = yStart;y < yEnd;y++) {
			for(int x = xStart;x < xEnd;x++) {
				getTile(x,y).render(g, (int) (x*Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),(int) (y*Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		
	}
	public Tile getTile(int x,int y) {
		Tile t = Tile.tiles[tiles[x][y]];
		if (t == null)
			return Tile.dirtTile;
		return t;
	}
	private void loadWorld(String path) {
		String file = Utils.loadfileasString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.toInt(tokens[0]);
		height = Utils.toInt(tokens[1]);
		spawnX = Utils.toInt(tokens[2]);
		spawnY = Utils.toInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0;y < height;y++) {
			for(int x = 0;x < width;x++) {
				tiles[x][y] = Utils.toInt(tokens[(x + y * width) + 4]);
			}
		}
	}
}
