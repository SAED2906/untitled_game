package net.William.co.uk.gfx;

import javax.swing.JPanel;

import net.William.co.uk.Display;
import net.William.co.uk.Game;

import java.awt.PopupMenu;

import javax.swing.JButton;

public class MenuCard extends JPanel {

	/**
	 * Create the panel.
	 */
	public MenuCard(Display display) {
		setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("New button");
		PopupMenu btnNewButton2 = new PopupMenu("New button");
		
		btnNewButton.setBounds(101, 133, 212, 72);
		//btnNewButton2.setBounds(100, 100, 200, 100);
		Game.getdisplay().getFrame().add(btnNewButton);
		btnNewButton2.add("Hello");
		
		display.getCanvas().add(btnNewButton2);
		
		
		
		add(btnNewButton);

	}
}
