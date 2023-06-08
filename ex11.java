package lab11;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class ex11 {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("JFrame Demo");
		JPanel panel = new JPanel();
		String message [] = {"apple","banana","orange"};
		Random rndm = new Random();
		JLabel label = new JLabel(message[rndm.nextInt(3)]);
		
		Icon icon1 = new ImageIcon("C:\\Users\\Deema\\OneDrive\\Desktop\\apple.png");
		JButton btn1 = new JButton(icon1);
		
		Icon icon2 = new ImageIcon("C:\\Users\\Deema\\OneDrive\\Desktop\\banana.png");
		JButton btn2 = new JButton(icon2);
		
		Icon icon3 = new ImageIcon("C:\\Users\\Deema\\OneDrive\\Desktop\\orange.png");
		JButton btn3 = new JButton(icon3);
		
		JButton btn4 = new JButton("Play Again");
		
		//size for the pictures button
		btn1.setBounds(50,50,icon1.getIconWidth(), icon1.getIconHeight());
		btn2.setBounds(50,50,icon2.getIconWidth(), icon2.getIconHeight());
		btn3.setBounds(50,50,icon3.getIconWidth(), icon3.getIconHeight());
//		if(label.getText().compareToIgnoreCase("apple")) {
//			JOptionPane.showMessageDialog(null,  "apple");
//		}else {
//			JOptionPane.showMessageDialog(null,  "wrong");
//		}
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(label.getText().equalsIgnoreCase("apple")) {
					JOptionPane.showMessageDialog(null,  "apple");
				}else {
					JOptionPane.showMessageDialog(null,  "wrong");
				}
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(label.getText().equalsIgnoreCase("banana")) {
					JOptionPane.showMessageDialog(null,  "banana");
				}else {
					JOptionPane.showMessageDialog(null,  "wrong");
				}
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(label.getText().equalsIgnoreCase("orange")) {
					JOptionPane.showMessageDialog(null,  "orange");
				}else {
					JOptionPane.showMessageDialog(null,  "wrong");
				}
				
			}
		});
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(message[rndm.nextInt(3)]);
			}
			
		});
		
		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		frame.add(panel);
		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		

		}
}