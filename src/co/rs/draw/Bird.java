package co.rs.draw;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import co.rs.controller.KeyHandler;

public class Bird extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private Timer timer;
	public static int x,y;
	private Image bird;
	public Bird() {
		addKeyListener(new KeyHandler());
		setFocusable(true);
		bird=new ImageIcon(getClass().getResource("/bird.gif")).getImage();
		x=100;
		y=100;

		timer=new Timer(20, this);
		timer.start();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(bird, x, y, this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		y+=2;
		repaint();
	}
	public Rectangle getBird() {
		return new Rectangle(x, y,100 ,100 );
	}
}
