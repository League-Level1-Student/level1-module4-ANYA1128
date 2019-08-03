import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label;
JLabel label2;
JLabel label3;
Dimension a = new Dimension(200,200);
JButton button = new JButton("SPIN");

public static void main(String[] args) {
	SlotMachine slotMachine = new SlotMachine();
	slotMachine.setup();
}
void setup() {
	try {
		label = createLabelImage("download-1.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		label2 = createLabelImage("images-1.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		label3 = createLabelImage("download.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
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
	if(random==0) {
		try {
			panel.remove(label);
			JLabel label = createLabelImage("images-1.jpg");
			panel.add(label);
			frame.pack();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			panel.remove(label2);
			JLabel label2 = createLabelImage("download.jpg");
			panel.add(label2);
			frame.pack();
			
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	if(random==1) {
		
		try {
			panel.remove(label3);
			JLabel label3 = createLabelImage("images-1.jpg");
			panel.add(label3);
			frame.pack();
			
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	try {
		panel.remove(label);
		JLabel label = createLabelImage("download.jpg");
		panel.add(label);
		frame.pack();
		
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	if(random==2) {
		try {
			panel.remove(label2);
			JLabel label2 = createLabelImage("download-1.jpg");
			panel.add(label2);
			frame.pack();
			
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	try {
		panel.remove(label3);
		JLabel label3 = createLabelImage("images-1.jpg");
		panel.add(label3);
		frame.pack();
		
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}
}


