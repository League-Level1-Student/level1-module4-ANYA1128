import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame("Whack A 'Mole' for Fame and Glory");
	JPanel panel = new JPanel();
	static int numOfMolesWhacked=0;
	static int numNotWhacked=0;
	static Date timeAtStart;

	void drawButtons(int random) {
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			if (i == random) {
				button.setText("mole!");
			}
			button.addActionListener(this);
			panel.add(button);
		}
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(270, 310);

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	public static void main(String[] args) {
		WhackAMole mole = new WhackAMole();
		mole.drawButtons(new Random().nextInt(24));
		timeAtStart = new Date();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (((JButton) e.getSource()).getText().equals("mole!")) {
			numOfMolesWhacked++;
			System.out.println(numOfMolesWhacked);
			WhackAMole mole = new WhackAMole();
			mole.drawButtons(new Random().nextInt(24));
			if (numOfMolesWhacked == 10) {
				endGame(timeAtStart, numOfMolesWhacked);
			}
		} else {
			numNotWhacked++;
			speak("Oh, no! You have not whacked the mole!");
			if (numNotWhacked == 1) {
				JOptionPane.showMessageDialog(null, "You missed the mole!");	
			}
			if (numNotWhacked == 2) {
				JOptionPane.showMessageDialog(null, "You missed the mole again!");	
			}
			if (numNotWhacked == 3) {
				JOptionPane.showMessageDialog(null, "Come on! Get the mole!");	
			}
			if (numNotWhacked == 4) {
				JOptionPane.showMessageDialog(null, "The game will soon be terminated.");	
			}
			if(numNotWhacked==5) {
				
				JOptionPane.showMessageDialog(null, "The game has been terminated.");
				frame.dispose();
				}
		}
		
		 	
			 
				if(numNotWhacked<5) {
					frame.dispose();
					frame.setVisible(true);
					WhackAMole mole = new WhackAMole();
					mole.drawButtons(new Random().nextInt(24));
				}
				
			}
		}
	

