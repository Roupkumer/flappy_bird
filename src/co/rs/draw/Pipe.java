package co.rs.draw;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Pipe extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private Timer timer;
	private int x,y,x2,y2,x3,y3,x4,y4;
	private Image pipe,pipe2,pipe3,pipe4;
	private Random random;

	public Pipe() {
		pipe=new ImageIcon(getClass().getResource("/pipe.png")).getImage();
		pipe2=new ImageIcon(getClass().getResource("/pipe2.png")).getImage();
		pipe3=new ImageIcon(getClass().getResource("/pipe.png")).getImage();
		pipe4=new ImageIcon(getClass().getResource("/pipe2.png")).getImage();
		x=500;
		y=200;
		x2=500;
		y2=-400;
		x3=1000;
		y3=200;
		x4=500;
		y4=-400;
	
		random=new Random();
		timer=new Timer(20, this);
		timer.start();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(pipe, x, y, this);
		g.drawImage(pipe2, x2, y2, this);
		g.drawImage(pipe3, x3, y3, this);
		g.drawImage(pipe4, x4, y4, this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		x-=3;
		x2-=3;
		x3-=3;
		x4-=3;
		if (x<=-50) {
			create();
		}
		if (x3<=-50) {
			x3=1000;
			x4=1000;
			y3=random.nextInt(300)+200;
			y4=y3-600;
		}
		repaint();
	}
	private void create() {
		x=1000;
		x2=1000;
		y=random.nextInt(300)+200;
		//System.out.println(y);
		y2=y-600;
	}
	public Rectangle getPipe1() {
		Rectangle pipe1= new Rectangle(x, y, 50, 300);
		return pipe1;
	}
	public Rectangle getPipe2() {
		Rectangle pipe2= new Rectangle(x2, y2, 50, 300);
		return pipe2;
	}
	public Rectangle getPipe3() {
		Rectangle pipe3= new Rectangle(x3, y3, 50, 300);
		return pipe3;
	}
	public Rectangle getPipe4() {
		Rectangle pipe4= new Rectangle(x4, y4, 50, 300);
		return pipe4;
	}
}
