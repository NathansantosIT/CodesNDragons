package backEnd_game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Inputs.KeyManager;
import States.GameState;
import States.State;
import States.mainMenuState;
import graphics.Assets;
import graphics.GameCamera;

public class Game implements Runnable {
	
	private Display display;
	private int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread; //Roda um mini programa onde iremos inicializar o Game
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	private State gameState;
	private State mainMenuState;
	
	//Input
	private KeyManager keyManager;
	
	//Camera
	private GameCamera gameCamera;
	
	//Handler
	private Handler handler;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
	}
	
	//inicializa os Buffers, roda no começo do run()
	private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		
		gameCamera = new GameCamera(this, 0, 0);
		handler = new Handler(this);
		
		mainMenuState = new mainMenuState(handler);
		gameState = new GameState(handler);
		State.setState(gameState);
	}
	
	private void tick() {
		keyManager.tick();
		
		if(State.getState() != null)
			State.getState().tick();
	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		////////Começa a desenhar aqui///////////
		
		if(State.getState() != null)
			State.getState().render(g);
		
		//////////////Termina aqui///////////////	
		bs.show();
		g.dispose();
	}
	
	//Oq acontece na Thread
	public void run() {
		
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		long ticks = 0;
		
		
		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += (now - lastTime);
			lastTime = now;
			
			if(delta >= 1) {
			tick();
			render();
			delta--;
			ticks++;
			}
			
			if(timer >= 1000000000) {
				//System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
	} 
	
	public KeyManager getKeyManager() {
		return keyManager;
	}
	public GameCamera getGameCamera() {
		return gameCamera;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	//inicia a thread
	public synchronized void start() {
		if(running)
			return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	//Para a thread
	public synchronized void stop() {
		if(!running)
			return;
		
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
