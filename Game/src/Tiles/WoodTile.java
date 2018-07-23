package Tiles;

import java.awt.image.BufferedImage;

import graphics.Assets;

public class WoodTile extends Tile {

	public WoodTile(int id) {
		super(Assets.wood, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}
