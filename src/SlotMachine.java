import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label;
	JLabel label2;
	JLabel label3;
	int winCounter=0;
	Dimension a = new Dimension(200, 200);
	JButton button = new JButton("SPIN");

	public static void main(String[] args) {
		SlotMachine slotMachine = new SlotMachine();
		slotMachine.setup();
	}

	void setup() {
		label = createLabelImage("download.jpg");
		label2 = createLabelImage("images-1.jpg");
		label3 = createLabelImage("download-1.jpg");
		label.setPreferredSize(a);
		label2.setPreferredSize(a);
		label3.setPreferredSize(a);
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		button.addActionListener(this);
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	private JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int random = new Random().nextInt(3);

		panel.remove(label);
		panel.remove(label2);
		panel.remove(label3);
		String image;


		random = new Random().nextInt(3);

		if (random == 0) {
			image = "images-1.jpg";
			

		} else if (random == 1) {
			image = "download.jpg";

		}

		else {
			image = "download-1.jpg";
		}

		label = createLabelImage(image);
		panel.add(label);
		frame.pack();
		String text;
		random = new Random().nextInt(3);
		if (random == 0) {
			text = "images-1.jpg";

		} else if (random == 1) {
			text = "download.jpg";

		}

		else {
			text = "download-1.jpg";
		}

		label2 = createLabelImage(text);
		panel.add(label2);
		frame.pack();
		String check;
		random = new Random().nextInt(3);
		if (random == 0) {
			check = "images-1.jpg";

		} else if (random == 1) {
			check = "download.jpg";

		}

		else {
			check = "download-1.jpg";
		
		}

		label3 = createLabelImage(check);
		panel.add(label3);
		frame.pack();
		if (image.contentEquals(text)&& text.contentEquals(check)) {
			playSound("applause.wav");
			JOptionPane.showMessageDialog(null, "YOU WIN");
			winCounter++;
			JOptionPane.showMessageDialog(null, "Your win count is: "+winCounter);
		
		}
	}
}
