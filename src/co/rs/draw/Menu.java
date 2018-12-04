package co.rs.draw;

import javax.swing.JPanel;

import com.rs.main.Game;
import com.rs.main.Main;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JPanel {


	public Menu() {
		setLayout(null);
		
		JLabel lblFlappyBird = new JLabel("Flappy Bird");
		lblFlappyBird.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblFlappyBird.setBounds(203, 11, 298, 101);
		add(lblFlappyBird);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Game game=new Game();
				Main.contentPane.add(game,"game");
				Main.showPanel("game");
			}
		});
		btnPlay.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		btnPlay.setBounds(203, 123, 298, 62);
		add(btnPlay);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		button.setBounds(203, 196, 298, 62);
		add(button);
		
		JLabel label = new JLabel("Your Score : 0");
		label.setText("Your Score : "+Game.getscore());
		label.setFont(new Font("Tahoma", Font.BOLD, 50));
		label.setBounds(203, 269, 1000, 101);
		add(label);
		
		JLabel label_1 = new JLabel("High Score : 0");
		label_1.setText("Your Score : "+Game.getscore());
		label_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		label_1.setBounds(203, 343, 1000, 101);
		add(label_1);
		
	}
}
