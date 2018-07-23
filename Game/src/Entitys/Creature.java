package Entitys;

import backEnd_game.Game;

public abstract class Creature extends Entities {
	
	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 64;
	public static final int DEFAULT_CREATURE_HEIGHT = 64;
	
	protected int vida;
	protected  int forca, inteligencia, defesa, iniciativa;
	protected String nomeChar;
	protected float speed;
	protected float xMove, yMove;
	
	public Creature(Game game, float x, float y, int width, int height) {
		super(game, x, y, width, height);
		vida = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
	}
	public void move() {
		x += xMove;
		y += yMove;
	}
	
	
	
	//GETTERS AND SETTERS
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}
	
}
