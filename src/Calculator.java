import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JTextField one = new JTextField();
	JTextField two = new JTextField();
	JButton add = new JButton("add");
	JButton sub = new JButton("sub");
	JButton mul = new JButton("mul");
	JButton div = new JButton("div");
	JLabel hi = new JLabel();

	public void setup() {
		JFrame frame = new JFrame("Simple Calculator");
		frame.setVisible(true);
		JPanel panel = new JPanel();
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(hi);
		frame.add(panel);
		frame.pack();

	}

	public void add() {
		String num1 = one.getText();
		String num2 = two.getText();
		int num = Integer.parseInt(num1);
		int numm = Integer.parseInt(num2);
		int sum = num + numm;
		hi.setText(""+sum);
	}

	public void subtract() {
		String num1 = one.getText();
		String num2 = two.getText();
		int num = Integer.parseInt(num1);
		int numm = Integer.parseInt(num2);
		int sum = num - numm;
		hi.setText(""+sum);
	}

	public void multiply() {
		String num1 = one.getText();
		String num2 = two.getText();
		int num = Integer.parseInt(num1);
		int numm = Integer.parseInt(num2);
		int sum = num * numm;
		hi.setText(""+sum);
	}

	public void divide() {
		String num1 = one.getText();
		String num2 = two.getText();
		int num = Integer.parseInt(num1);
		int numm = Integer.parseInt(num2);
		int sum = num/numm;
		hi.setText(""+sum);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if (pressed == add) {
			add();
		}
		if (pressed == sub) {
			subtract();
		}
		if (pressed == mul) {
			multiply();
		}
		if (pressed == div) {
			divide();
		}
	}

}
