package co.rs.draw;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Background extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private Timer timer;
	private int x,y,x2,y2;
	private Image bg,bg2;
	public Background() {
		bg=new ImageIcon(getClass().getResource("/bg.png")).getImage();
		bg2=new ImageIcon(getClass().getResource("/bg2.png")).getImage();
		x=0;
		y=0;
		x2=1000;
		y2=0;
		timer=new Timer(20, this);
		timer.start();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(bg, x, y, this);
		g.drawImage(bg2, x2, y2, this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		x-=2;
		x2-=2;
		
		if (x<=-1000) {
			x=1000;
		}
		if (x2<=-1000) {
			x2=1000;
		}
		
		//System.out.println(x);
		repaint();
	}
	
	
}
