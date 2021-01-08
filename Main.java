package Client;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class Main {

    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.BLACK,3);

        JLabel label = new JLabel();
        label.setText("Taskkiller");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("Arial Black",Font.PLAIN,20)); //Font auswählen
        label.setIconTextGap(100); //Gap Text - Image
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setTitle("Taskkiller Win64x made by Carlos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(637, 526);
        frame.setVisible(true);
        frame.add(label);

        ImageIcon logo = new ImageIcon(".//res//logo.jpg");
        frame.getContentPane().setBackground(Color.WHITE);

        frame.setIconImage(logo.getImage());
    
    }
}