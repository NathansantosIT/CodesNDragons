package Interfaces;

import java.awt.image.BufferedImage;


//A classe lida especificamente com as spriteSheets
public class spriteSheet { 

	private BufferedImage image;
	
	public spriteSheet(BufferedImage image) {
		this.image = image;
	}
	
	public BufferedImage grabImage(int col, int row, int width, int height) {
		//Método para rodar imagens com spriteSheets de 32 em 32 pixels
		BufferedImage img = image.getSubimage((col * 32) -32, (row * 32) - 32, width, height);
		return img;
	}
	
	
	
}
