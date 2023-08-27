package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import processing.core.PApplet;
import processing.core.PImage;

public class FortuneCookie  extends PApplet implements ActionListener{
	PImage bucket = new PImage();
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    public void showButton() {
    	bucket = loadImage("637944612069415446.png");
        System.out.println("Click a button for your fortune.");
        frame.setVisible(true);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        frame.add(panel);
        frame.pack();
        button.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "You are going to die soon...");
		}
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "RUN!!!");
		}
		if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "He's coming.");
		}
		if (e.getSource() == button3) {
			JOptionPane.showMessageDialog(null, "HE'S HERE!!!!");
		}
		if (e.getSource() == button4) {
			JOptionPane.showMessageDialog(null, "Hide....................");
			System.exit(0);
			 }
		
		}
	
	}



