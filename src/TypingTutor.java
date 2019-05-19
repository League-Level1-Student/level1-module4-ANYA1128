import javax.swing.JFrame;
import javax.swing.JPanel;

public class TypingTutor {
JFrame jeff = new JFrame("Type or Die");
JPanel jp = new JPanel();
char currentLetter;
public static void main(String[] args) {
	TypingTutor idk = new TypingTutor();
	idk.setup();
}
public void setup() {
	jeff.setVisible(true);
	jeff.add(jp);
	jeff.pack();
	
}


//currentLetter = generateRandomLetter();

//char generateRandomLetter() {
//      Random r = new Random();
//      return (char) (r.nextInt(26) + 'a');
//}

}
