package com.rs.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

import co.rs.controller.KeyHandler;
import co.rs.draw.Background;
import co.rs.draw.Bird;
import co.rs.draw.Pipe;

public class Game extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	private Timer timer;
	private Background background;
	private Bird bird;
	private Pipe pipe;
	private static int score;
	private boolean gameover;
	public Game() {
		addKeyListener(new KeyHandler());
		setFocusable(true);
		background = new Background();
		bird = new Bird();
		pipe = new Pipe();
		score=0;
		gameover=false;
		timer = new Timer(20, this);
		setLayout(null);
		timer.start();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		background.paint(g);
		pipe.paint(g);
		bird.paint(g);
		
		
		//score
		g.setColor(Color.red);
		g.setFont(new Font("Tahoma", Font.BOLD, 20));
		g.drawString("Score : "+score,10,50);
		if (gameover) {
			g.setFont(new Font("Tahoma", Font.BOLD, 100));
			g.drawString("GAME OVER",200,200);
			Main.showPanel("menu");
		}else {
			g.drawString("",200,200);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// System.out.println("pipe1="+pipe.getPipe1());
		// System.out.println("pipe2="+pipe.getPipe2());
		// System.out.println("pipe3="+pipe.getPipe3());
		// System.out.println("pipe4="+pipe.getPipe4());
		// System.out.println(bird.getBird());
		if (bird.getBird().intersects(pipe.getPipe1()) || bird.getBird().intersects(pipe.getPipe2())
				|| bird.getBird().intersects(pipe.getPipe3()) || bird.getBird().intersects(pipe.getPipe4())) {
			//System.out.println("Colllided");
			
			gameover=true;
		}else {
			score+=1f;
			//gameover=false;
		}

		repaint();
	}
	
	public static int getscore() {
		return score;
	}
}
