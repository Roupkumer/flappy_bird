package co.rs.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import co.rs.draw.Bird;

public class KeyHandler implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_SPACE) {
			Bird.y-=35;
			System.out.println("ok");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
