package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CuteTV implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	public void showButton() {
		button.setText("Ducks");
		button1.setText("Frogs");
		button2.setText("Unciorns");
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button) {
			showDucks();
		}
		if (arg0.getSource() == button2) {
			showFluffyUnicorns();
		}
		if (arg0.getSource() == button1) {
			showFrog();
		}
		
		
	}
}
