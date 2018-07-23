package Tiles;

import java.awt.image.BufferedImage;

import graphics.Assets;

public class RockTile extends Tile{

	public RockTile(int id) {
		super(Assets.stone, id);
		
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	

}
