import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton("joke");
	JButton punchline = new JButton("punchline");

	public static void main(String[] args) {
		ChuckleClicker idk = new ChuckleClicker();
		idk.makeButtons();
	}

	public void makeButtons() {
		JFrame jeff = new JFrame();
		JPanel jp = new JPanel();
		jeff.setVisible(true);

		joke.addActionListener(this);

		punchline.addActionListener(this);

		jp.add(joke);
		jp.add(punchline);
		jeff.add(jp);
		jeff.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == joke) {
JOptionPane.showMessageDialog(null,"What did the pirate say when he turned 80 years old? Aye matey.");
		}
		if (e.getSource() == punchline) {
JOptionPane.showMessageDialog(null, "What do we want? “Airplane noises!” When do we want them? “Nyeow!”");
		}
	}

}
