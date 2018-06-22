package grafichs;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 75, height = 75;

	public static BufferedImage player, dirt, grass, stone, sand;
	
	public static void init() {
		spriteSheet sheet = new spriteSheet(ImageLoader.loadImage("/Textures/mineSheet.jpg"));
		
		dirt = sheet.crop(300, 300, width, height);
		stone = sheet.crop(0, 525, width, height);
	}
	
}
