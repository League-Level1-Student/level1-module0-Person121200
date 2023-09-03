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

public class FortuneCookie implements ActionListener{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    public void showButton() {
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
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "You are going to be rich soon!");
		}
		else if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "YAY!!!!!");
		}
		else if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "Your dad is coming back!");
		}
		else if (e.getSource() == button3) {
			JOptionPane.showMessageDialog(null, "HE'S HERE!!!!");
		}
		else if (e.getSource() == button4) {
			JOptionPane.showMessageDialog(null, "Hide....................");
			System.exit(0);
			 }
		
		}
	
	}



