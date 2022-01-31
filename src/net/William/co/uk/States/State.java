package net.William.co.uk.States;

import java.awt.Graphics;

import net.William.co.uk.Game;

public class State {
	
	public static void render(Graphics g) {
		
		if (Game.getState().equalsIgnoreCase("menu")) {
		
			MenuState.render(g);
		}
		if (Game.getState().equalsIgnoreCase("start")) {
			
			StartState.render(g);
			}
		
	}
	
	public static void tick() {
		
		if (Game.getState().equalsIgnoreCase("menu")) {
			
			MenuState.tick();
			}
		if (Game.getState().equalsIgnoreCase("start")) {
			
			StartState.tick();
			}
		
		
		
		
	}
	
	
	
	

}
