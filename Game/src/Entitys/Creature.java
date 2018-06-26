package Entitys;

public abstract class Creature extends Entity {

	protected int vida = 10;
	protected  int forca, inteligencia, defesa, iniciativa;
	protected String nomeChar;
	
	public Creature(float x, float y) {
		super(x, y);
	}
	
	
}
