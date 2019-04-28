import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise {
	
public static void main(String[] args) {
	JFrame jeff = new JFrame();
	jeff.setVisible(true);
	JPanel jp = new JPanel();
	jeff.add(jp);
	JButton im = new JButton("Trick");
	JButton bw = new JButton("Treat");
	jp.add(im);
	jp.add(bw);
	jeff.pack();
	im.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			showPictureFromTheInternet("https://i.pinimg.com/474x/ae/c4/53/aec453161b2f33ffc6219d8a758307a9.jpg");
		}
		
	});
	
}
private static void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}	

}
