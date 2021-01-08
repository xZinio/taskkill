package M;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Main {

    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.BLACK,3);

        var logo = new ImageIcon("logo.jpg", "Das bist das Logo!");

        ImageIcon image = new ImageIcon("logo.jpg", "Das bist das Logo!");

        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(59, 325, 500, 62);
        whitePanel.setOpaque(true);
        whitePanel.setVisible(true);
        
        JLabel label = new JLabel();
        label.setText("Taskkiller");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xFFFFFF));
        label.setFont(new Font("Arial Black",Font.PLAIN,20)); //Font auswählen
        label.setIconTextGap(100); //Gap Text - Image
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setIcon(image);

        JButton processKillerInput = new JButton();
        processKillerInput.setBounds(476, 341, 65, 30);
        processKillerInput.setSize(65,30);
        processKillerInput.setBackground(new Color(0xE1E1E1));
        processKillerInput.setVisible(true);

        JButton loopKillerInput = new JButton();
        loopKillerInput.setBounds(510, 331, 65, 30);
        loopKillerInput.setSize(65, 30);
        loopKillerInput.setVisible(true);
        loopKillerInput.setBackground(Color.blue);

        JFrame frame = new JFrame();
        frame.setTitle("Taskkiller Win64x made by Zinio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(637, 526);
        frame.setVisible(true);
        frame.add(label);
        frame.add(processKillerInput);
        frame.add(whitePanel);
        

       
        frame.getContentPane().setBackground(Color.BLACK);

        frame.setIconImage(logo.getImage());
    
    }
}
