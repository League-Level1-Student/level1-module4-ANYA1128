import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetLatestTweet {
	JFrame frame = new JFrame("the Amazing Tweet Retriever");
	JPanel pan = new JPanel();
	JTextField txt = new JTextField();
	JButton baton = new JButton("Search the Twitterverse");

	public void setup() {
		frame.setVisible(true);

		pan.add(txt);
		pan.add(baton);
		frame.add(pan);
		frame.pack();

	}

}
