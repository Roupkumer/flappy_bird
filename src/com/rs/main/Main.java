package com.rs.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.rs.controller.KeyHandler;
import co.rs.draw.Menu;

import java.awt.CardLayout;

public class Main extends JFrame {

	public static JPanel contentPane;
	public static CardLayout layout;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		setResizable(false);
		layout=new CardLayout();
		contentPane.setLayout(layout);
		addKeyListener(new KeyHandler());
		setFocusable(true);
		Menu menu=new Menu();
		contentPane.add(menu,"menu");
		
		layout.show(contentPane, "menu");
	}
	public static void showPanel(String name) {
		layout.show(contentPane, name);
	}
}
