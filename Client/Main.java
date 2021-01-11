package src;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Main {

    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

        var logo = new ImageIcon(".//lib//logo.jpg", "-");

        ImageIcon image = new ImageIcon(".//lib//logo.jpg", "-");

        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(59, 360, 500, 62);
        whitePanel.setOpaque(true);
        whitePanel.setVisible(true);

        JPanel whitePanel2 = new JPanel();
        whitePanel2.setBackground(Color.white);
        whitePanel2.setBounds(59, 290, 500, 62);
        whitePanel2.setOpaque(true);
        whitePanel2.setVisible(true);
        
        JLabel label = new JLabel();
        label.setLocation(200, 100);
        label.setSize(184, 184);
        label.setForeground(Color.white);
        label.setBackground(Color.BLACK);
        label.setIconTextGap(100); //Gap Text - Image
        label.setBorder(border);
        label.setIcon(image);
        label.setOpaque(true);
        label.setVisible(true);

        JTextField textField = new JTextField();
        textField.setBounds(75, 376, 300, 30);

        JTextField textField2 = new JTextField();
        textField2.setBounds(75, 306, 300, 30);

        JLabel label2 = new JLabel();
        label2.setText("Taskkiller");
        label2.setSize(400, 50);
        label2.setLocation(250, 7);
        label2.setFont(new Font("Arial Black",Font.PLAIN,20));
        label2.setForeground(Color.white);
        label2.setBackground(Color.BLACK);
        label2.setOpaque(true);
        label2.setVisible(true);

        JOptionPane processConfirm = new JOptionPane();

        JButton processKillerInput = new JButton();
        processKillerInput.setBounds(390, 376, 65, 30);
        processKillerInput.setSize(65,30);
        processKillerInput.setBackground(new Color(0xE1E1E1));
        processKillerInput.setVisible(true);
        processKillerInput.setText("Kill");
        processKillerInput.setFocusable(false);
        processKillerInput.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Process killed.");
			}
        });

        JButton processKillerInput2 = new JButton();
        processKillerInput2.setBounds(390, 306, 65, 30);
        processKillerInput2.setSize(65,30);
        processKillerInput2.setBackground(new Color(0xE1E1E1));
        processKillerInput2.setVisible(true);
        processKillerInput2.setText("Kill");
        processKillerInput2.setFocusable(false);
        processKillerInput2.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Process killed.");
			}
        });

        JButton loopKillerInput = new JButton();
        loopKillerInput.setBounds(476, 376, 65, 30);
        loopKillerInput.setSize(65, 30);
        loopKillerInput.setVisible(true);
        loopKillerInput.setBackground(new Color(0xE1E1E1));
        loopKillerInput.setText("Loop");
        loopKillerInput.setOpaque(true);
        loopKillerInput.setFocusable(false);
        loopKillerInput.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Loop killing started, end program to stop.");
			}
        });

        JButton loopKillerInput2 = new JButton();
        loopKillerInput2.setBounds(476, 306, 65, 30);
        loopKillerInput2.setSize(65, 30);
        loopKillerInput2.setVisible(true);
        loopKillerInput2.setBackground(new Color(0xE1E1E1));
        loopKillerInput2.setText("Loop");
        loopKillerInput2.setOpaque(true);
        loopKillerInput2.setFocusable(false);
        loopKillerInput2.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Loop killing started, end program to stop.");
			}
        });

        JFrame frame = new JFrame();
        frame.setTitle("Taskkiller Win64x made by Zinio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.add(label);
        frame.add(label2);
        frame.add(processKillerInput);
        frame.add(processKillerInput2);
        frame.add(loopKillerInput);
        frame.add(loopKillerInput2);
        frame.add(whitePanel);
        frame.add(whitePanel2);
        frame.add(textField);
        frame.add(textField2);
        frame.add(processConfirm);
        frame.setSize(637, 526);
        frame.setVisible(true);
        
        
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setIconImage(logo.getImage());
    }
}
