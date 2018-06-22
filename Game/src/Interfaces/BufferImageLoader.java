package Interfaces;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BufferImageLoader {
		
		private BufferedImage image;
		
		
		//Chama uma imagem no caminho especificado
		public BufferedImage loadImage(String path) throws IOException {
			
			image = ImageIO.read(getClass().getResource(path));
			return image;
		}
	
}
