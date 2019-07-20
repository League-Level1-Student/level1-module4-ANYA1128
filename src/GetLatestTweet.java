import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	JFrame frame = new JFrame("The Amazing Tweet Retriever");
	JPanel pan = new JPanel();
	JTextField txt = new JTextField();
	JButton baton = new JButton("Search the Twitterverse");
	Dimension a = new Dimension(240,20);
	JLabel wow = new JLabel();
	

	public static void main(String[] args) {
	GetLatestTweet tweet = new GetLatestTweet();
	tweet.setup();
	}
	public void setup() {
		frame.setVisible(true);
		txt.setPreferredSize(a);
		baton.addActionListener(this);
	
		pan.add(txt);
		pan.add(baton);
		pan.add(wow);
		frame.add(pan);
		frame.pack();	

	}
	private String getLatestTweet(String searchingFor) {

	      Twitter twitter = new TwitterFactory().getInstance();

	      AccessToken accessToken = new AccessToken(
	            "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	            "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

	      twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	            "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

	      twitter.setOAuthAccessToken(accessToken);

	      Query query = new Query(searchingFor);
	      try {
	            QueryResult result = twitter.search(query);
	            return result.getTweets().get(0).getText();
	      } catch (Exception e) {
	            System.err.print(e.getMessage());
	            return "What the heck is that?";
	      }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tweet, Tweet");
		String bleh = txt.getText();
		getLatestTweet(bleh);
		wow.setText(getLatestTweet(bleh));
	}

}
