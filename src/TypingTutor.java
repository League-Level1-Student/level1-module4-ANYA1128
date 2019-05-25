import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
JFrame jeff = new JFrame("Type or Die");
JPanel jp = new JPanel();
JLabel label = new JLabel();
char currentLetter;
Date timeAtStart = new Date(currentLetter);

public static void main(String[] args) {
	TypingTutor idk = new TypingTutor();
	idk.setup();
}
public void setup() {
	currentLetter = generateRandomLetter();
	jeff.setVisible(true);
	jeff.setSize(200, 200);
	jeff.addKeyListener(this);
	label.setText(currentLetter+"");
	label.setFont(label.getFont().deriveFont(180.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	jp.add(label);
	jeff.add(jp);
	jeff.pack();
	
	showTypingSpeed(currentLetter);
	

}
private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
    Date timeAtEnd = new Date(numberOfCorrectCharactersTyped);
    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
    long gameInSeconds = (gameDuration / 1000) % 60;
    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
    int charactersPerMinute = (int) (charactersPerSecond * 60);
    if(gameInSeconds>6) {
    	   System.out.println("Your typing speed is " + charactersPerMinute + " characters per minute.");
    
}
}




char generateRandomLetter() {
      Random r = new Random();    
      return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
		if(e.getKeyChar()==currentLetter) {
		System.out.println("correct");
		jp.setBackground(Color.GREEN);
	

	}
	else {
	
		jp.setBackground(Color.RED);
	}
		currentLetter = generateRandomLetter();
		label.setText(currentLetter+"");

}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("you typed: "+e.getKeyChar());
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}


