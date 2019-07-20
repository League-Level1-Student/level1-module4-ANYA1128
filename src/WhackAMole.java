import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
JFrame frame = new JFrame("Whack A 'Mole' for Fame and Glory");
JPanel panel = new JPanel();

void drawButtons(int random) {
	for (int i=0;i<25;i++) {
		JButton button = new JButton();
	}
frame.add(panel);
frame.setSize(1000, 1000);
}


public static void main(String[] args) {
	WhackAMole mole = new WhackAMole();
	//mole.drawButtons
	
}
}
